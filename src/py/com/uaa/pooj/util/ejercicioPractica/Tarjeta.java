package py.com.uaa.pooj.util.ejercicioPractica;

public abstract class Tarjeta {
	
	public String nombreTitular ;
	public int nroTarjeta;
	
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public int getNroTarjeta() {
		return nroTarjeta;
	}
	public void setNroTarjeta(int nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}
	
	public  abstract String  compra(int resultado);
		
	

}
