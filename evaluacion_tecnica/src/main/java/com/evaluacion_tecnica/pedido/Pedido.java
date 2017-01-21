package com.evaluacion_tecnica.pedido;

//Model
public class Pedido {

    private long id;
	private String nombre;
	private int monto;
	private float descuento;

	public Pedido() {}
	
    public Pedido(String nombre, int monto, float descuento) {

        this.nombre = nombre;
        this.monto = monto;
        this.descuento = descuento;
    }
    
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
