import java.io.*;

public class WordCount {
	
	public static void main(String[] args) throws IOException{
		int wordCount = 0;
		int numberCount = 0;
		String str = "12, Rutherford Building, Lake Street, Chichago-29";
		StringReader sr = new StringReader(str);
		StreamTokenizer str1 = new StreamTokenizer(sr);
		
		while(str1.nextToken() != str1.TT_EOF) {
			if(str1.ttype==str1.TT_WORD) {
				wordCount++;
			}
			else if(str1.ttype==str1.TT_NUMBER) {
				numberCount++;
			}
		}
		System.out.println("Number of words in the sentence: "+wordCount);
		System.out.println("Number of numbers in the sentence: "+numberCount);
	}

}
