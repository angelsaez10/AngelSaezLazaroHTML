package ExamenAngelSaezLazaro;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Variables
        int gasto=0;
        int gComida=0,gTransporte=0,gEntretenimiento=0,gOtros=0;
        String tipo="";
        boolean correcto=false;

        //Scanner para pedirle al usuario cosas por teclado
        Scanner sc = new Scanner(System.in);

            //bucle para que el programa pida mas gastos hasta que el usuario introduzca la palabra "salir"
        while (!tipo.equalsIgnoreCase("salir")){

            correcto = false;

            //preguntamos el tipo de gasto o si quiere salir el usuario
            System.out.println("Introduzca el tipo de gasto que quiere almacenar(o escriba 'salir' si no desea ingresar mas gastos):");
            tipo = sc.nextLine();

            //si el usuario introduce salir rompemos el bucle para finalizar el programa
            if (tipo.equalsIgnoreCase("salir")){

                System.out.println("----------Gastos totales----------");
                System.out.println("Gastos por comida:"+gComida+" euros");
                System.out.println("Gastos por transporte:"+gTransporte+" euros");
                System.out.println("Gastos por entretenimientos:"+gEntretenimiento+" euros");
                System.out.println("Otros gastos:"+gOtros);
                System.out.println("Total de gastos generales:"+(gComida+gTransporte+gEntretenimiento+gOtros)+" euros");
                System.exit(0);

            }else {

                while (!correcto) {

                    //preguntamos la cantidad que se gasta para la categoria que nos han dado
                    System.out.println("Introduzca el gasto:");
                    gasto = sc.nextInt();

                    //comprobamos que el valor que nos ingresa el usuario para los gastos es mayor que 0
                    if (gasto < 0){

                        System.err.println("No se puede introducir un gasto negativo, por favor introduzca un valor positivo.");

                    }else correcto = true;
                }
                sc.nextLine();

                //si el usuario introduce el tipo de gasto comida
                if (tipo.equalsIgnoreCase("comida")){

                    gComida =+ gasto;
                    System.out.println("Se han sumado "+gasto+" euros al total de gastos por comida.");

                    //si el usuario introduce el tipo de gasto transporte
                } else if (tipo.equalsIgnoreCase("transporte")) {

                    gTransporte =+ gasto;
                    System.out.println("Se han sumado "+gasto+" euros al total de gastos por transporte.");

                    //si el usuario introduce el tipo de gasto entretenimiento
                } else if (tipo.equalsIgnoreCase("entretenimiento")) {

                    gEntretenimiento =+ gasto;
                    System.out.println("Se han sumado "+gasto+" euros al total de gastos por entretenimiento.");

                    //si el usuario introduce el tipo de gasto otros
                } else if (tipo.equalsIgnoreCase("otros")) {

                    gOtros =+ gasto;
                    System.out.println("Se han sumado "+gasto+" euros al total de gastos por otros.");

                    //si no nos da ninguno de los valores que estamos almacenando indicamos el error al usuario
                }else {

                    System.err.println("El tipo de gasto que se ha introducido no se contempla, por favor intentelo de nuevo.");

                }
            }
        }
    }
}
