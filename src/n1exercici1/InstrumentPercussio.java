package n1exercici1;

public class InstrumentPercussio extends Instrument {

	public InstrumentPercussio(String nom, float preu) {
		super(nom, preu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "InstrumentCorda [getNom()=" + getNom() + ", getPreu()=" + getPreu() + "]";
	}

	public static void tocar() {
		System.out.println("Està sonant un instrument de percussio");

	}

}
