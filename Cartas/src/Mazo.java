
public class Mazo extends Jugador {

	String[] tipo = { "pica", "trebol", "corazon", "diamante" };
	int[] numero = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	String[] letra = { "J", "Q", "K", "A" };
	int l;

	public void test() {
		int i = (int) (Math.random() * 2);
		if (i == 0) {
			l=0;
			mostrar();
		} else {
			l=10;
			mostrar();
		}
	}

	public int repartir() {
		int j = (int) (Math.random() * 9);
		l = numero[j];
		return l;
	}

	public String repartir2() {
		int j2 = (int) (Math.random() * 4);
		switch (letra[j2]) {
		case "J":
			l = 10;
			return letra[j2];
		case "Q":
			l = 10;
			return letra[j2];
		case "K":
			l = 10;
			return letra[j2];
		case "A":
			this.preguntar();
			l = super.A;
			return letra[j2];
		}
		return null;
	}

	public String tipoCarta() {
		int i = (int) (Math.random() * 3);
		return tipo[i];
	}

	public void mostrar() {
		if (l < 10) {
			System.out.println(repartir() + " " + tipoCarta());
		} else {
			System.out.println(repartir2() + " " + tipoCarta());
		}

	}
}
