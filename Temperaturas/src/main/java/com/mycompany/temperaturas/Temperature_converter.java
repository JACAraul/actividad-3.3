package com.mycompany.temperaturas;

import java.util.Scanner;
public class Temperature_converter {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("\n\tBienvenido al conversor de temperaturas\n");
	System.out.print("Introduce el valor que quieras convertir ");
	float value = scan.nextFloat();
	System.out.println("  Introduce el numero 1 para convertirlo de Celsius a Fahrenheit");
	System.out.println("  Introduce el numero 2 para convertirlo de fahrenheit a Celsius");
	System.out.print("\nIntroduce tu valor aqui   ");
	int ans = scan.nextInt();
	if (ans == 1) {
		float value1 = (float) ((value*(1.8))+32);
		System.out.print("Tu conversion es esta "+value1+"�F");
		}
	if (ans == 2) {
			float value2 = (float) (value-32);
			float value3 = (float) (value2*(5)/9);
			System.out.print("Tu conversion es esta.. "+value3+"�C");
		}
	System.out.println("\n\tGracias!!..");
	}
}
