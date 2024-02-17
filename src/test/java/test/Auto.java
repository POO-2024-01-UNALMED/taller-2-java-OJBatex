package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		
		int cantAsientos = 0;
		
		for (int i = 0; i < this.asientos.length; i++) {
			
			if (this.asientos[i] != null) {
				
				cantAsientos++;
			}
		}
		
		return cantAsientos;
		
	}
	
	String verificarIntegridad() {
		
		boolean check = true;
		String a = "Las piezas no son originales";
		
		for (int i = 1; i < cantidadAsientos(); i++) {
			
				if(this.asientos[i-1].registro != this.asientos[i].registro) {
				check = false;
				break;		
			}	
			
		} 
		
		if (check == true) {
			if (this.asientos[0].registro == this.motor.registro && this.asientos[0].registro == this.registro && this.registro == this.motor.registro) {	
				a = "Auto original";
			}	
		}
		
		return a;
	}

	}
	