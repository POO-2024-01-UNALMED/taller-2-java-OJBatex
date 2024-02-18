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
		
		int[] regAsientos = new int[cantidadAsientos()];
		int numRegAsientos = 0;
		boolean check = false;
		String a = "Las piezas no son originales";
		int posAsientos = -1;
		
		for (int i = 0; i < this.asientos.length; i++) {
			
				if (this.asientos[i] != null) {
					posAsientos++;
					regAsientos[posAsientos] = this.asientos[i].registro;
				}
			
		} 
		
		numRegAsientos = regAsientos[0];
		
		int cont = 0;
		for (int i = 0; i < regAsientos.length; i++) {
			
			if(regAsientos[0] == regAsientos[i]) {
				cont++;
				
			}
			
			if (cont == regAsientos.length) {
				check = true;
			}
		}
		
		if (check == true) {
			if (numRegAsientos == this.motor.registro && numRegAsientos == this.registro && this.registro == this.motor.registro) {	
				a = "Auto original";
			}	
		}
		
	
		return a;
	}

	}
	