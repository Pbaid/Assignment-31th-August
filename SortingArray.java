
public class SortingArray {
	
	public static void main(String[] args) 
	{
		int  ar[]= {88,22,33,11,66,55,77};
		int temp=0;
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+"");
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}			
				}
		}
		System.out.println();
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+"");
		}
	}


}
