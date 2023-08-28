package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public void setCanal(int canal) {
		if (estado && canal>=0 && canal<=120) {
		this.canal = canal;
		}
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public void setVolumen(int volumen) {
		if (estado && volumen>=0 && volumen<=7) {
		this.volumen = volumen;
		}
	}
	
	public Control getControl() {
		return this.control;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int num) {
		numTV = num;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {	
		if (estado && this.canal>=0 && this.canal<120) {
			this.canal+=1;
		}
	}
	public void canalDown() {	
		if (estado && this.canal>0 && this.canal<=120) {
			this.canal-=1;
		}
	}
	
	public void volumenUp() {	
		if (estado && this.volumen>=0 && this.volumen<7) {
			this.volumen+=1;
		}
	}
	public void volumenDown() {	
		if (estado && this.volumen>0 && this.volumen<=7) {
			this.volumen-=1;
		}
	}
}
