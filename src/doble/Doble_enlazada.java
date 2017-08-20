package doble;

public class Doble_enlazada<T> {
	Nodos<T> head;
	Nodos<T> tail;
	private static int cantidad_listas;
	public Doble_enlazada(){
		this.head=null;
		this.tail=null;
		suma();
	}
	private static void suma(){
		cantidad_listas++;
	}
	public int get_cantidad_listas(){
		return cantidad_listas;
	}
	public void append(T objeto){
		Nodos<T> app= new Nodos<T>(objeto);
		if(this.head== null){
			this.head=app;
			this.tail=this.head;
		}
		else{
			Nodos<T> llevar=this.tail;
			 llevar.set_next(app);
			llevar.next.set_previo(llevar);
			this.tail=llevar.next;
		}
	}

}
