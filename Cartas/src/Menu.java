
public class Menu extends Tablero {

	public void Opciones() {
		System.out.println("1-Nueva Partida");
		System.out.println("2-Reglas");
		int opc = this.leer.nextInt();
		if (opc == 1) {
			System.out.flush();
			this.Jugada();
		} else {
			System.out.println("Valor de las cartas");
			System.out.println(
					"El As puede valer 1 punto u 11 puntos según el deseo de combinarlo con la otra carta de la mano. No hay que olvidar que la máxima puntuación ganadora es de 21 puntos.");
			System.out.println("Los números del 2 al 10, equivalen a su propio valor. Por ejemplo si tiene dos cartas de 8, la mano tiene valor de 16 puntos y es aconsejable dividir las cartas en dos manos separadas.");
			System.out.println("Cartas con figuras (Jota, Dama, Rey) valen cada una 10 puntos.");
			System.out.println("El objetivo es de tener al final del juego una puntuación de 21");
			Opciones();
		}
	}
}
