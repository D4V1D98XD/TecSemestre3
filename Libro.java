public class Libro{
		private String titulo;
		private String autor;
		private int Anio;

		public class Libro(){
			
		}

		public class Libro(String titulo, String autor, int anio){
			this.titulo = titulo;
			this.autor = autor;
			this.anio = anio;
		}

		public static String getTitulo(String titulo){
			titulo = this.titulo;
			return titulo;
		}

		public static String getAutor(String autor){
			autor = this.autor;
			return autor;
		}

		public static int getAnio(int anio){
			anio = this.Anio;
			return anio;
		}

}