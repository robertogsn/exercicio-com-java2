import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int N,cont;
		
		System.out.print("Qual a ordem da matritz? ");
		N = sc.nextInt();
		
		int[][] mat = new int[N][N];
		
		for (int i=0; i<N; i++) {
			for( int j=0; j<N; j++) {
			System.out.print("Elemento ["+ i +","+j+"]: ");
			mat[i][j] = sc.nextInt();
			}
		}
         
		System.out.println("Diagonal principal: ");
		for (int i=0; i<N; i++) {
			for( int j=0; j<N; j++) {
			 if (i == j) {
				 System.out.print(mat[i][j]+ " ");
			 }
			}
		}
		
		cont = 0;
		for (int i = 0; i< N; i++) {
			for(int j= 0; j<N; j++) {
				if(mat[i][j] < 0 ) {
					cont++;
				}
			}
		}
		
	  System.out.println("quantidade de negativos = " + cont);
		sc.close();
	}
}

