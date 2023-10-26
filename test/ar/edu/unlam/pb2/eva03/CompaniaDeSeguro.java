package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;

public class CompaniaDeSeguro {

	private String nombre;
	private Set<Seguros> polizas;

	public CompaniaDeSeguro(String nombre) {
		super();
		this.nombre = nombre;
		this.polizas = new HashSet<>();
	}

	public void agregarPoliza(Seguros seguro) {
		// TODO Auto-generated method stub
		polizas.add(seguro);
	}

	public Integer obtenerLaCantidadDePolizasEmitidas() {
		// TODO Auto-generated method stub
		return polizas.size();
	}

	public void denunciarSiniestro(Integer codigoPoliza) throws NoExistePoliza {
		// TODO Auto-generated method stub
		Seguros seguros = getPoliza(codigoPoliza);
		if (seguros.getNumeroPoliza().equals(codigoPoliza) && seguros instanceof IseguroGeneras) {
			(seguros).setSufrioSiniestro();
		}
		if (seguros.getNumeroPoliza().equals(codigoPoliza) && seguros instanceof IPolizaPersonal) {
			(seguros).setSufrioSiniestro();
		}
	}

	public Seguros getPoliza(Integer codigo) throws NoExistePoliza {
		for (Seguros seguros : polizas) {
			if (seguros.getNumeroPoliza().equals(codigo)) {
				return seguros;
			}

		}
		throw new NoExistePoliza();

	}

}
