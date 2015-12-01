package EJERCICIOS_4;

public class VISIBILIDAD {

	public void MetodoPublico() {
		System.out.println("Metodo Publico");
		MetodoPrivado();
	}

	private void MetodoPrivado() {
		System.out.println("Metodo Privado");
	
	}
void MetodoPaquete(){
	System.out.println("Metodo Paquete");
}
}

