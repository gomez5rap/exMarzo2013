package exMarzo2013;

public abstract class Mamifero {
	String nombre;
	Etapa etapa = Etapa.CRIA;
	int creciendo = 0;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Etapa getEtapa() {
		return etapa;
	}

	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}

	public int getCreciendo() {
		return creciendo;
	}

	public void setCreciendo(int creciendo) {
		this.creciendo = creciendo;
	}

	/**
	 * Constructor de mamífero
	 * 
	 * @param nombre
	 */
	public Mamifero(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo alimentar al mamifero
	 */
	protected abstract void alimentar();

	/**
	 * Metodo desplazarse para el mamifero
	 */
	protected abstract void desplazar();

	/**
	 * Metodo que cambia a la etapa adulta cuando ha "crecido" 3 veces.
	 */
	protected void crecer() {
		if (this.creciendo == 3 && this.etapa == Etapa.CRIA) {
			this.etapa = Etapa.ADULTA;
		}else if(this.creciendo<3)
			creciendo++;
	}
	/**
	 * Metodo toString sobrescrito
	 */
	@Override
	public String toString() {
		return "Mamifero [nombre: " + nombre + ", etapa: " + etapa + ", creciendo :" + creciendo + "]\n";
	}

}
