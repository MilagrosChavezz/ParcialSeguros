package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends SegurosGenerales {

	private Boolean sufrioSiniestro=false;

	public PolizaDeAuto(Integer numeroPoliza, Persona asegurado, Double suma_asegurada, Double prima) {
		super(numeroPoliza, asegurado, suma_asegurada, prima);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public Boolean fueRobado() {
		// TODO Auto-generated method stub
		return sufrioSiniestro;
	}



	@Override
	public void setSufrioSiniestro() {
		// TODO Auto-generated method stub
		sufrioSiniestro=true;
	}

}
