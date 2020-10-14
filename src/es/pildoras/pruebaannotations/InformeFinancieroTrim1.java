package es.pildoras.pruebaannotations;

import org.springframework.stereotype.Component;

@Component // Registramos en el contenedor de Spring informeFinancieroTrim1
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero{

	public String getInformeFinanciero() {
		return "Este es el Informe Financiero del Trimestre 1";
	}
}
