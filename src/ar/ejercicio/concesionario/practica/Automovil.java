package ar.ejercicio.concesionario.practica;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Automovil extends Vehiculo{
	
	private Integer puertas;
	
	
	public Automovil(String patente,String modelo,String marca, Double precio,Integer puertas) {
		super(patente, modelo, marca, precio);
	
		this.patente = patente;
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.puertas = puertas;
	}

	
	
	public Integer getPuertas() {
		return puertas;
	}

	public void setPuertas(Integer puertas) {
		this.puertas = puertas;
	}
	@Override
	public String getNombreMarca() {
		
		return this.marca;
	}

	@Override
	public String getNombreModelo() {
		
		return this.modelo;
	}



	@Override
	public String getPatente() {
	
		return this.patente;
	}

	@Override
	public void setPatente(String patente) {
		
		this.patente = patente;
	}

	@Override
	public Double getPrecio() {
		 return precio;
	}

	@Override
	public void setPrecio(Double precio) {
	
		this.precio = precio;
	}

	@Override
	public void setNombreMarca(String marca) {

		this.marca = marca;
	}

	@Override
	public void setNombreModelo(String modelo) {
		
		this.modelo = modelo;
	}

	
	
	@Override
	public int compareTo(Vehiculo vehiculo) {
		
		if(getPrecio()<vehiculo.getPrecio()){return 1;}
		   else if(getPrecio()>vehiculo.getPrecio()){return -1;}
		   else{return 0;}
		  
		
	}
	
	public String toString() {
		String listado = "";
		 NumberFormat anotherFormat = NumberFormat.getNumberInstance(Locale.GERMAN);
		 if (anotherFormat instanceof DecimalFormat) {
	            DecimalFormat anotherDFormat = (DecimalFormat) anotherFormat;
	            anotherDFormat.applyPattern("#.00");
	            anotherDFormat.setGroupingUsed(true);
	            anotherDFormat.setGroupingSize(3);
		listado += "Marca: "+ getNombreMarca() + " // " + "Modelo: " + getNombreModelo() + " // "+ "Puertas: "+ getPuertas() + " // " + "Precio: $" +  anotherDFormat.format(getPrecio())+ "\n";
		 }
		return listado;
	}
}
