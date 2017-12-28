package Tienda;

import java.util.logging.Logger;

import org.tesji.estoico.online.Pedido;
import org.tesji.estoico.paises.PedidoChile;
import org.tesji.estoico.paises.PedidoMexico;

public class TiendaOnline {

	public static void main(String[] args) {
		
		Pedido pedidoMexico = new PedidoMexico();		
		pedidoMexico.setNombreProducto("Kindle");
		pedidoMexico.setImporteSinIVA(2000);
		pedidoMexico.calculaPrecioConIVA();
		pedidoMexico.mostrarPedido();
		
		
		Pedido pedidoChile = new PedidoChile();
		pedidoChile.setNombreProducto("Kindle");
		pedidoChile.setImporteSinIVA(2000);
		pedidoChile.calculaPrecioConIVA();
		pedidoChile.mostrarPedido();
		
	}

}
