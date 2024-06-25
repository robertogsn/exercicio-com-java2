import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
		System.out.print("Base do retangulo: ");
		double base = sc.nextDouble();
		System.out.print("altura do retangulo: ");
		double altura = sc.nextDouble();
		
		double area = base*altura;
		double p = 2*(base + altura);
		double d = Math.sqrt(Math.pow(base,2.0)+ Math.pow(altura, 2.0));
		
		System.out.print("area = "+ String.format("%.4f",area));
		System.out.print("\nPerimetro = " + String.format("%.4f",p));
		System.out.print("\nDiagonal = " + String.format("%.3f",d));
		
		
		sc.close();
		
	}

}
