import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N1,N2,N3,Menor;
		
		System.out.print("Primeiro valor: ");
		N1 = sc.nextInt();
		System.out.print("Segundo valor: ");
		N2 = sc.nextInt();
		System.out.print("terceiro valor ");
		N3 = sc.nextInt();
		
		if (N1 < N2 && N1 < N3 ) {
			
			Menor = N1;
		}
		else if (N2 < N3) {
			
			Menor = N2;
		}
		else {
			Menor = N3;
		}

	  System.out.print("Menor = " + Menor);
	  
	  
	  sc.close();
	}
	

}
