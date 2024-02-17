package test;

public class Auto {
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos(Asiento[] asiento) {
		
		return this.asientos.length;
	}
	
	String verificarIntegridad(Asiento asiento, Motor motor, Auto auto) {
		
		if (asiento.registro == motor.registro && asiento.registro == auto.registro && motor.registro == auto.registro) {
			return "Las piezas no son originales";
		}else {
			return "Auto original";
		}
	}

}
