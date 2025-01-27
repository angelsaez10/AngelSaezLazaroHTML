package ExamenAngelSaezLazaro;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        //variables
        int pokemonInicial=-1,contador = 1,yo=-1,el=-1,v1=100,v2=100;
        String miPokemon="";
        Random objetoRandom= new Random();
        int n = (int) Math.round(Math.random() * 1);
        boolean valido = false,vivo = true;

        //pokemonInicial= la eleccion de pokemon que hace el usuario
        //contador= cuenta los turnos de juego empezando desde 1(por los turnos)
        //yo = la accion que realiza el usuario
        //el = la accion que realiza el rival(automatica)
        //v1 = la vida del pokemon del usuario
        //v2 = la vida del pokemon del rival
        //miPokemon = el nombre del pokemon que elijo
        //objetoRandom = objeto random para crear numero aleatorios
        //n = para crear numeros aleatorios(en este caso para la opcion que decidira lo que hace el rival)
        //valido = para comprobar que la eleccion de pokemon es correcta

        //scanner para leer cosas por teclado
        Scanner sc = new Scanner(System.in);

        //imprimimos la bienvenida y le damos a elegir al usuario el pokemon inicial
        System.out.println("!Bienvenido a la batalla Pokemon¡");
        System.out.println();
        System.out.println("Elige a tu Pokemon inicil:");
        System.out.println("1 .Charmander");
        System.out.println("2 .Bulbasur");
        System.out.println("3 .Squirtle");

        //mientras no se valido es decir, mientras el usuario nos de un valor que no sea ni 1 ni 2 ni 3 seguira pidiendo el numero
        while (!valido) {

            //pedimos el numero del pokemon
                System.out.println("Selecciona el numero correspondiente:");
                pokemonInicial = sc.nextInt();

                //si el la eleccion del usuario es un numero entre 1 y 3 la opcion es valida
                if (pokemonInicial > 0 && pokemonInicial <= 3) {

                    valido = true;

                } else System.err.println("Introduzca una opcion de 1 a 3");

        }
            sc.nextLine();

            //segun la opcion que haya elegido hacemos una cosa u otra
            switch (pokemonInicial) {

                //si 1 ,charmander
                case 1:

                    System.out.println("Has elegido a Charmander.");
                    miPokemon = "Charmander";
                    break;

                //si 2 ,bulbasur
                case 2:

                    System.out.println("Has elegido a Bulbasur.");
                    miPokemon = "Bulbasur";
                    break;

                //si 3 ,Squirtle
                case 3:

                    System.out.println("Has elegido a Squirtle.");
                    miPokemon = "Squirtle";
                    break;

                //si cualquier otra cosa mensaje de error(vuelve a pedir el numero porque el numero introducido no es valido)
                default:
                    System.err.println("El valor introducido no es correcto.");

            }

            System.out.println();
            //generamos el rival basandonos en la eleccion del usuario
            System.out.println("Generando rival al azar:");

            //si el usuario elige a charmander creamos un numero aleatorio de 0 a 1, si es 0 el rival es bulbasur y si es 1 el rival es squirtle
           if (miPokemon.equalsIgnoreCase("Charmander")){

               if (n == 0){

                   System.out.println("El rival es Bulbasur.");

               }else System.out.println("El rival es Squirtle.");

               //si el usuario elige a bulbasur creamos un numero aleatorio de 0 a 1, si es 0 el rival es charmander y si es 1 el rival es squirtle
           } else if (miPokemon.equalsIgnoreCase("Bulbasur")) {

               if (n == 0){

                   System.out.println("El rival es Charmander.");

               }else System.out.println("El rival es Squirtle.");

               //si el usuario elige a squirtle creamos un numero aleatorio de 0 a 1, si es 0 el rival es charmander y si es 1 el rival es bulbasur
           }else {
               if (n == 0){

                   System.out.println("El rival es Charmander.");

               }else System.out.println("El rival es Bulbasur.");
           }

        //buble para que mientras ambos esten vivos se ejecute el programa
        while (vivo){

            //imprimimos menu
            System.out.println();
            System.out.println("---Turno "+contador+"---");
            System.out.println("¿Que deseas hacer?");
            System.out.println("1 .Atacar");
            System.out.println("2 .Defender");
            System.out.print("Seleccione el numero correspondiente:");

            //pedimos al usuario la accion
            yo = sc.nextInt();
            sc.nextLine();

            //generamos una numero aleatorio entre 0 y 1 para la accion del rival
            int accion = (int) Math.round(Math.random() * 1);

            //dependiendo del numero aleatorio que haya generado le damos un valor a la accion del rival,
            // si es 0 ataca y si es 1 se defiende
            switch (accion){

                case 0:

                    el = 1;
                    break;

                case 1:

                    el = 2;
                    break;

            }

            //si el usuario introduce el 1(atacar) comprobamos si la accion del rival es defenderse o no, si se defiende
            // el daño que nosotros causamos se divide a la mida y se le resta a la vida del rival, si no se defiende
            // el daño que causamos se resta a la vida del rival
            switch (yo){

                case 1:

                    //generamos daño aleatorio entre 0 y 15 y le sumamos 10 para que el rango sea de 10 a 25
                    int dañoM = objetoRandom.nextInt(15);
                    dañoM += 10;

                    //si el rival se defiende, nuestro daño se reduce a la mitad
                    if (el == 2) {

                        dañoM /=2;
                        System.out.println(miPokemon + " ataca y causa " + dañoM + " puntos de vida al rival");
                        v2 -= dañoM;

                        //si el rival no se defiende se le resta el daño a su vida
                    }else {

                        System.out.println(miPokemon + " ataca y causa " + dañoM + " puntos de vida al rival");
                        v2 -= dañoM;

                    }

                    //si la vida del pokemon 2 es menor o igual que 0(no le queda vida) el pokemon muere y el bucle que
                    // va generando turnos termina
                    if (v2 <= 0){
                        vivo = false;
                    }
                    break;

                case 2:

                    //si el usuario introduce 2 se defiende
                    System.out.println("Te estas defendiendo.");
                    break;

            }

            //si el rival le ha tocado el 1(atacar) comprobamos si la accion del usuario es defenderse o no, si se defiende
            // el daño que el rival causa se divide a la mida y se le resta a la vida del usuario, si el usuario no se defiende
            // el daño que causamos se resta al usuario
            switch (el){

                case 1:

                    //generamos daño aleatorio entre 0 y 15 y le sumamos 10 para que el rango sea de 10 a 25
                    int dañoS =  objetoRandom.nextInt(15);
                    dañoS += 10;

                    //si la accion del usuario es 2(defenderse), el daño del rival se divide a la mitad y se le resta a la
                    //vida del usuario
                    if (yo == 2) {

                        dañoS /=2;
                        System.out.println("El rival ataca y causa " + dañoS + " puntos de vida a "+miPokemon);
                        v1 -= dañoS;

                        //si el usuario no se defiende(ataca), el daño del rival se le resta a la vida del usuario
                    }else {

                        System.out.println("El rival ataca y causa " + dañoS + " puntos de vida a "+miPokemon);
                        v1 -= dañoS;

                    }

                    //si la vida del pokemon 1 es menor o igual que 0(no le queda vida) el pokemon muere y el bucle que
                    // va generando turnos termina
                    if (v1 <= 0){

                        vivo = false;

                    }

                    break;

                case 2:

                    //si al rival le toca el 2 se defiende
                    System.out.println("El rival se defiende.");
                    break;
            }

            //salto de linea
            System.out.println();

            //imprimimos la vida de ambos pokemons
            System.out.println("Charmander:"+v1+"ps");
            System.out.println("Rival:"+v2+"ps");

            //comparar las vidas para determinar quien gana
            if (v1 > v2){

                System.out.println(miPokemon+" va ganando.");

            } else if (v2 > v1) {

                System.out.println("El rival va ganando.");

            }else System.out.println("El combate esta empatado");

            //salto de linea
            System.out.println();

            //si la vida del usuario es menor o igual que 0 el rival gana
            if (v1 <= 0){

                System.out.println(miPokemon+" ha muerto, el rival gana.");

            }

            //si la vida del rival es menor o igual que 0 el usuario gana
            if (v2 <= 0){

                System.out.println("El rival ha muerto "+miPokemon+" gana");

            }

            //incrementamos el contador que cuenta los turnos
            contador++;
        }
    }
}
