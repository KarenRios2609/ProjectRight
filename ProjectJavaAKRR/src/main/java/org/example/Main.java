package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Desarrollar un programa que le pregunte al usuario 3 num.
        // y decirle cuál es mayor de los 3

        /*int num1;
        int num2;
        int num3;
        int num4;
        System.out.println("Ingresa 4 números: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();

        if (num1 > num2 && num1 >num3 && num1 > num4){
            System.out.println("El primer número es mayor");
        }
        if (num2 > num1 && num2 > num3 && num2 > num4){
            System.out.println("El segundo numero es el mayor");
        }
        if (num3 > num1 && num3 > num2 && num3 > num4){
            System.out.println("El tercer numero es el mayor");
        }
        if (num4 > num1 && num4 > num2 && num4 > num3){
            System.out.println("El cuarto numero es el mayor");
        }


        if (num1 == num2 && num1 == num3 && num3==num4 ){
            System.out.println("Todos son iguales");
        }/*
         */

        /*for (int i= 0; i<10; i++){
            System.out.println("i vale: " +i);
        }*/

        /*String nombre;


        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa tu nombre: ");
            nombre = scanner.nextLine();//karen mau
            System.out.println("Tu nombre es: " + nombre);
        }*/
        //Pedirle 1 numero al usuario  y mostrarlo pero elevarlo al cuadrado, y repetirlo 3 veces

        /*int num;


        for(int i = 0; i<3; i++){
            System.out.println("Ingresa un numero: ");
            num = scanner.nextInt();
            int num2 = num*num;
            System.out.println("El numero elevado al cuadrado es: "+num2);
        }*/

        /*int num;
        int num2;

        for(int i = 0; i<6; i++){
            System.out.println("Ingresa el numero 1: ");
            num = scanner.nextInt();
            System.out.println("Ingresa el numero 2: ");
            num2 = scanner.nextInt();
            int result = num + num2;
            System.out.println("La suma del los numeros son: "+result);
        }*/

        /*int edad;

        for(int i = 0; i<4; i++){
            System.out.println("Ingresa tu edad: ");
            edad = scanner.nextInt();

            if(edad>17){
                System.out.println("Eres mayor de edad");
            }else{
                System.out.println("Eres menor de edad");
            }
        }*/

        double miArrayDouble[] = new double[7];
        for(int i = 0; i<7; i++){
            miArrayDouble[i] = scanner.nextDouble();
        }


































    }
}