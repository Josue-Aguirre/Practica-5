package Banco;

import java.util.Scanner;

public class Acceso {
	int pin2;
	float dr,dr2;
	int pin_cliente,regresa_menu=0;
	Scanner sc = new Scanner(System.in);
	public void acceso(Scanner sc)
	{
		System.out.println("PIN (4 digitos)=");
		pin2 = sc.nextInt();
		acceso(pin2);
	}
	public void acceso(int pin_cliente)
	{
		int opcion=' ';
		if(pin2!=pin_cliente)
		{
			System.out.println("Acceso denegado");
		}
		else
		{
			System.out.println(dr2);
			System.out.println("Que desea hacer?\n");
			System.out.println("x) Depositar \ny) Retirar \nz)Regresar al menu");
			opcion=sc.next().charAt(0);
				switch(opcion)
				{
					case 'x':
						System.out.println("Cuanto desea depositar?=");
						dr = sc.nextFloat();
						System.out.println(dr);
						dr2= dr2+dr;
						System.out.println("Gracias por haber depositado");
						break;
					case 'y':
						System.out.println("Cuanto desea retirar?=");
						dr = sc.nextFloat();
						System.out.println(dr);
						dr2= dr2-dr;
						System.out.println("Gracias por haber retirado, no olvide tomar su dinero");
						break;
					case 'z': 
						regresa_menu=0;
						break;
				}
		}
	}
}