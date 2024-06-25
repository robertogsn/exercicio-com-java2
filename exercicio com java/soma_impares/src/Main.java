import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
		
		int x,y,soma,troca;
		
		System.out.println("digite dois numeros:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x<y) {
	    	troca = x;
	    	x = y;
	    	y = troca;
	    }
		soma = 0;
		for	(int i = y+1; i<x; i++) {
		    if (i%2 != 0) { // mod
			soma = soma + i;
		    }	
		}
		System.out.println("Soma dos impares = " + soma);
		sc.close();
	}

}
