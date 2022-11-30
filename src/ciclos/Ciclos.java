/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclos;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author SEBASTIAN
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Scanner scan = new Scanner(System.in);
        String materias, mate, espa, ingles, materia;
        mate = "Matematicas";
        espa = "Español";
        ingles = "Ingles";

        System.out.println("Porfavor ingresa el numero de la materia que quieres calcular el promedio:\n"
                + "1.Matematicas\n" + "2.Español\n" + "3.Ingles");
        System.out.println("---------------------------------------------");
        materias = scan.next();
        materia = materias.toString();

        if (null == materia) {
            System.out.println("No ha ingresado un numero valido");
        } else {
            switch (materia) {
                case "1":
                    materias = mate;
                    System.out.println("Ingresaras las notas de Matematicas");
                    System.out.println("---------------------------------------------");
                    notasMate();

                    break;
                case "2":
                    materias = espa;
                    System.out.println("Ingresaras las notas de Español");
                    System.out.println("---------------------------------------------");
                    notasEspa();
                    break;
                case "3":
                    materias = ingles;
                    System.out.println("Ingresaras las notas de Ingles");
                    System.out.println("---------------------------------------------");
                    notasIngles();
                    break;
                default:
                    System.out.println("No ha ingresado un numero valido");
                    System.out.println("---------------------------------------------");
                    break;
            }
        }

        System.out.println("mate: " + materias);

    }

    static void notasMate() {

        Scanner scan = new Scanner(System.in);
        float notas = 0;
        int contador;
        DecimalFormat df = new DecimalFormat("#.0");

        System.out.println("Cuantas notas deseas ingresar? ");
        contador = Integer.parseInt(scan.next());
        System.out.println("---------------------------------------------");

        for (int i = 1; i <= contador; i++) {
            System.out.println("Porfavor ingrese la " + i + "a nota, no mayor a 5.0");
            float n = scan.nextFloat();
            System.out.println("---------------------------------------------");
            if (n > 5.0) {
                System.out.println("Ingreso un numero invalido");
                System.out.println("---------------------------------------------");
            } else {
                notas += n;
            }
        }
        float promedio = notas / contador;
        System.out.println("Tu promedio en Matematicas es de " + df.format(promedio));
        System.out.println("---------------------------------------------");
    }

    static void notasEspa() {

        Scanner scan = new Scanner(System.in);
        float notas = 0;
        int contador;
        int i = 1;
        DecimalFormat df = new DecimalFormat("#.0");

        System.out.println("Cuantas notas deseas ingresar? ");
        contador = Integer.parseInt(scan.next());
        System.out.println("---------------------------------------------");

        while (i <= contador) {
            System.out.println("Porfavor ingrese la " + i + "a nota, no mayor a 5.0");
            float n = scan.nextFloat();
            System.out.println("---------------------------------------------");
            if (n > 5.0) {
                System.out.println("Ingreso un numero invalido");
                System.out.println("---------------------------------------------");
            } else {
                notas += n;
                i++;
            }
        }
        float promedio = notas / contador;
        System.out.println("Tu promedio en Español es de " + df.format(promedio));
        System.out.println("---------------------------------------------");
    }

    static void notasIngles() {

        Scanner scan = new Scanner(System.in);
        float notas = 0;
        int contador;
        int i = 1;
        DecimalFormat df = new DecimalFormat("#.0");

        System.out.println("Cuantas notas deseas ingresar? ");
        contador = Integer.parseInt(scan.next());
        System.out.println("---------------------------------------------");

        do {
            System.out.println("Porfavor ingrese la " + i + "a nota, no mayor a 5.0");
            float n = scan.nextFloat();
            System.out.println("---------------------------------------------");
            if (n > 5.0) {
                System.out.println("Ingreso un numero invalido");
                System.out.println("---------------------------------------------");
            } else {
                notas += n;
                i++;
            }
        } while (i <= contador);
        float promedio = notas / contador;
        System.out.println("Tu promedio en Ingles es de " + df.format(promedio));
        System.out.println("---------------------------------------------");
    }
}
