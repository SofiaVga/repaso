public class ChatBot{
	private String nombre;
	private String empresa;
	private boolean generativo;	
	private boolean deVoz;

	public ChatBot(){
	}
	
	public ChatBot(String n, String e, boolean g, boolean v){
	this.nombre = n;
	this.empresa = e;
	this.generativo = g;
	this.deVoz = v;
	}

	@Override
	public String toString(){
	String str ="";
	str = str +"Nombre: "+this.nombre + "\n";
	str = str+"Empresa: "+this.empresa + "\n";
	str = str +"Generarivo?: "+ (this.generativo? "Si" : "No")+ "\n";
	str = str +"DeVoz?: "+(this.deVoz? "Si": "No")+ "\n";
	return str; 
	
	}
}
