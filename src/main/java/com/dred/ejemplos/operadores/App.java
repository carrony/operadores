package com.dred.ejemplos.operadores;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner leerTeclado = new Scanner(System.in);
        
        int num1, num2, num3;
        float precio, cantidad;   
        
        System.out.println("introduce el precio: ");
        precio=leerTeclado.nextFloat();
        
        System.out.println("El precio introducido es "+precio);
        
        num1 =(int) precio;
        System.out.println("num vale "+num1);
        num2=5;
        num3=num1*num2;
        System.out.println("num3 vale "+num3+" que es "+num1+"*"+num2);
    }
}
