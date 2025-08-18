import java.util.*;

public class InventarioLibros{
	public static void main(String[] args){
		boolean bandera = true;
		int opcion = 0, cantidad = 0;
		Scanner scan = new Scanner(System.in);
		while(bandera){
			opcion = scan.nextInt();//1 generar libro
			switch(opcion){
				case 1:
					cantidad = scan.nextInt();
					generarLibros(cantidad);
				break;
			}
		}
	}

	public static void generarLibros(int cantidad){
		Random random = new Random();
		String titulo;
		String[] tituloArray = {"Quimica", "El tilin y el pepe", "Cetiza", "POO", "Fisica"};
		String autor;
		String[] autorArray = {"Adrian", "Erik", "Dadni", "pepe", "waas"};
		int Anio;
		Libro[] libro = new Libro[cantidad];
		
		for(int i=0; i<cantidad; i++){
			libro[i] = new Libro();
		}

		for(int i=0; i<cantidad; i++){
			int tituloRandom, autorRandom, anioRandom;
		}

	}
}