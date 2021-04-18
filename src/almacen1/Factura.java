package almacen1;

public class Factura {
	private double factura;
	private String iva;
	private String valordomicilio;
	private int tiempo_de_entrega;
	
	public double getFactura() {
		return factura;
	}
	public void setFactura(double factura) {
		this.factura = factura;
	}
	public String getIva() {
		return iva;
	}
	public void setIva(String iva) {
		this.iva = iva;
	}
	
	public int getTiempo_de_entrega() {
		return tiempo_de_entrega;
	}
	public void setTiempo_de_entrega(int tiempo_de_entrega) {
		this.tiempo_de_entrega = tiempo_de_entrega;
	}
	public String getValordomicilio() {
		return valordomicilio;
	}
	public void setValordomicilio(String string) {
		this.valordomicilio = string;
	}
	public Factura() {
		super();
		this.factura = factura;
		this.iva = iva;
		this.valordomicilio = valordomicilio;
		this.tiempo_de_entrega = tiempo_de_entrega;
	}
	
	

}
