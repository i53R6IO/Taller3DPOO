package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.persistencia.CentralPersistencia;
import uniandes.dpoo.aerolinea.persistencia.IPersistenciaAerolinea;
import uniandes.dpoo.aerolinea.persistencia.IPersistenciaTiquetes;
import uniandes.dpoo.aerolinea.persistencia.TipoInvalidoException;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Tiquete {
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	private Cliente cliente;
	
	
	public Tiquete(String codigo, Vuelo vuelo, Cliente cliente, int tarifa) {
		super();
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.vuelo = vuelo;
		this.cliente = cliente;
	}


	public String getCodigo() {
		return codigo;
	}


	public int getTarifa() {
		return tarifa;
	}


	public boolean esUsado() {
		return usado;
	}


	public Vuelo getVuelo() {
		return vuelo;
	}


	public Cliente getCliente() {
		return cliente;
	}
	
	public void marcarComoUsado() {
		this.usado = true;
	}
	
}
