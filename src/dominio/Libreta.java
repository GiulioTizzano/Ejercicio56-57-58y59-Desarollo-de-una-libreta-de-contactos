package dominio;
import java.util.*; // importando esto para el ArrayList
import java.io.*;

public class Libreta implements Serializable{
	private ArrayList<Contacto> lista;
	public Libreta(){
		lista = new ArrayList<Contacto>();
	}
	public Libreta add(Contacto c){
		 lista.add(c);
		  return this;
	}

	public String toString(){
		String cadena = new String();
		for(Contacto c: lista){
			cadena += c + "\n"; //Esto es equivalente a cadena=cadena+c

		}
		return cadena;
	}


}
