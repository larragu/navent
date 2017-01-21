'use strict';

angular
	.module('pedido')
	.controller('PedidoController', PedidoController);

PedidoController.$inject = ['pedidoDataService'];

function PedidoController(pedidoDataService) {

	var vm = this;
	
	vm.pedidoDataService = pedidoDataService;
	
	vm.submitForm = submitForm;

	////////////////////
	
	function submitForm(isValid,maxlength) {

		if(isValid) {
			
			pedidoDataService.postPedido();
		}
	}
}