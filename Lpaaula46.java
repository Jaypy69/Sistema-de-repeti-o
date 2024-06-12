package LPAlore;
import java.util.Scanner;
public class Lpaaula46 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	    int A=0;
		String usuario;
		System.out.print("Digite seu nome de usuário:");
		usuario = ler.next();
		
		while(A<=20) {	
	    A++;
	    System.out.println("Seu nome de usuário é:"+usuario);
		}
	}
}
