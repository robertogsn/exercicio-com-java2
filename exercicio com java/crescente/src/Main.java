import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int x,y;
	
	    System.out.println("digite dois numeros: ");
	   
	    x = sc.nextInt();
	    y = sc.nextInt();
	    
	    while (x != y) {
		  
		   if (x > y) {
			   System.out.println("Decrecente");
		   }
		   
		   else {
			   System.out.println("Crecente");
		   }
		 System.out.println("digite outros dois numeros: ");
		 x = sc.nextInt();
		 y = sc.nextInt();
	  
	    }	
		
	}

}
