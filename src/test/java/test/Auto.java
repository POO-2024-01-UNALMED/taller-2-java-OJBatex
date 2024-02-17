package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos(Asiento[] asientos) {
		
		int cantAsientos = 0;
		
		for (int i = 0; i > asientos.length; i++) {
			
			if (asientos[i] != null) {
				
				cantAsientos++;
			}
		}
		
		return cantAsientos;
		
	}
		
	public String verificarIntegridad(Asiento asiento, Motor motor, Auto auto) {
		
		if (asiento.registro == motor.registro && asiento.registro == auto.registro && motor.registro == auto.registro) {
			return "Auto original";
		}else {
			return "Las piezas no son originales";
		}
		
	}
	


}
