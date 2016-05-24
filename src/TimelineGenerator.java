import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class TimelineGenerator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String line;
		String[] values = new String[3];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of records for generating Timeline");
		int num=sc.nextInt();
	
			BufferedReader brd = new BufferedReader(new FileReader("/home/hduser/ScalaWorkspace/Advanced_Security_Thread_Analyser/dataset/riskScore.csv"));
			BufferedWriter bwe = new BufferedWriter(new FileWriter("/home/hduser/ScalaWorkspace/Advanced_Security_Thread_Analyser/dataset/timeLine.csv"));
		/*	HashMap<String,ArrayList<Double>> iphmap = new HashMap<String,ArrayList<Double>>();
			
			Date date = new Date();
			
			while(num-->0) {		
				line = brd.readLine();
				values = line.split(",");
				
				if(!iphmap.containsKey(values[1]))
				{	
					ArrayList<Double> al = new ArrayList<Double>();		
					al.add(Double.parseDouble(values[2]));
					iphmap.put(values[1],al);
				}
				
				}
			//System.out.print("\t" + iphmap);
			 for(Map.Entry m:iphmap.entrySet()){ 
				 bwe.write((m.getKey()+", "+ m.getValue()+"\n"));  
			}
 */
			
			Map<String, ArrayList<Double>> container = new HashMap<String, ArrayList<Double>>();

			while(num-->0) {		
				line = brd.readLine();
				values = line.split(",");
				
				ArrayList<Double> value = container.get(values[1]);
			    if (value == null) {
			        value = new ArrayList<Double>();
			    }
			    value.add(Double.parseDouble(values[2]));
			    container.put(values[1], value);
			}
			for(Map.Entry m:container.entrySet()){ 
				 bwe.write((m.getKey()+", "+ m.getValue()+"\n"));  
			}
			System.out.println("Timeline generated Successfully and Scored in timeLine.csv" );
			bwe.close();
			brd.close();

}
}