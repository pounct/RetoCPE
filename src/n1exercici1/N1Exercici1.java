package n1exercici1;

public class N1Exercici1 {

	public static void main(String[] args) {

		// la càrrega pot ser provocada per la creació de la primera instància d'aquesta
		// classe
		Instrument instrumento1 = new InstrumentVent("su nombre", 234.58f);
		System.out.println(instrumento1);
		((InstrumentVent) instrumento1).tocar();

		// per l'accés a un membre estàtic d'aquesta
		InstrumentVent.tocar();

		///////////////////////

		Instrument instrumento2 = new InstrumentCorda("su nombre", 234.58f);
		System.out.println(instrumento2);
		((InstrumentCorda) instrumento2).tocar();
		
		InstrumentCorda.tocar();

		//////////////////////////

		Instrument instrumento3 = new InstrumentPercussio("su nombre", 234.58f);
		System.out.println(instrumento3);
		((InstrumentPercussio) instrumento3).tocar();
		
		InstrumentPercussio.tocar();

	}

}
