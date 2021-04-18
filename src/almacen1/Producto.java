package almacen1;

public class Producto {
	private String nombre_producto;
	private String valor;
//	private double factura;
	
	public Producto() {
		super();
		this.nombre_producto = nombre_producto;
		this.valor = valor;
//		this.factura = factura;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
/*	public double getFactura() {
		return factura;
	}
	public void setFactura(double d) {
		this.factura = d;
	}
*/	

}
