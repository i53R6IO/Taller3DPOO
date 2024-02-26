package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class ClienteNatural extends Cliente{

	public String NATURAL = "Natural";
	private String nombre;
	
	public ClienteNatural(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String getTipoCliente() {
		// TODO terminar
		return null;
	}

	@Override
	public String getIdentificador() {
		// TODO terminar
		return null;
	}
	
}
