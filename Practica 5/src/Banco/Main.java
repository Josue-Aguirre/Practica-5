package Banco;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<Registro> nuevoregistro = new Vector<>();
		Vector<Acceso> nuevovalor = new Vector<>();
		Registro captura = new Registro();
		Acceso captura1 = new Acceso();
		Scanner sc = new Scanner(System.in);
		int opcion=' ';
		do 
        {
            System.out.println("Menu\nx) Registrar Usuario \ny) Accesar Datos \nz) Salir ");
            opcion=sc.next().charAt(0);
            	switch(opcion)
	            {
	            	case 'x':
	            		captura.registrarcuenta(sc);
	            		nuevoregistro.add(captura);
	            		break;
	            	case 'y':
	            		captura1.acceso(sc);
	            		nuevovalor.add(captura1);
	            		break;
	            	case 'z':
	            		System.out.println("¡¡¡Gracias por utilizar este programa!!!");
	            		break;
	            	default:
	            		break;
	            }
           }while(opcion!='z');

	}
}