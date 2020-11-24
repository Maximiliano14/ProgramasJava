
public class Fruteria extends Producto {

	public Fruteria(String nom, int pre, double can, String uni) {
		super(nom, pre, can, uni);
		// TODO Auto-generated constructor stub
	}

	public void CargarMostrar() {
		String[] nomb = { "Frutilla" };
		int[] prec = { 64 };
		String[] un = { "kilo" };

		for (int i = 0; i < nomb.length; i++) {
			this.setNombre(nomb[i]);
			this.setUnidad(un[i]);
			this.setPrecio(prec[i]);
			System.out.println(this.toString());
			MayorMenor();
		}
	}

	public String toString() {
		return "Nombre: " + this.getNombre() + " /// " + "Precio: $" + this.getPrecio() + " /// " + " Unidad de venta: "
				+ this.getUnidad();
	}

	public void MayorMenor() {
		if (this.getPrecio() > Producto.mayor) {
			Producto.mayor = this.getPrecio();
			Producto.prodMAX = this.getNombre();
		} else if (this.getPrecio() < Producto.menor) {
			Producto.menor = this.getPrecio();
			Producto.prodMIN = this.getNombre();
		}
	}
}