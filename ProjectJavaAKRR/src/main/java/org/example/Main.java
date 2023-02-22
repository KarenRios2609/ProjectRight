package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      /*  System.out.println("Hello world!");
        System.out.println("Ana Karen Rios Ramirez");
        int miEntero = 10;
        float miPuntoFlotante = 0.5f;
        double miDecimal = 22.5;
        String miTexto = "Hola soy un texto en Java";
        char miCaracter = 'a';

        Scanner miescaner = new Scanner(System.in);

        int numero;
        numero = miescaner.nextInt();

        System.out.println("Mi numero que acabo de ingresar es: " + numero);*/

        //Desarrollar un programa em Java que lea 2 numeros, lo sume y me muestre el resultado

        /*System.out.println("Digite 2 numeros");

        Scanner miescaner = new Scanner(System.in);

        int numero1 = 0;
        int num2 = 0;


        numero1 = miescaner.nextInt();
        System.out.println("El primer numero es: "+ numero1);
        num2 = miescaner.nextInt();
        System.out.println("El segundo numero es: "+ num2);

        int suma = numero1+num2;

        System.out.println("La suma es: "+ suma);*/
        //Desarrollar un programa que le pida al usuario su nombre, su edad, su peso y su altura. Y que calcule su INC(peso entre la altura al cuadrado) Y al final que muestre todos los datos



        Scanner miescaner = new Scanner(System.in);

        String nombre = "";
        int edad = 0;
        double peso = 0;
        double altura = 0;

        System.out.println("Ingresa tu nombre");
        nombre = miescaner.nextLine();

        System.out.println("Ingresa tu edad");
        edad = miescaner.nextInt();

        System.out.println("Ingresa tu peso");
        peso = miescaner.nextDouble();

        System.out.println("Ingresa tu altura");
        altura = miescaner.nextDouble();


        System.out.println("Tu nombre es: " +nombre);

        System.out.println("Tu edad es: " +edad);

        System.out.println("Tu peso es: " +peso);

        System.out.println("Tu altura es: " +altura);


        double altura2 = altura * altura;
        double imc  = peso/altura2;
        System.out.println("Tu IMC es: " + imc);


















    }
}