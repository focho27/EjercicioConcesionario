package ar.ejercicio.concesionario.practica;

public abstract class Vehiculo implements Comparable<Vehiculo>{
	protected String modelo,marca,patente;
	protected Double precio;
	
	public Vehiculo(String patente,String modelo,String marca, Double precio) {
		
	}

	public abstract String getPatente();

	public abstract void setPatente(String patente);
	public abstract Double getPrecio();
	public abstract void setPrecio(Double precio);
	public abstract String getNombreModelo();
	public abstract void setNombreModelo(String modelo);
	public abstract String getNombreMarca();
	public abstract void setNombreMarca(String marca);

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patente == null) ? 0 : patente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (patente == null) {
			if (other.patente != null)
				return false;
		} else if (!patente.equals(other.patente))
			return false;
		return true;
	}
	
	
	
}
