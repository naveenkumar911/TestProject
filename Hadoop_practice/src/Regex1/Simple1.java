package Regex1;
//quantifiers program 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Simple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int counter = 0;
		Pattern p = Pattern.compile("a+");
		Matcher m = p.matcher("abcdeaabc");
		while(m.find())
		{
			counter++;
			//System.out.println(counter);
			System.out.println(m.start() + " " + m.end() + " " + m.group());
		}
		
		System.out.println(counter);
		
		}

}


// a* = a{0-n}
// a+ = a{1-n}
// a? = utmost one a 
// [abc] = a or b or c                                   
// [^abc] = other than abc
// [0-9] = 0 or 1 or till 2-9
// \\S except space character
// \\ d for number character
// \\D except number character
// \\w for alphanumeric character
// \\W except alphanumeric character
// . for any character