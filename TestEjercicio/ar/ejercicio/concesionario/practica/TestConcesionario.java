package ar.ejercicio.concesionario.practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestConcesionario {

	@Test
	void queSeCreeConcesionario() {
		
		Concesionario nuevo= new Concesionario("Todo vehiculos");
		
		assertNotNull(nuevo);
	}
	
	@Test 
	void queSePuedanAgregarVehiculos() {
		Concesionario nuevo= new Concesionario("Todo vehiculos");
		
		Vehiculo peugeot206 = new Automovil("AB198034","206","Peugeot",200000.00,4);
		Vehiculo peugeot208 = new Automovil("AB198044","208","Peugeot",250000.00,5);
		Vehiculo hondaTitan = new Automovil("AB1456VV","Titan","Honda",60000.00,125);
		Vehiculo yamahaYbr = new Automovil("AB1456VB","YBR","Yamaha",80500.50,160);
		
		nuevo.agregarAutomovil(peugeot206);
		nuevo.agregarAutomovil(hondaTitan);
		nuevo.agregarAutomovil(peugeot208);
		nuevo.agregarAutomovil(yamahaYbr);
		
		assertEquals(4,nuevo.getVehiculos().size(),0.0);
		
	}
	
	@Test
	void queSeOrdenenPorPrecioLosVehiculos() {
		Concesionario nuevo= new Concesionario("Todo vehiculos");
		
		Vehiculo peugeot206 = new Automovil("AB198034","206","Peugeot",200000.00,4);
		Vehiculo peugeot208 = new Automovil("AB198044","208","Peugeot",250000.00,5);
		Vehiculo hondaTitan = new Automovil("AB1456VV","Titan","Honda",60000.00,125);
		Vehiculo yamahaYbr = new Automovil("AB1456VB","YBR","Yamaha",80500.50,160);
		
		nuevo.agregarAutomovil(peugeot206);
		nuevo.agregarAutomovil(hondaTitan);
		nuevo.agregarAutomovil(peugeot208);
		nuevo.agregarAutomovil(yamahaYbr);
		
		nuevo.ordenarVehiculosDeMayorAMenor();
	
		
		assertEquals(peugeot208.getPrecio(),nuevo.getVehiculosOrdenados().first().getPrecio());
		
	}
	
	@Test 
	void quePeugeotseaVehiculoMasCaro() {
		Concesionario nuevo= new Concesionario("Todo vehiculos");
		
		Vehiculo peugeot206 = new Automovil("AB198034","206","Peugeot",200000.00,4);
		Vehiculo peugeot208 = new Automovil("AB198044","208","Peugeot",250000.00,5);
		Vehiculo hondaTitan = new Automovil("AB1456VV","Titan","Honda",60000.00,125);
		Vehiculo yamahaYbr = new Automovil("AB1456VB","YBR","Yamaha",80500.50,160);
		
		nuevo.agregarAutomovil(peugeot206);
		nuevo.agregarAutomovil(hondaTitan);
		nuevo.agregarAutomovil(peugeot208);
		nuevo.agregarAutomovil(yamahaYbr);
		
		assertEquals(peugeot208,nuevo.verVehiculoMasCaro());
	}
	@Test 
	void queHondaTitanseaVehiculoMasBarato() {
		Concesionario nuevo= new Concesionario("Todo vehiculos");
		
		Vehiculo peugeot206 = new Automovil("AB198034","206","Peugeot",200000.00,4);
		Vehiculo peugeot208 = new Automovil("AB198044","208","Peugeot",250000.00,5);
		Vehiculo hondaTitan = new Automovil("AB1456VV","Titan","Honda",60000.00,125);
		Vehiculo yamahaYbr = new Automovil("AB1456VB","YBR","Yamaha",80500.50,160);
		
		nuevo.agregarAutomovil(peugeot206);
		nuevo.agregarAutomovil(hondaTitan);
		nuevo.agregarAutomovil(peugeot208);
		nuevo.agregarAutomovil(yamahaYbr);
		
		assertEquals(hondaTitan,nuevo.verVehiculoMasBarato());
	}
}
