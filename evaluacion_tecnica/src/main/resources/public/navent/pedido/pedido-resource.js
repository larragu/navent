'use strict';

angular.module('pedido')

.service('Pedido', function($resource) {
  return $resource('/pedidos/guardar');
});