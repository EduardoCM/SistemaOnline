package org.tesji.estoico.online;

import java.util.logging.Logger;

import org.tesji.estoico.constantes.Pais;

public abstract class Pedido {
	
	private Logger LOG = Logger.getLogger(Pedido.class.getName());

	protected Pais pais;
	private String nombreProducto;

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	protected double importeSinIVA;
	protected double importeIVA;
	protected double importeConIVA;

	protected abstract void calculaIVA();

	public void calculaPrecioConIVA() {
		this.calculaIVA();
		importeConIVA = importeSinIVA + importeIVA;
	}

	public void setImporteSinIVA(double importeSinIVA) {
		this.importeSinIVA = importeSinIVA;
	}
	
	public void mostrarPedido(){
		LOG.info("Pedido desde " + pais);
		LOG.info("Producto: " + nombreProducto);
		
		LOG.info("Precio sin IVA " + importeSinIVA);
		LOG.info("Importe con IVA " + importeConIVA);
		LOG.info("IVA a pagar " + importeIVA );
		
	}
	
	

}
