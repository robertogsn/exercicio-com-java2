
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("quantas linhas vai ter a matriz? ");
		int n = sc.nextInt();
	    System.out.print("quantas colunas vai ter a matriz? ");
	    int m = sc.nextInt();
	    
	    int[][] mat = new int[n][m];
	    
	    for(int i=0; i<n; i++) {
	      for(int j=0; j<m; j++) {
	    	  System.out.print("elemento [" + i + "," + j + "]: ");
	    	  mat[i][j] = sc.nextInt();
	      }
  	  }
	    System.out.println("\nMatriz digitada: ");
	    	  for(int i=0; i<n; i++) {
	    	      for(int j=0; j<m; j++) {
	    	  System.out.print(mat[i][j] + " ");
	    	 
	    	 
	      }
	    	System.out.println();      
	    }
	    	  sc.close();
	}
}
