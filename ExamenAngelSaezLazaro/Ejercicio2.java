package ExamenAngelSaezLazaro;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //variables
        String nombre,cElectronico,contraseña,numeroT;
        boolean creada = false,valido = false;

        //scanner para leer cosas por teclado
        Scanner sc = new Scanner(System.in);

        //mensaje de bienvenida al programa
        System.out.println("****************************************");
        System.out.println("Bienvenido al sistema de creacion");
        System.out.println(" de cuenta bancaria");
        System.out.println("****************************************");

        //mientras la cuenta no se cree siguie pidiendo los datos
        while (!creada){

            //pedimos el nombre
            while (!valido) {
                System.out.println("Ingrese su nombre:");
                nombre = sc.nextLine();

                //si el nombre esta vacio mostrara un error
                if (nombre == null){

                    System.err.println("El nombre no puede estar vacio,introduzca un nombre");

                    //si no esta vacio el nombre es correcto
                }else{

                    valido = true;

                }

                //volvemos a dejar valido en false para usarlo con la contraseña
                valido = false;
            }

            //mientras que el correo no sea valido lo seguimos pidiendo
            while (!valido){

                //pedimos el correo electronico
                System.out.println("Ingrese su correo electronico:");
                cElectronico = sc.nextLine();

                //si el correo electronico no coincide con la expresion regular muestra un error
                if (!cElectronico.matches(".+@.+[(com)|(es)|(COM)|(ES)]")){

                    System.err.println("El correo electronico no cumple con los requisitos de validacion, pruebe de nuevo");

                    //si coincide el correo sera valido
                }else {

                    valido = true;

                }
            }

            //volvemos a dejar valido en false para usarlo con la contraseña
            valido = false;

            //mientras que la contraseña no sea valida estara pidiendola
            while (!valido){

                //pedimos la contraseña
                System.out.println("Ingrese su contraseña de acceso:");
                contraseña = sc.nextLine();

                //si la contraseña no coincide con el expresion regular mostrara un error
                if (!contraseña.matches("(.+){8}")){

                    System.err.println("La contraseña no cumple con el minimo de caracteres validos, introduzca minimo 8 caracteres");

                    //si coincide la contraseña sera valida
                }else {

                    valido = true;

                }
            }

            //volvemos a dejar valido en false para usarlo con la contraseña
            valido = false;

            //mientras que el numero de telefono no sea valido lo seguira pidiendo
            while (!valido){

                //pedimos el numero de telefono
                System.out.println("Ingrese su numero de telefono:");
                numeroT = sc.nextLine();

                //la longitud del numero de telefono tiene que ser 10, si no mostrara un error
                if (numeroT.length() != 10 ){

                    System.err.println("El numero de telefono no cumple con el formato valido, introduzca 10 numeros");

                    //si no comprobara si todos los caracteres introducidos son numeros y si no lo son mostrara un error
                }else if (!numeroT.matches("[0-9]{10}")){

                    System.err.println("El numero de telefono no cumple con el formato valido, introduzca 10 numeros");

                    //si la longitud del numero es 10 y son todo numeros el numero de telefono es correcto
                }else {

                    valido = true;

                }
            }

            //si todos los campos son correctos se crea la cuenta y ahi acaba el bucle
            creada = true;
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Todos los datos han sido guardados correctamente, su cuenta ha sido creada.");

            //no compruebo que el resto de campos sean null porque ya tienene sus propios requisitos ya sean de longitud o de formato
            // que impedirian al campo ser null

        }

    }
}
