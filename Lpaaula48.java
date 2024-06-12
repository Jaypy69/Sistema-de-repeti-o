package LPAlore;
import java.util.Scanner;
public class Lpaaula48 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
		
    int A=0;
	int soma=0;
	int i=1;
	
	while(i<11) {
    System.out.print("Coloque o " + i + " número: ");
    A = ler.nextInt();
    i++;
    soma = A+soma;
	}
	System.out.println("A soma destes números resulta em:"+soma);
	}
}
