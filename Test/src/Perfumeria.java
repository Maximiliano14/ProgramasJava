
public class Perfumeria extends Producto {

	public Perfumeria(String nom, int pre, double can, String uni) {
		super(nom, pre, can, uni);
		// TODO Auto-generated constructor stub
	}

	public void CargarMostrar() {
		String[] nomb = { "Shampoo Sedal" };
		int[] prec = { 19 };
		double[] cant = { 500 };

		for (int i = 0; i < nomb.length; i++) {
			this.setNombre(nomb[i]);
			this.setCantidad(cant[i]);
			this.setPrecio(prec[i]);
			System.out.println(this.toString());
			MayorMenor();
		}
	}

	public String toString() {
		return "Nombre: " + this.getNombre() + " /// " + "Cantidad: " + (int) this.getCantidad() + " /// " + "Precio: $"
				+ this.getPrecio();
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