package Banco;

import java.util.Scanner;

public class Registro {
	private String nombre_cliente;
	private float saldo_cliente;
	private int pin_cliente;
	public Registro(String nombre_cliente, float saldo_cliente, int pin_cliente)
	{
		this.nombre_cliente = nombre_cliente;
		this.saldo_cliente = saldo_cliente;
		this.pin_cliente = pin_cliente;
	}
	public Registro()
	{
		this.nombre_cliente=null;
		this.saldo_cliente=0f;
		this.pin_cliente=0;
	}
	public void registrarcuenta(Scanner sc)
	{
		System.out.print("Nombre=");
		this.nombre_cliente = sc.next();
		System.out.print("PIN (4 digitos)=");
		this.pin_cliente = sc.nextInt();
	}
	public String toString(){
		return "Usuario="+"\n Nombre=" + nombre_cliente + "\n Saldo=" + saldo_cliente + "\n PIN=" + pin_cliente;
	}
	public String getnombre_cliente() {
		return nombre_cliente;
	}
	public void setnombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }
	public float getsaldo_cliente() {
		return saldo_cliente;
	}
	public void setsaldo_cliente(float saldo_cliente) {
		this.saldo_cliente = saldo_cliente;
	}
	public int getpin_cliente() {
		return pin_cliente;
	}
	public void setpin_cliente(int pin_cliente) {
		this.pin_cliente = pin_cliente;
	}
}