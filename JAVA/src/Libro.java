public class Libro {
	public String titulo;
	public String autor;
	public String editorial;
	
	//Constructor by default
	public Libro(){
		titulo="Harry Potter";
		autor="J.K.Rowling";
		editorial="Salamandra";
	}
	
	//Constructor with parameters
	public Libro(String a ,String b, String c){
		this.titulo=a;
		this.autor=b;
		this.editorial=c;
	}
	public String toString(){
		return this.autor + "escribió el libro " + this.titulo + "y lo publicó la editorial" + this.editorial;
	}
	public static void main(String[] args){
		
	}
}
