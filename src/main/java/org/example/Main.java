package org.example;

import java.util.Scanner;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {
    //DECLARANDO LOS DATOS DE ENTRADA DEL PROBLEMA
        String ubicacionUsuario;
        String destino;
        String nombreUsuario;
        String telefonoUsuario;

        //DECLARAR UN DATO PARA CAPTURAR INFORMACION DESDE EL TECLADO
        Scanner teclado=new Scanner(System.in);

        //ESPACIO PARA INICIALIZAR LAS VARIABLES
        System.out.println("\u001B[34m transportandose \u001B[0m");

        System.out.print("Digite su ubicacion: ");
        ubicacionUsuario=teclado.nextLine();

        System.out.print("Digite su destino: ");
        destino=teclado.nextLine();

        System.out.print("Digite su nombre: ");
        nombreUsuario=teclado.nextLine();

        System.out.print("Digite su telefono: ");
        telefonoUsuario=teclado.nextLine();

        //PROCESO DEL PROBLEMA

        String distancia="20";//ESTO ES UN TEXTO
        //DEBO HACER PARSEO DE LA VARIABLE distancia
        //PARSEO=CAMBIAR O MODIFICAR EL TIPO DE DATO DE UNA VARIABLE

        Integer distanciaEnEntero=Integer.parseInt(distancia);

        Integer costoPorkilometro=6800;
        Integer cobroTotal=distanciaEnEntero*costoPorkilometro;

        //SALIDAS DEL PROBLEMA
        System.out.println("\u001B[35m señor Usuario: "+ nombreUsuario  +"\u001B[0m");













    }
}