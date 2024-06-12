package LPAlore;
import java.util.Scanner;
public class Lpaaula43 {

	public static void main(String[] args) {
	 Scanner ler = new Scanner (System.in);
	 int A;
	 int soma=0;
	 
	 for(int i=0; i<=15; i++) {
	  
	 A = ler.nextInt();
	 soma = soma+A;
	 System.out.println("A soma resulta em: "+soma);
	 }
	}
}
