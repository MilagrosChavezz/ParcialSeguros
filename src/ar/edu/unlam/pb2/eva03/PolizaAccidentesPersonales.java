package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PolizaAccidentesPersonales extends SegurosDeVida implements IPolizaPersonal {

	private Boolean sufrioAccidente=false;
	private Map<Persona,TipoDeBeneficiario> beneficiarios;
	
	public PolizaAccidentesPersonales(Integer numeroPoliza, Persona asegurado, Double suma_asegurada, Double prima) {
		super(numeroPoliza, asegurado, suma_asegurada, prima);
		// TODO Auto-generated constructor stub
		this.beneficiarios=new HashMap<>();
	}

	@Override
	public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario hijo2) {
		// TODO Auto-generated method stub
		beneficiarios.put(hijo, hijo2);
	}

	@Override
	public Integer obtenerCantidadDeBeneficiarios() {
		// TODO Auto-generated method stub
		return beneficiarios.size();
	}

	@Override
	public Boolean tuvoAlgunAccidente() {
		// TODO Auto-generated method stub
		return sufrioAccidente;
	}

	@Override
	public void setSufrioSiniestro() {
		// TODO Auto-generated method stub
		sufrioAccidente=true;
	}

}
