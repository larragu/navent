package com.evaluacion_tecnica.pedido;

import com.evaluacion_tecnica.cache.BumexMemcached;

public class PedidoManager {
	
	
	private final BumexMemcached bumexMemcached = BumexMemcached.getInstance();
	
	public PedidoManager() {
		
	}
	
	//Create
	public void createPedido(Pedido newPedido) {
		
		try {
			
			//Check if the pedido already exists
			 Pedido existingPedido = (Pedido) this.bumexMemcached.get(Long.toString(newPedido.getId()));
			 
			 //The pedido does not exist
			 if(existingPedido == null) {
				
				 //Insert into the database
				 //Id for pedido is created inside
				 PedidosDAO.insertOrUpdate(newPedido);
				 
				 //Insert into the cache
				 this.bumexMemcached.set(Long.toString(newPedido.getId()), newPedido);
				 
			 }
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	//Update
	public void updatePedido(Pedido existingPedido) {
		
		try {
			
			//Update the database
			PedidosDAO.insertOrUpdate(existingPedido);
		 
			//Update the cache
			this.bumexMemcached.set(Long.toString(existingPedido.getId()), existingPedido);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	
	//Delete
	public void deletePedido(long id) {
		
		try {
			
			PedidosDAO.delete(id);
			this.bumexMemcached.delete(Long.toString(id));
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	
	//Get
	public Pedido getPedido(long id) {
		
		try {
			
			Pedido pedido = (Pedido) this.bumexMemcached.get(Long.toString(id));
		
			if(pedido == null ) {
			
				pedido = PedidosDAO.select(id);
			
			}
		
			return pedido;
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			return null;
		}
		
	}

}
