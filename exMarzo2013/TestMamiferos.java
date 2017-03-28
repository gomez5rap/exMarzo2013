package exMarzo2013;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import utiles.Menu;
import utiles.Teclado;

public class TestMamiferos {

	public static void main(String[] args) {
		Menu menuPrincipal = new Menu("*** Mamiferos ***",
				new String[] { "Añadir mamifero", "Listar mamiferos", "Listar humanos", "Listar focas en orden inverso",
						"Contar murcielagos", "Alimetnar a todos los mamiferos del catalogo" });
		ArrayList<Mamifero> listaMamiferos = new ArrayList<Mamifero>();
		listaMamiferos.add(new HomoSapiens("Pedro0"));
		listaMamiferos.add(new HomoSapiens("Pedro1"));
		listaMamiferos.add(new HomoSapiens("Pedro2"));
		listaMamiferos.add(new Foca("Foca0"));
		listaMamiferos.add(new Foca("Foca1"));
		listaMamiferos.add(new Foca("Foca2"));
		listaMamiferos.add(new Murcielago("Murci0"));
		listaMamiferos.add(new Murcielago("Murci1"));
		listaMamiferos.add(new Murcielago("Murci2"));
		listaMamiferos.add(new Murcielago("Murci3"));

		int opcion;
		do {
			opcion = menuPrincipal.gestionar();
			switch (opcion) {
			case 1:
				menuAnnadir(listaMamiferos);
				break;
			case 2:
				System.out.println(listaMamiferos.toString());
				break;
			case 3:
				listarHumanos(listaMamiferos);
				break;
			case 4:
				listarFocasInverso(listaMamiferos);
				break;
			case 5:
				contarMurcielagos(listaMamiferos);
				break;
			case 6:
				alimentarTodos(listaMamiferos);
				break;
			default:
				System.out.println("ADIOS!");

			}
		} while (opcion != menuPrincipal.getNumOpciones());

	}

	/**
	 * 
	 * @param listaMamiferos
	 */
	private static void alimentarTodos(ArrayList<Mamifero> listaMamiferos) {
		Iterator<Mamifero> it = listaMamiferos.iterator();
		while (it.hasNext()) {
			Mamifero mamifero = it.next();
			mamifero.alimentar();
		}
	}

	/**
	 * 
	 * @param listaMamiferos
	 */
	private static void contarMurcielagos(ArrayList<Mamifero> listaMamiferos) {
		int contador = 0;
		Iterator<Mamifero> it = listaMamiferos.iterator();
		while (it.hasNext()) {
			Mamifero mamifero = it.next();
			if (mamifero instanceof Murcielago) {
				contador++;
			}		
		}
		System.out.println("Hay "+contador+" murcielagos");
	}

	/**
	 * 
	 * @param listaMamiferos
	 */
	private static void listarFocasInverso(ArrayList<Mamifero> listaMamiferos) {
		 ListIterator<Mamifero> li = listaMamiferos.listIterator(listaMamiferos.size());
		  while (li.hasPrevious()) {
		   Mamifero mamifero = li.previous();
		   if (mamifero instanceof Foca) {
		    System.out.println(mamifero);
		   }
		  }

	}
	/**
	 * 
	 * @param listaMamiferos
	 */
	private static void listarHumanos(ArrayList<Mamifero> listaMamiferos) {
		Iterator<Mamifero> it = listaMamiferos.iterator();
		while (it.hasNext()) {
			Mamifero mamifero = it.next();
			if (mamifero instanceof HomoSapiens) {
				System.out.println(mamifero);
			}
		}

	}
	
	/**
	 * 
	 * @param listaMamiferos
	 */
	private static void menuAnnadir(ArrayList<Mamifero> listaMamiferos) {
		Menu menu2 = new Menu("*** Añadir mamifero ***", new String[] { "Homo Sapiens", "Murcielago", "Foca" });
		int opcion;
		opcion = menu2.gestionar();
		switch (opcion) {
		case 1:
			listaMamiferos.add(new HomoSapiens(Teclado.leerCadena("Introduce el nombre: ")));
			break;
		case 2:
			listaMamiferos.add(new Murcielago(Teclado.leerCadena("Introduce el nombre: ")));
			break;
		case 3:
			listaMamiferos.add(new Foca(Teclado.leerCadena("Introduce el nombre: ")));
			break;
		default:
			System.out.println("ADIOS!");

		}
	}

}
