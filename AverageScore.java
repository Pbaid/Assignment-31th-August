import java.util.Scanner;
public class AverageScore {
	
	public static void main(String[] args)
	{
		float Eng, Phy, Maths, Chem, Hin;
		double Average, Total, Percentage;
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter Marks of all Subjects");
		System.out.println("Enter the marks of English: ");
		Eng = S.nextFloat();
		System.out.println("Enter the marks of Physics: ");
		Phy = S.nextFloat();
		System.out.println("Enter the marks of Maths: ");
		Maths = S.nextFloat();
		System.out.println("Enter the marks of Chemistry: ");
		Chem = S.nextFloat();
		System.out.println("Enter the marks of Hindi: ");
		Hin = S.nextFloat();
		
		Total = Eng + Phy + Maths + Chem + Hin;
		Average = (Total / 5);
		Percentage = (Total / 500) * 100;
		System.out.println("Average is: " + Average);
		System.out.println("Percentage Gained: " + Percentage);
	}
}
