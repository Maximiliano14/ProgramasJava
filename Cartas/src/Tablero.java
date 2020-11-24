
public class Tablero extends Mazo {
	int suma=0;
	
	public void Jugada() {
		boolean teclado=true;
		
		this.nombre();
		System.out.println("Repartiendo Cartas");
		System.out.println(".....");
		do {
			System.out.println("Tu carta es: ");
			this.test();
			suma= this.l+suma;
			System.out.println("Quiere otra carta? true/false");
			teclado=this.leer.nextBoolean();
		}while(teclado==true);
		verificar();
	}
	
	public void verificar() {
		if(suma == 21) {
			System.out.println("AH GANADO!!!! "+ this.aux);
		}else {
			System.out.println("AH PERDIDO! "+ this.aux);
		}
	}
}
