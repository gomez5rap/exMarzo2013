package exMarzo2013;

public class Murcielago extends Mamifero {
	int alas = 2;
	int patas = 2;

	public Murcielago(String nombre) {
		super(nombre);
	}

	@Override
	protected void alimentar() {
		this.crecer();
		if (this.etapa == Etapa.CRIA) {
			System.out.println("Estoy mamando");
		} else
			System.out.println("Estoy comiendo insectos ");
	}

	@Override
	protected void desplazar() {
		System.out.println("Volando.");
	}

	@Override
	public String toString() {
		return super.toString()+"Murcielago [alas=" + alas + ", patas=" + patas + "]\n";
	}

}
