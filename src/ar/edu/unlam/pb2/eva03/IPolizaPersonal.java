package ar.edu.unlam.pb2.eva03;

public interface IPolizaPersonal {
	
	public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario hijo2) ;
	public Integer obtenerCantidadDeBeneficiarios() ;
	public Boolean tuvoAlgunAccidente();
}
