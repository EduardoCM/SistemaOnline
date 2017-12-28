package org.tesji.estoico.paises;

import org.tesji.estoico.constantes.Pais;
import org.tesji.estoico.online.Pedido;

public class PedidoChile extends Pedido {

	@Override
	protected void calculaIVA() {
		this.pais = Pais.CHILE;
		importeIVA = importeSinIVA * .45;
	}
	
	

}
