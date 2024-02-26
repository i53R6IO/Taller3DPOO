package uniandes.dpoo.aerolinea.modelo;

import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
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

public class Vuelo{
	private String fecha;
	private Avion avion;
	private Ruta ruta;
	private Map<String,Tiquete> tiquetes;
	
	public String getFecha() {
		return fecha;
	}
	public Avion getAvion() {
		return avion;
	}
	public Ruta getRuta() {
		return ruta;
	}
	public Collection<Tiquete> getTiquetes() {
		return tiquetes;
	}
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		return 0;
	}
    public boolean equals(Object obj) {
        return (this == obj);
	}
}
