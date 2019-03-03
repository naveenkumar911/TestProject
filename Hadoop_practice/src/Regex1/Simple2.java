package Regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Simple2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			//int counter = 0;
			//Pattern p = Pattern.compile("[987][0-9]{9}");
			Pattern p = Pattern.compile("[[a-z][A-Z][0-9]][@gmail.com]");
			Matcher m = p.matcher("My email id is naveenkumar23@gmail.com");
			while(m.find())
			{
				//counter++;
				//System.out.println(counter);
				//System.out.println(m.start() + " " + m.end() + " " + m.group());
				System.out.println(m.start() + " " + m.end() + " " + m.group());
			}
			
			//System.out.println(counter);
			
	}

}
