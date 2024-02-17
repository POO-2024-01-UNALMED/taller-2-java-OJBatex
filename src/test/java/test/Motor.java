package test;

public class Motor {
	
	public int numeroCilindros;
	public String tipo;
	public int registro;
	
	public void cambiarRegistro(int num) {
		this.registro = num;
	}
	
	public void asignarTipo(String tipo) {
		if (tipo == "electrico" || tipo == "gasolina") {
			this.tipo = tipo;
		}
	}

}
