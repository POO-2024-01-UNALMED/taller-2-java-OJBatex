package test;

public class Motor {
	
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int num) {
		this.registro = num;
	}
	
	void asignarTipo(String tipo) {
		if (tipo == "electrico" || tipo == "gasolina") {
			this.tipo = tipo;
		}else {
			System.out.println("Entrada invalida.");
		}
	}

}
