package n1exercici2;

public class N1Exercici2 {

	public static void main(String[] args) {


		Cotxe coche1 = new Cotxe(250);
		
		// com invocar el mètode estàtic frenar()
		coche1.frenar();
		Cotxe.frenar();
		
		//  i el no estàtic solo se invoca con instancia
		coche1.accelerar();

	}

}
