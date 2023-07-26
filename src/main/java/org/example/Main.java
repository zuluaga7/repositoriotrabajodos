package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//declarando variables

        String nombreUsuario;
        int puntajeCredito;
        byte edad;
        short numeroUsosTarjetaMes;
        int totaPesosProductosAseo;
        int totaPesosAlimentos;
        int totaPesosOtros;

        Scanner teclado = new Scanner(System.in);

        //iniciando variables

        System.out.println("*****Bienvenidos a tu crédito z****");
        System.out.println("*****Para conocer su proceso digite: ");
        System.out.print("Digita su nombre: ");
        nombreUsuario = teclado.nextLine();
        System.out.print("Digita el puntaje de tu tarjeta de credito: ");
        puntajeCredito = teclado.nextInt();
        System.out.print("Digite su edad: ");
        edad = teclado.nextByte();
        System.out.print("Digite cuánto dinero se gastó en productos de aseo este mes: ");
        totaPesosProductosAseo = teclado.nextInt();
        System.out.print("Digite cuánto dinero se gastó en alimentos este mes: ");
        totaPesosAlimentos = teclado.nextInt();
        System.out.print("Digite cuánto dinero se gastó en otras cosas este mes: ");
        totaPesosOtros = teclado.nextInt();

        //  proceso
        double totalcuenta = totaPesosAlimentos + totaPesosOtros + totaPesosProductosAseo;
        System.out.println("el total de su cuenta es: " + totalcuenta);

        double porcentaje;
        if (puntajeCredito == 1) {
            porcentaje = 0.25; // 25%
        } else if (puntajeCredito == 2) {
            porcentaje = 0.2; // 20%
        } else if (puntajeCredito == 3) {
            porcentaje = 0.15; // 15%
        } else if (puntajeCredito == 4) {
            porcentaje = 0.1; // 10%
        } else if (puntajeCredito >= 5 && puntajeCredito <= 9) {
            porcentaje = 0; //0%
            System.out.println("No tienes descuento");
        } else {
            System.out.println("Extracto no valido");
            return;
        }
        double descuento=totalcuenta*porcentaje;
        double totalPagar=totalcuenta-descuento;

        System.out.println("Su descuento es de: " +descuento );
        System.out.println("Señor " + nombreUsuario +" el total de su cuenta es: " + totalPagar );




    }
}
