package dominio;
import java.io.*;

public class Contacto implements Serializable{

	protected String nombre;
	protected String numeroDeTelefono;
public Contacto(String nombre, String numeroDeTelefono){
	this.nombre = nombre;
	this.numeroDeTelefono = numeroDeTelefono;
}

public String toString(){

return "El nombre es: " + nombre + "y el numero de telefono es " + "\n" 
+ numeroDeTelefono;

}




}
