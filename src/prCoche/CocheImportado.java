package prCoche;

public class CocheImportado extends Coche {
	
	private double homologacion;
	
	public CocheImportado(String nom, double p, double h){
		super(nom,p);
		homologacion = h;
	}
	
	@Override
	public double precioTotal(){
		return super.precioTotal() + homologacion;
	}

}
