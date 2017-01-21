package com.evaluacion_tecnica.cache;


//The only pedidos that are cached are those 
//which are inserted or updated
//Note: I DO NOT need to create the logic for these methods 
public class BumexMemcached {
	
	private static final BumexMemcached instance = new BumexMemcached();
	
	//No other class can instantiate this
	private BumexMemcached() {
		
	}
	
	public static BumexMemcached getInstance() {
		return instance;
	}
	
	public void set(String key, Object value) {
			
	}
	
	public Object get(String key) {
	
		return null;
	}
	
	public void delete(String key) {
		
	}
}