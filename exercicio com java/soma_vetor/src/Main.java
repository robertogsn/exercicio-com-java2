import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
     
	 Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
     

     int N;
   
     System.out.print("quantos numeros voce vai digitar");
     N = sc.nextInt();
     
     double soma,media;
     double[] vet = new double[N];
     
     for(int i=0; i<N; i++) {
     System.out.print("digite um numero: ");
     vet[i] = sc.nextDouble();
    
     }
     soma = 0;
     System.out.print("\nValores = ");
     for (int i=0; i<N; i++) {
    	 System.out.print(vet[i] + " ");
    	 soma = soma + vet[i];
     }
	            
     System.out.println("\nsoma = "+ String.format("%.2f", soma));
     media = soma/N;
     System.out.println("media = "+ String.format("%.2f",media));
     
     sc.close();
	
	}	
}
