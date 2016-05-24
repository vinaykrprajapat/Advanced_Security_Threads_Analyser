import java.awt.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Loggenerator {
 public static void main(String args[]) throws IOException{
	 ArrayList<String> ip = new ArrayList<String>();
     ip.add("10.10.8.193");
     ip.add("10.10.8.195");
     ip.add("10.7.3.57");
     ip.add("10.10.2.14");
     ip.add("10.10.4.170");
     ip.add("10.10.13.163");
     ip.add("10.10.3.7");
     ip.add("10.10.2.57");
     ip.add("10.10.3.65");
     ip.add("10.7.3.154");
     ip.add("10.7.2.114");
     
     ArrayList<String> datetime = new ArrayList<String>();
     datetime.add("2016-04-02 12:03:56");
     datetime.add("2016-04-03 15:03:56");
     datetime.add("2016-04-02 18:03:56");
     datetime.add("2016-04-03 19:03:56");
     datetime.add("2016-04-02 22:03:56");
     datetime.add("2016-04-03 21:03:56");
     datetime.add("2016-04-02 00:03:56");
     datetime.add("2016-04-03 01:03:56");
     datetime.add("2016-04-02 05:03:56");
     datetime.add("2016-04-04 16:03:56");
     datetime.add("2016-04-04 15:03:56");
     datetime.add("2016-04-04 12:13:56");
     datetime.add("2016-04-04 11:43:56");
     datetime.add("2016-04-04 06:03:16");
     datetime.add("2016-04-04 18:53:56");
     datetime.add("2016-04-04 10:00:06");
     datetime.add("2016-04-04 22:05:56");
     datetime.add("2016-04-03 15:26:56");
     datetime.add("2016-04-03 12:13:56");
     datetime.add("2016-04-03 11:33:56");
     datetime.add("2016-04-03 06:13:16");
     datetime.add("2016-04-03 18:54:56");
     datetime.add("2016-04-03 10:20:06");
     datetime.add("2016-04-03 22:53:56");
     datetime.add("2016-04-02 15:09:56");
     datetime.add("2016-04-02 12:14:56");
     datetime.add("2016-04-02 11:41:56");
     datetime.add("2016-04-02 06:44:16");
     datetime.add("2016-04-02 18:33:56");
     datetime.add("2016-04-02 10:40:06");
     datetime.add("2016-04-02 22:23:56");
     
     ArrayList<String> category = new ArrayList<String>();
     ArrayList<String> domain = new ArrayList<String>();
     category.add("InformationTechnology");
     domain.add("techgig.com");
     domain.add("wipro.com");
     domain.add("hackerrank.com");
     
     category.add("ads");
     domain.add("techads.com");
     domain.add("timesads.com");
     domain.add("ouradsconsultancy.com");
//     category.add("adult");
//     category.add("aggressive");
//     category.add("antispyware");
//     category.add("artnudes");
//     category.add("astrology");
     
     category.add("banking");
     domain.add("sbi.com");
     domain.add("icici.com");
     domain.add("idbi.com");
     //domain.add("pnb.com");
     
     category.add("beerliquorinfo");
     domain.add("liquor.com");
     domain.add("liquorinfo.com");
     domain.add("goliquor.com");
     
     category.add("blog");
     domain.add("gomilitary.in");
     domain.add("gatehelpline.com");
     domain.add("gate2017.info");
//     category.add("cellphones");
     
     category.add("chat");
     domain.add("chat.gmail.com");
     domain.add("chat.yahoo.com");
     domain.add("chat.bing.com");
//     category.add("childcare");
//     category.add("cleaning");
//     category.add("clothing");
//     category.add("contraception");
//     category.add("culnary");
     category.add("dating");
     domain.add("shadi.com");
     domain.add("wedding.com");
     domain.add("jeevansathi.com");
     
//     category.add("desktopsillies");
//     category.add("dialers");
//     category.add("drugs");
     category.add("ecommerce");
     domain.add("paytm.com");
     domain.add("freerecharge.com");
     domain.add("airtel.com");
     
     category.add("entertainment");
     domain.add("hotstar.com");
     domain.add("colors.com");
     domain.add("sony.com");
     
//     category.add("filehosting");
//     category.add("frencheducation");
     category.add("gambling");
     domain.add("onlinegambling.com");
     domain.add("gambling.com");
     domain.add("gamble.com");
     
     category.add("games");
     domain.add("counterstrike.com");
     domain.add("easygames.com");
     domain.add("EAGames.com");
     
//     category.add("gardening");
     category.add("government");
     domain.add("india.gov.in");
     domain.add("us.gov.in");
     domain.add("modi.gov.in");
     
//     category.add("guns");
     category.add("hacking");
     domain.add("hackhour.com");
     domain.add("allhack.com");
     domain.add("hackersroom.com");
     
//     category.add("homerepair");
     category.add("hygiene");
     domain.add("fresh.com");
     domain.add("hygiene.com");
     domain.add("hygieneforall.com");
     
//     category.add("instantmessaging");
//     category.add("jewelry");
     category.add("jobsearch");
     domain.add("shine.com");
     domain.add("naukari.com");
     domain.add("jobs.com");
     
//     category.add("kidstimewasting");
     category.add("mail");
     domain.add("gmail.com");
     domain.add("yaho.mail.com");
     domain.add("microsoft.com");
     
//     category.add("marketingware");
//     category.add("medical");
//     category.add("mixedadult");
//     category.add("naturism");
     category.add("news");
     domain.add("starnews.com");
     domain.add("aajtak.com");
     domain.add("news24.com");
     
//     category.add("onlineauctions");
//     category.add("onlinegames");
//     category.add("onlinepayment");
//     category.add("personalfinance");
//     category.add("pets");
//     category.add("phishing");
     category.add("porn");
     domain.add("xxx.com");
     domain.add("porn.com");
     domain.add("xporn.com");
     
//     category.add("proxy");
//     category.add("radio");
//     category.add("religion");
//     category.add("ringtones");
     category.add("searchengines");
     domain.add("google.com");
     domain.add("bing.com");
     domain.add("yahoo.com");
     
//     category.add("sexuality");
//     category.add("sexualityeducation");
     category.add("shopping");
     domain.add("flipkart.com");
     domain.add("amazon.com");
     domain.add("zabong.com");
     
     category.add("socialnetworking");
     domain.add("facebook.com");
     domain.add("googleplus.com");
     domain.add("watsapp.com");
     
//     category.add("sportnews");
     category.add("sports");
     domain.add("starsports.com");
     domain.add("tensports.com");
     domain.add("hdcricket.com");
     
//     category.add("spyware");
//     category.add("updatesites");
//     category.add("vacation");
//     category.add("violence");
//     category.add("virusinfected");
//     category.add("warez");
//     category.add("weather");
//     category.add("weapons");
//     category.add("webmail");
//     category.add("whitelist");  // total 71 http://urlblacklist.com/?sec=download
     
  
     ArrayList<String> bytes = new ArrayList<String>();
     bytes.add("1024");
     bytes.add("1048576");
     bytes.add("1073741824");
     bytes.add("10240");
     bytes.add("10485760");
     bytes.add("10737418240");
     bytes.add("20480");
     bytes.add("4194304");
     bytes.add("15856");
     bytes.add("486541");
     
     ArrayList<String> activity = new ArrayList<String>();
     activity.add("copying");
     activity.add("moving");
     activity.add("uploading");
     activity.add("downloading");
     activity.add("streaming");
     activity.add("crawling");
     activity.add("surfing");
     activity.add("deleting");
     
     ArrayList<String> file = new ArrayList<String>();
     file.add("file1");
     file.add("file2");
     file.add("file3");
     file.add("file4");
     file.add("file5");
     file.add("file6");
     file.add("file7");
     file.add("file8");
     file.add("file9");
     file.add("file10");
     file.add("file11");
     
     ArrayList<String> userrole = new ArrayList<String>();
     userrole.add("admin");
     userrole.add("employee");
     userrole.add("faculity");
     userrole.add("pgstudents");
     userrole.add("ugstudents");
     userrole.add("diplomastudents");
     userrole.add("guest");
     
   
     int max = 9, min = 0, maxcat = 23, mactivity = 8, mfile = 11, murole=7, maxtime = 30; 
     int i=0;
 	BufferedWriter bw = new BufferedWriter(new FileWriter("/home/hduser/ScalaWorkspace/LogAnalyser/dataset/web_log_12_05.csv"));
 	try{
		while(i < 100000) {
			 try{
				 Random rand = new Random();
				 Random rand1 = new Random();  
				 Random rand2 = new Random(); 
				 Random rand3 = new Random();
				 Random rand4 = new Random();
				 
				 int randomNum = rand.nextInt((max - min) + 1) + min;
				 int randomNum1 = rand1.nextInt((max - min) + 1) + min;
				 int randomNum2 = rand2.nextInt((maxcat - min) + 1) + min;
				 int randomNum3 = rand3.nextInt((max - min) + 1) + min;
				 int randomNum4 = rand4.nextInt((maxtime - min) + 1) + min;
					bw.write(datetime.get(randomNum4) +","+ ip.get(randomNum1) +","+ category.get(randomNum2)+","+ domain.get(randomNum2*3) +","+ bytes.get(randomNum3) + "\n");
			 }
			 catch(Exception mm){continue;}
		i++;	
		}
		if(i>=19999)
		{
			System.out.println("Web Logs generated Successfully!");
		}
	}
	catch(Exception en){System.out.println(en);}
	bw.close();     
	
	

	 int j=0;
	 	BufferedWriter bwa = new BufferedWriter(new FileWriter("/home/hduser/ScalaWorkspace/LogAnalyser/dataset/ad_log_12_05.csv"));
	 	try{
			while(j < 200) {
				 try{	
					 Random randdt = new Random();
					 int randomNumdt = randdt.nextInt((max - min) + 1) + min;
					 Random randip = new Random();
					 int randomNumip = randip.nextInt((max - min) + 1) + min;
					 Random randur = new Random();
					 int randomNumur = randur.nextInt((murole - min) + 1) + min;
					 Random randf = new Random();
					 int randomNumf = randf.nextInt((mfile - min) + 1) + min;
					 Random randa = new Random();
					 int randomNuma = randa.nextInt((mactivity - min) + 1) + min;
					 	bwa.write(datetime.get(randomNumdt) +","+ ip.get(randomNumip) +","+ userrole.get(randomNumur) +","+ file.get(randomNumf) +","+ activity.get(randomNuma) + "\n");
				 }
				 catch(Exception mm){continue;}
			j++;	
			}
			if(j>=199)
			{
				System.out.println("Logs generated Successfully!");
			}
		}
		catch(Exception en){System.out.println(en);}
		bw.close();     
		bwa.close();
 }
}
