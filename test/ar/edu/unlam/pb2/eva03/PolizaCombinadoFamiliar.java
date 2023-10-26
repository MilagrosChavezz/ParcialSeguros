package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.Map;

public class PolizaCombinadoFamiliar extends Seguros implements IPolizaPersonal{

	private Vivienda casa;
	private Map<Persona,TipoDeBeneficiario> beneficiarios;
	
	public PolizaCombinadoFamiliar(Integer numeroPoliza, Persona asegurado, Double suma_asegurada, Double prima) {
		super(numeroPoliza, asegurado, suma_asegurada, prima);
		// TODO Auto-generated constructor stub
		this.casa=getCasa();
		this.beneficiarios=new HashMap<>();
		
	}

	
	public void agregarBienAsegurado(Vivienda casa) {
		// TODO Auto-generated method stub
		this.casa=casa;
	}


	
	public Vivienda getCasa() {
		return casa;
	}


	public void setCasa(Vivienda casa) {
		this.casa = casa;
	}


	public Map<Persona, TipoDeBeneficiario> getBeneficiarios() {
		return beneficiarios;
	}


	public void setBeneficiarios(Map<Persona, TipoDeBeneficiario> beneficiarios) {
		this.beneficiarios = beneficiarios;
	}


	@Override
	public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario hijo2) {
		// TODO Auto-generated method stub
		beneficiarios.put(hijo, hijo2);
		
	}

	@Override
	public Integer obtenerCantidadDeBeneficiarios() {
		// TODO Auto-generated method stub
		return beneficiarios.size();	}

}
