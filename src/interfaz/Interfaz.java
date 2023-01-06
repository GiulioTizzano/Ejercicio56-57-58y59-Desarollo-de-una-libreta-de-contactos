package interfaz;
import java.util.Scanner;

import dominio.Contacto;
import dominio.Libreta;

public class Interfaz{

	public boolean procesarPeticion(String peticion, Libreta l){
		String [] p = peticion.split(" ");
		if(p[0].equals("add")){
			l.add(new Contacto(p[1], p[2]));
		}
		if(p[0].equals("list")){
			System.out.print(l);
		}
		if(p[0].equals("help")){
			System.out.print("Introduzca una de las siguentes: add nombre telefono (para añadir un contacto), list: para listar todos los contactos dentro de la libreta, y exit: para salir del programa");
		}
		if(p[0].equals("exit")){
			return false;
		}
		return true;
	}

	public String leerPeticion(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Añada una peticion para procesar: ");
		String cadena = sc.nextLine();
		return cadena;
	}





}
