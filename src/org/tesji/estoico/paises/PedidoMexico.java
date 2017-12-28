package org.tesji.estoico.paises;

import org.tesji.estoico.constantes.Pais;
import org.tesji.estoico.online.Pedido;

public class PedidoMexico extends Pedido {

	@Override
	protected void calculaIVA() {
		this.pais = Pais.MEXICO;
		importeIVA = importeSinIVA * 0.15;
	}
	
	

}
