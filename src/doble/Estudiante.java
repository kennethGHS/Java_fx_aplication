package doble;

public class Estudiante {
	String colegio;
	int seccion;
	protected int year;
	protected String gusto;
	protected int recursado;
	private double prom_calificacion;
	public Estudiante(int year,String colegio,int seccion,String gusto,int recursado,double prom_califiacion){
		this.year=year;
		this.colegio=colegio;
		this.seccion = seccion;
		this.gusto=gusto;
		this.recursado = recursado;
		this.prom_calificacion = prom_calificacion;
	}
	public Estudiante(){
		this.year=0000;
		this.colegio="Santa Cecilia";
		this.seccion = 00;
		this.gusto="";
		this.recursado = 0;
		this.prom_calificacion = 100.00;
	}
public void aprovado(Estudiante estudiante1){
	if(estudiante1.prom_calificacion >70){
		System.out.println("Aprovado");
	}
}
public void anadir_gusto(String cosa){
	this.gusto+=", " + cosa;
}
public void anadir_gusto(int cosa){
	this.gusto+=", " + cosa;
}
public void anadir(String nombre){
	this.colegio+="distrito" + nombre;
}
public void anadir(int numero){
	this.colegio+=",Numero de distrito"+numero;
}
}
