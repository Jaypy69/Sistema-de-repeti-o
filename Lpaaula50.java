package LPAlore;
import java.util.Scanner;
public class Lpaaula50 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	int A;
	int soma=0;
	int media;
	
	for(int i=1; 1<=20; i++) {
		System.out.println("Coloque a idade da " + i + " pessoa ");
		A = ler.nextInt();
		soma = soma+A;
	
	System.out.println("A soma dessas idades se resulta em: "+soma);
	media = soma/20;
	System.out.println("A média das idades é: "+media);

	}

}
}