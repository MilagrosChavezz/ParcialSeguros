package ar.edu.unlam.pb2.eva03;

public abstract class SegurosGenerales extends Seguros implements IseguroGeneras{

	private Auto auto;

	
	public SegurosGenerales(Integer numeroPoliza, Persona asegurado, Double suma_asegurada, Double prima) {
		super(numeroPoliza, asegurado, suma_asegurada, prima);
		// TODO Auto-generated constructor stub
		this.auto=getAuto();
	}

	public Auto getAuto() {
		// TODO Auto-generated method stub
		return auto;
	}
	
	public void agregarBienAsegurado(Auto auto) {
		// TODO Auto-generated method stub
		this.auto=auto;
	}



	public void setAuto(Auto auto) {
		this.auto = auto;
	}

}
