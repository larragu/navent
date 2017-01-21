package com.evaluacion_tecnica.pedido;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(PedidoRestURIConstraints.BASE_URL)
public class PedidoController {
	
	private PedidoManager pedidoStore;
	
	public PedidoController() {
		
		pedidoStore = new PedidoManager();
		
	}

	//Save
	@RequestMapping(value = PedidoRestURIConstraints.SAVE_PEDIDO, method = RequestMethod.POST)
	public @ResponseBody void createPedido(
			@RequestBody Pedido newPedido) {
		
		pedidoStore.createPedido(newPedido);
	}	
	
	//Update
	@RequestMapping(value = PedidoRestURIConstraints.UPDATE_PEDIDO, method = RequestMethod.PUT)
	public @ResponseBody void updatePedido(
			@RequestBody Pedido existingPedido) {
		
		pedidoStore.updatePedido(existingPedido);
	}	
	
	//Get
	@RequestMapping(value = PedidoRestURIConstraints.GET_PEDIDO, method = RequestMethod.GET)
	public @ResponseBody Pedido getPedido(
			@PathVariable("id") long id) {
		
		Pedido pedido = pedidoStore.getPedido(id);

		return pedido;
	}
	
	//Delete
	@RequestMapping(value = PedidoRestURIConstraints.DELETE_PEDIDO, method = RequestMethod.DELETE)
	public @ResponseBody void deletePedido(
			@PathVariable("id") long id) {
		
		pedidoStore.deletePedido(id);
	}

}
