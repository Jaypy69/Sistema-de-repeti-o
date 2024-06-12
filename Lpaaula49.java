package LPAlore;
import java.util.Scanner;
public class Lpaaula49 {

	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		
		int A;
		int soma=0;
		
		for(int i=0; i<=20; i++) {
			System.out.print("Digite as idades de 20 indivíduos:");
			A = ler.nextInt();
			soma = soma+A;
			
			System.out.println("A soma destas idades resulta em:"+soma);
		}
	}
}
