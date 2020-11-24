
public class Main {

	public static void main(String[] args) {
		
		Producto producto=new Producto(null, 0, 0, null);
		Bebida bebida = new Bebida(null, 0, 0, null);
		Perfumeria perfumeria = new Perfumeria(null, 0, 0, null);
		Fruteria fruteria = new Fruteria(null, 0, 0, null);

		bebida.CargarMostrar();
		perfumeria.CargarMostrar();
		fruteria.CargarMostrar();

		System.out.println("============================");
		
		System.out.println(producto.toString1());
	}
}
