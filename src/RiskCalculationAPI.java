import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author hduser
 *
 */
public class RiskCalculationAPI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Map download_weight = new HashMap();
	download_weight.put("1024",1.0);
	download_weight.put("10240",1.0);
	download_weight.put("15856",1.0);
	download_weight.put("20480",1.0);
	download_weight.put("486541",6.0);
	download_weight.put("1048576",7.0);
	download_weight.put("10485760",7.5);
	download_weight.put("4194304",8.0);
	download_weight.put("1073741824",10.0);
	download_weight.put("10737418240",10.0);
	
	Map category_weight = new HashMap();
	
	category_weight.put("InformationTechnology",1.0);
	category_weight.put("ads",6.0);
	category_weight.put("banking",2.0);
	category_weight.put("beerliquorinfo",9.0);
	category_weight.put("blog",3.0);
	category_weight.put("chat",7.0);
	category_weight.put("dating",9.0);
	category_weight.put("ecommerce",2.0);
	category_weight.put("entertainment",5.0);
	category_weight.put("gambling",10.0);
	category_weight.put("games",8.0);
	category_weight.put("government",1.0);
	category_weight.put("hacking",6.0);
	category_weight.put("hygiene",1.0);
	category_weight.put("jobsearch",1.0);
	category_weight.put("mail",1.0);
	category_weight.put("news",1.0);
	category_weight.put("porn",10.0);
	category_weight.put("searchengines",1.0);
	category_weight.put("shopping",6.0);
	category_weight.put("socialnetworking",10.0);
	category_weight.put("sportnews",2.0);
	category_weight.put("sports",3.0);
	
	try {
		BufferedReader br = new BufferedReader(new FileReader("/home/hduser/ScalaWorkspace/Advanced_Security_Thread_Analyser/dataset/web_log_12_05.csv"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("/home/hduser/ScalaWorkspace/Advanced_Security_Thread_Analyser/dataset/riskScore.csv"));
		String line;
		String[] values = new String[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of records to be analysed");
		int i=sc.nextInt();
		Double risk = 0.0,download_risk = 0.0, category_risk = 0.0;
		System.out.println("Time" +", " + "IP" + ", " +"Score");
		//bw.write("Time" +","+ "IP" + "," + "Score" + "\n");
		while(i-->0) {
			
			line = br.readLine();
			values = line.split(",");
			if(download_weight.containsKey(values[4]))
			 {
//				download_risk = Double.parseDouble((String) download_weight.get(values[4]));
				download_risk = (Double) download_weight.get(values[4]);

				//System.out.println(download_risk);
			 }
			if(category_weight.containsKey(values[2]))
			 {
				category_risk = (Double) category_weight.get(values[2]);
				//System.out.println(category_risk);
			 }
			risk = (download_risk + category_risk)/2;
			System.out.println(values[0] +", " + values[1] + ", " +risk);
			bw.write(values[0] +","+ values[1] + "," + risk + "\n");
		}
		
		bw.close();
		br.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	}

}
