package exMarzo2013;

public class Foca extends Mamifero {
	int extremidades = 4;

	public Foca(String nombre) {
		super(nombre);
	}

	@Override
	protected void alimentar() {
		this.crecer();
		if (this.etapa == Etapa.CRIA) {
			System.out.println("Estoy mamando");
		} else
			System.out.println("Estoy comiendo peces, crustáceos y cefalópodos");
	}

	@Override
	protected void desplazar() {
		System.out.println("Reptando y/o nadando");
	}

	@Override
	public String toString() {
		return super.toString()+"Foca [extremidades=" + extremidades + "]\n";
	}

}
