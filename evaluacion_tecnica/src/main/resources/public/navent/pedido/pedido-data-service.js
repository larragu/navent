'user strict';

angular
	.module('pedido')
	.service('pedidoDataService', pedidoDataService);

pedidoDataService.$inject = ['Pedido'];

function pedidoDataService(Pedido) {

	var service = {};
	service.nombreData = {};
	service.nombreData.nombre = null;
	service.nombreData.maxlength = 100;
	service.monto = null;
	service.descuento = null;
	service.postPedido = postPedido;

	return service;
	
	////////////////////
	
	function postPedido() {
		
		var pedido = new Pedido();
		pedido.nombre = service.nombreData.nombre;
		pedido.monto = service.monto;
		pedido.descuento = service.descuento;

		return pedido.$save()
			.then(savePedidoComplete)
            .catch(savePedidoFailed);

	}

	function savePedidoComplete() {

	}

	function savePedidoFailed() {

		console.log("Failed to save pedido");

	}

}
