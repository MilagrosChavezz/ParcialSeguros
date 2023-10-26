package ar.edu.unlam.pb2.eva03;

public abstract class SegurosDeVida extends Seguros{


	public SegurosDeVida(Integer numeroPoliza, Persona asegurado, Double suma_asegurada, Double prima) {
		super(numeroPoliza, asegurado, suma_asegurada, prima);
		// TODO Auto-generated constructor stub
	}

	public abstract void agregarBeneficiario(Persona hijo, TipoDeBeneficiario hijo2);

	public abstract Object obtenerCantidadDeBeneficiarios();

}
