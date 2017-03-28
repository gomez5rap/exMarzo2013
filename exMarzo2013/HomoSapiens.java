package exMarzo2013;

public class HomoSapiens extends Mamifero {
	int piernas = 2;
	int brazos = 2;

	public HomoSapiens(String nombre) {
		super(nombre);
	}

	@Override
	protected void alimentar() {
		
		if (this.etapa == Etapa.CRIA) {
			System.out.println("Estoy mamando");
		} else
			System.out.println("Estoy comiendo de todo.");
this.crecer();
	}

	@Override
	protected void desplazar() {
		if (this.etapa == Etapa.CRIA)
			System.out.println("Gateando.");
		else
			System.out.println("Corriendo.");
	}

	@Override
	public String toString() {
		return super.toString()+"HomoSapiens [piernas: " + piernas + ", brazos: " + brazos + "]\n";
	}

}
