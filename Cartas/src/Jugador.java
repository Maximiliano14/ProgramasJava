import java.util.Scanner;

public class Jugador {
	public int A;
	public String aux;
	Scanner leer = new Scanner(System.in);
	
	public String nombre() {
		String nick;
		System.out.println("Ingrese su nick");
		nick=leer.next();
		aux=nick;
		return nick;
	}
	
	public void preguntar() {
		System.out.println("Cuanto quiere que sea el valor de 'A': 1 o 11?");
		A=leer.nextInt();	
	}
}
