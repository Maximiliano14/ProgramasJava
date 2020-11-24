
public class Producto {
	String nombre;
	int precio;
	double cantidad;
	String unidad;
	static int mayor;
	static int menor=99;
	static String prodMAX;
	static String prodMIN;

	public Producto(String nom, int pre, double can, String uni) {
		this.nombre = nom;
		this.precio = pre;
		this.cantidad = can;
		this.unidad = uni;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String UNI) {
		this.unidad = UNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String NOM) {
		this.nombre = NOM;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int PRE) {
		this.precio = PRE;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double CAN) {
		this.cantidad = CAN;
	}

	public void CargarMostrar() {

	}

	public void MayorMenor() {

	}

	public String toString() {
		return "";
	}

	public String toString1() {
		return "Producto más caro: "+prodMAX +"\nProducto más barato: " +prodMIN ;
	}

}