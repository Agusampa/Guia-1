package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        int N = 1;
        double A = 2;
        char C = 'a';
        System.out.print("Valores " + N  + " " + A + " " + C);
        //String name = "hola";
        double suma = N + A;
        double resta = A - N;
        int valorNumerico = C;
        System.out.print("\nSuma (N+A) = " + suma + "\nResta (A-N) =" + resta + "\nValor Numerico: " + valorNumerico);
        //2)
        int x = 1, y = 2;
        double NN = 3, M = 4;
        double suma4  = x + y + NN + M;
        double multiplicacion = x * y * NN * M;
        System.out.printf("\nSuma (x + y + NN + M) = " + suma4 + "\nMultiplicacion (x * y * NN * M) = " + multiplicacion);
        //3)
        int NNN = 1;
        NNN = NNN + 77;
        while (NNN!=3){
            NNN--;
        }
        NNN = NNN * 2;
        System.out.printf("NNN = " + NNN);
        //4)
        int T=1, R=2, E=3, I=4, aux;
        aux = R; R=C; E=T; A=E; I = aux;
        //5)
        int AA = 42;
        if(AA%2==0){
            System.out.printf("\nEl valor es par!");
        }else{
            System.out.printf("\nEL valor es impar!");
        }
        //6)
        int BB = 20;
        if(BB>=0){
            System.out.printf("\nEl valor es positivo!");
        }else {
            System.out.printf("\nEL valor es negativo!");
        }
        //7)
        int CC = 75;
        if(CC>=0){
            System.out.printf("\nEl valor CC es positivo!");
        }else {
            System.out.printf("\nEL valor CC es negativo!");
        }
        if(CC%2==0){
            System.out.printf("\nEl valor CC es par!");
        }else{
            System.out.printf("\nEL valor CC es impar!");
        }
        if(CC%5==0){
            System.out.printf("\nEl valor CC es multiplo de 5!");
        }else{
            System.out.printf("\nEL valor CC no es multiplo de 5!");
        }
        if(CC%10==0){
            System.out.printf("\nEl valor CC es multiplo de 10!");
        }else{
            System.out.printf("\nEL valor CC no es multiplo de 10!");
        }
        if(CC<100){
            System.out.printf("\nEl valor CC es menor que 100");
        }else{
            System.out.printf("\nEl valor CC es mayor a 100");
        }
        //8)
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese su nombre porfis: ");
        String nombre = sc.nextLine();
        System.out.println("Buenos dias "+nombre);
        //9
        System.out.printf("Ingrese un valor: ");
        int valor = sc.nextInt();
        int doble = valor *2, triple = valor * 3;
        System.out.printf("El doble de su valor es " + doble + "\nEl triple de su valor es " + triple);
        //10
        System.out.printf("\nIngrese la temperatura en grados Fahrenheit ");
        int Fahrenheit = sc.nextInt();
        float Centigrados = (Fahrenheit - 32)*5/9;
        System.out.printf("\nLa temperatuda en grados Centigrados es " + Centigrados);
        //11
        System.out.printf("\nIngrese el valor del radio de la circunferencia");
        double Radio = sc.nextDouble();
        double Longitud = (2*Math.PI) * Radio;
        double Area = Math.PI * Math.pow(Radio,2);
        System.out.printf("\nLongitud = "+Longitud+"\nArea = "+Area);
        //12
        System.out.printf("\nIngrese una velocidad en km/h :");
        float velocidadKm = sc.nextFloat();
        System.out.printf("\nLa velocidad en m/s es = " + (velocidadKm * 5/18));
        //13
        System.out.printf("\nIngrese el valor del cateto menor y el cateto mayor (en ese orden) ");
        float catetoMenor = sc.nextFloat(), catetoMayor = sc.nextFloat();
        float Hipotenusa = (float) Math.sqrt((Math.pow(catetoMenor,2))+(Math.pow(catetoMayor,2)));
        System.out.printf("\nEl valor de la hipotenusa es : " + Hipotenusa);
        //14
        System.out.printf("\nIngrese el radio de la esfera: ");
        float radioEsfera = sc.nextFloat();
        System.out.printf("\nEl area de la esfera es : " + (1.33*Math.PI*Math.pow(radioEsfera,2)));
        //15
        System.out.printf("\nIngrese el valor de los 3 lados de un triangulo: ");
        float lado1 = sc.nextFloat(), lado2 = sc.nextFloat(), lado3 = sc.nextFloat();
        float semiPerimetro = (lado1 +  lado2 + lado3) / 2;
        System.out.printf("\nEl area del triangulo es : " + Math.sqrt(semiPerimetro * (semiPerimetro-lado1) * (semiPerimetro-lado2) * (semiPerimetro-lado3)));
        //16
        System.out.printf("\nIngrese un numero de 3 cifras: ");
        int numero = sc.nextInt();
        System.out.printf("Primer cifra: "+ numero/100);
        System.out.printf("\nSegunda cifra "+ numero/10%10);
        System.out.printf("\nTercera cifra "+ numero%10);
        //17
        System.out.printf("\nIngrese un numero de 5 cifras: ");
        int numeroo = sc.nextInt();
        System.out.printf("Primer cifra: "+ numeroo/10000);
        System.out.printf("\nSegunda cifra "+ numeroo/100%10);
        System.out.printf("\nTercera cifra "+ numeroo%10);
        //18
        System.out.printf("\nIngrese un hora, minutos y segundos");
        int H = sc.nextInt(), MM = sc.nextInt(), S = sc.nextInt();
        if (H >= 0 && H < 24 && MM >= 0 && MM < 60 && S >= 0 && S < 60) {
            System.out.printf("\nLa hora ingresada es " + H + ":" + M + ":" + S);
        } else{
            System.out.printf("\nLa hora ingresada es incorrecta: ");
            }


        }
    }