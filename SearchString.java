import java.io.*;
public class SearchString {
	
	public static void main(String[] args)
		{
			String data = "Java is Object Oriented. Java is platform independent. Java is simple.";
			String word = "Java";
			String temp[] = data.split(" ");
			int count = 0;
			for (int i = 0; i< temp.length; i++)
			{
				if (word.equals(temp[i]))
					count++;
			}
			System.out.println("The string is: " + data);
			System.out.println("The word " + word + " occurs " + count + " times in the string");
			
		}
}
