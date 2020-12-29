package ar.ejercicio.concesionario.practica;

import java.util.HashSet;
import java.util.TreeSet;

public class Concesionario {
	private String nombre;
	private HashSet<Vehiculo> vehiculos;
	private TreeSet<Vehiculo> vehiculosOrdenados;
	public Concesionario (String nombre) {
		this.nombre = nombre;
		this.vehiculos = new HashSet<Vehiculo>();
		this.vehiculosOrdenados = new TreeSet<Vehiculo>();
	}
	
	public Boolean agregarAutomovil(Vehiculo nuevo) {
		if(nuevo!=null && buscarVehiculo(nuevo.getPatente())==null) {
			return vehiculos.add(nuevo);
		}
			return false;
	}
	
	public Vehiculo buscarVehiculo(String patente) {
		for (Vehiculo vehiculo : vehiculos) {
			if(patente != null)
			if(vehiculo.getPatente().equals(patente))
			return vehiculo;
		}
		return null;
	}
	
	public Vehiculo verVehiculoMasCaro() {
		Double precio=0.0;
		Vehiculo auxiliar = null;
		for (Vehiculo vehiculo : vehiculos) {
			if(auxiliar==null)
			auxiliar = vehiculo;	
			if(vehiculo.getPrecio()>auxiliar.getPrecio())
				auxiliar = vehiculo;
		}
		
		return auxiliar;
	}
	
	public Vehiculo verVehiculoMasBarato() {
		Double precio=0.0;
		Vehiculo auxiliar = null;
		
		for (Vehiculo vehiculo : vehiculos) {
			if(auxiliar ==null)
			auxiliar = vehiculo;	
			if(vehiculo.getPrecio()<auxiliar.getPrecio())
				auxiliar = vehiculo;
		}
	
		return auxiliar;
	}
	
	public Boolean buscarQueContengaLetra(Vehiculo vehiculoAAnalizar) {
			
				for (int i = 0; i < 	vehiculoAAnalizar.getNombreModelo().length(); i++) {
					if(vehiculoAAnalizar.getNombreModelo().charAt(i)=='Y')
						return true;
				}
			
			
			return false;
	}
	
	public Vehiculo verVehiculoQueContieneLetraY() {
		String letra = "Y";
		for (Vehiculo vehiculo : vehiculos) {
			if(buscarQueContengaLetra(vehiculo))
				return vehiculo;
			// Aca solo se busca el primer vehiculo que contenga esta letra como pide el problema, si hay más de uno habria que guardarlos y luego mostrarlos
		}
		return null;
	}
	
	public void ordenarVehiculosDeMayorAMenor() {
		
		this.vehiculosOrdenados.addAll(vehiculos);
		
	}
	
	public String verVehiculosOrdenadosPorPrecioDeMayorAMenor() {
		String listaDeVehiculosOrdenados = "";
		for (Vehiculo vehiculo : vehiculosOrdenados) {
			listaDeVehiculosOrdenados +=vehiculo.getNombreMarca() + " " + vehiculo.getNombreModelo()+ "\n";
		}
		return listaDeVehiculosOrdenados;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<Vehiculo> getVehiculos() {
		return this.vehiculos;
	}

	public void setVehiculos(HashSet<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public TreeSet<Vehiculo> getVehiculosOrdenados() {
		return this.vehiculosOrdenados;
	}

	public void setVehiculosOrdenados(TreeSet<Vehiculo> vehiculosOrdenados) {
		this.vehiculosOrdenados = vehiculosOrdenados;
	}
	
	
	
}
