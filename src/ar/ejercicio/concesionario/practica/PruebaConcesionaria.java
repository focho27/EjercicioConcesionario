package ar.ejercicio.concesionario.practica;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class PruebaConcesionaria {

	public static void main(String[] args) {
		Concesionario nuevo= new Concesionario("Todo vehiculos");
		NumberFormat anotherFormat = NumberFormat.getNumberInstance(Locale.GERMAN);
		String listadoConcesionario="";
		
		Vehiculo peugeot206 = new Automovil("AB198034","206","Peugeot",200000.00,4);
		Vehiculo peugeot208 = new Automovil("AB198044","208","Peugeot",250000.00,5);
		Vehiculo hondaTitan = new Moto("AB1456VV","Titan","Honda",60000.00,125);
		Vehiculo yamahaYbr = new Moto("AB1456VB","YBR","Yamaha",80500.50,160);
		
		nuevo.agregarAutomovil(peugeot206);
		nuevo.agregarAutomovil(hondaTitan);
		nuevo.agregarAutomovil(peugeot208);
		nuevo.agregarAutomovil(yamahaYbr);
		nuevo.ordenarVehiculosDeMayorAMenor();
		if (anotherFormat instanceof DecimalFormat) {
            DecimalFormat anotherDFormat = (DecimalFormat) anotherFormat;
            anotherDFormat.applyPattern("#.00");
            anotherDFormat.setGroupingUsed(true);
            anotherDFormat.setGroupingSize(3);
            
		listadoConcesionario = peugeot206.toString() + hondaTitan.toString() + peugeot208.toString() + yamahaYbr.toString() + 
				"=============================\n"+
				"Vehículo más caro : "+ nuevo.verVehiculoMasCaro().getNombreMarca() + " " + nuevo.verVehiculoMasCaro().getNombreModelo()+ "\n"+
				"Vehículo más barato: " + nuevo.verVehiculoMasBarato().getNombreMarca() + " " + nuevo.verVehiculoMasBarato().getNombreModelo()+ "\n"+ 
				"Vehículo que contiene en el modelo la letra ‘Y’: " + nuevo.verVehiculoQueContieneLetraY().getNombreMarca() + " "+ 
				nuevo.verVehiculoQueContieneLetraY().getNombreModelo() + " $"+  anotherDFormat.format(nuevo.verVehiculoQueContieneLetraY().getPrecio())+ "\n"+
				"=============================\n"+
				"Vehículos ordenados por precio de mayor a menor: \n"+
				nuevo.verVehiculosOrdenadosPorPrecioDeMayorAMenor();
		}
		System.out.println(listadoConcesionario);
	}

	
	
}
