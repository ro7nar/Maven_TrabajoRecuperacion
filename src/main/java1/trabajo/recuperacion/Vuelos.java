package trabajo.recuperacion;

public class Vuelos extends MainVoleteria {

	// Atributos comunes
	private String codigoVuelo;
	private String destino;
	
	private int precio;
	// Segun tipo de vuelo
	// Vuelo Comercial
	private String codigoTrabajo;
	// Vuelo Vacacional
	private String codigoDescuento;

	// Metodos SET y GET

	public String getCodigoVuelo() {
		return codigoVuelo;
	}

	public void setCodigoVuelo(String codigoVuelo) {
		this.codigoVuelo = codigoVuelo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}



	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getCodigoTrabajo() {
		return codigoTrabajo;
	}

	public void setCodigoTrabajo(String codigoTrabajo) {
		this.codigoTrabajo = codigoTrabajo;
	}

	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}

	@Override
	public String toString() {
		return "Lista de Vuelos:\n"
				+ "Codigo de Vuelo= " + codigoVuelo + ":Destino= " + destino 
				+ ":Precio= " + precio ;
	}
	
	//metodo
	

}
