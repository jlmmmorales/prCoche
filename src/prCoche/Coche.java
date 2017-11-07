package prCoche;

public class Coche {
	private String nombre;
	private double precio;
	
	private static double PIVA = 0.16;
	
	public Coche(String nom, double p){
		nombre = nom;
		precio = p;
	}
	
	public static void setPiva(double newPiva){
		PIVA = newPiva;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public double getPrecio(){
		return precio;
	}
	
	public double precioTotal(){
		double impuesto = precio * PIVA;
		return precio + impuesto;
	}
	
	@Override
	public String toString(){
		return "<"+ nombre +"> -> <"+ this.precioTotal() +">";
	}

}
