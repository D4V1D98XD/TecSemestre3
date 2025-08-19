package libros;

public class Libros{
	private String titulo;
	private String autor;
	private int Anio;

	public Libros(){
		
	}

	public Libros(String titulo, String autor, int anio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		Anio = anio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return Anio;
	}

	public void setAnio(int anio) {
		Anio = anio;
	}
	@Override
	public String toString() {
		return titulo + "\t" + autor + "\t" + Anio;
	}

}