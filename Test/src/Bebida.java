
public class Bebida extends Producto {

	public Bebida(String nom, int pre, double can, String uni) {
		super(nom, pre, can, uni);
	}

	public void CargarMostrar() {
		String[] nomb = { "Coca-Cola Zero", "Coca-Cola" };
		int[] prec = { 20, 18 };
		double[] cant = { 1.5, 1.5 };

		for (int i = 0; i < nomb.length; i++) {
			this.setNombre(nomb[i]);
			this.setCantidad(cant[i]);
			this.setPrecio(prec[i]);
			System.out.println(this.toString());
			MayorMenor();
		}
	}

	public String toString() {
		return "Nombre: " + this.getNombre() + " /// " + "Cantidad: " + this.getCantidad() + " /// " + "Precio: $" + this.getPrecio();
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