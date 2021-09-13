
public class matrixMulti {
	
	public static void main(String[] args) {
		
		int x[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int y[][] = {{9,8,7},{6,5,4},{3,2,1}};
		
		int z[][] = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				z[i][j] = 0;
				
				for(int k = 0; k < 3; k++) {
					
					z[i][j]+= x[i][k] * y[k][j];
					
				}
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
	}
}
