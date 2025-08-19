package libros;

import java.util.*;

public class InventarioLibros{
	public static void main(String[] args){
		boolean bandera = true;
		int opcion = 0, cantidad = 0;
		Libros libro = new Libros();
		Scanner scan = new Scanner(System.in);
		while(bandera){
			System.out.println("Que desea hacer?");
			opcion = scan.nextInt();//1 generar libro //2 Mostrar todos los libros //3 Buscar libros por autor
			switch(opcion){
				case 1:
					System.out.println("Cuantos libros desea generar: ");
					cantidad = scan.nextInt();
					generarLibros(cantidad);
				break;
				
				case 2:
					if(cantidad == 0){
						System.out.println("Por favor genere libros");
						opcion = 1;
					}
				break;
			}
		}
	}

	public static void generarLibros(int cantidad){
		Random random = new Random();
		Libros[] libro = new Libros[cantidad];
		for(int i=0; i<cantidad; i++){
			libro[i] = new Libros();
		}
		String titulo = null;
		String autor = null;
		int anio = 0;
		
		String[] autorArray = {"Adrian", "Erik", "Dandi", "pepe", "tilin"};
		String[] tituloArray = {"Quimica", "Calculo", "Cetiza", "POO", "Fisica"};
		
		int tituloRandom, autorRandom, anioRandom;
		
		for(int i=0; i<cantidad; i++){
			tituloRandom = random.nextInt(5);
			autorRandom = random.nextInt(5);
			anioRandom = random.nextInt(1989, 2026);
			
			titulo = tituloArray[tituloRandom];
			autor = autorArray[autorRandom];
			anio = anioRandom;
			
			libro[i] = new Libros(titulo, autor, anio);
		}
	}
}