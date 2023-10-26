package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public abstract class Seguros {
	private Integer numeroPoliza;
	private Persona asegurado;
	private Double suma_asegurada;
	private Double prima;
	private Double premio;
	
	
	public Seguros(Integer numeroPoliza, Persona asegurado, Double suma_asegurada, Double prima) {
		super();
		this.numeroPoliza = numeroPoliza;
		this.asegurado = asegurado;
		this.suma_asegurada = suma_asegurada;
		this.prima = prima;
		this.premio=getPremio();
		
	}

	public Integer getNumeroPoliza() {
		return numeroPoliza;
	}

	public void setNumeroPoliza(Integer numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}

	public Persona getAsegurado() {
		return asegurado;
	}

	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}

	public Double getSuma_asegurada() {
		return suma_asegurada;
	}

	public void setSuma_asegurada(Double suma_asegurada) {
		this.suma_asegurada = suma_asegurada;
	}

	public Double getPrima() {
		return prima;
	}

	public void setPrima(Double prima) {
		this.prima = prima;
	}

	public Double getPremio() {
		 Double impuestos = (getPrima() * 20.0) / 100;
		    return getPrima() + impuestos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroPoliza);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Seguros other = (Seguros) obj;
		return Objects.equals(numeroPoliza, other.numeroPoliza);
	}

	
	public abstract void setSufrioSiniestro();
	
	
	
}
