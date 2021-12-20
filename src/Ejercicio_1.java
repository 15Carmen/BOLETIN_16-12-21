import java.util.Scanner;

public class Ejercicio_1 {

   /*
   Ejercicio 1. Realizar un programa para jugar a adivinar un número entre 0 y 100. El programa irá dando
    pistas al jugador indicándole si el número introducido por el jugador es menor o mayor que el número
    que tiene que adivinar. El juego termina cuando el jugador adivina el número o decide terminar de
    jugar (por ejemplo, escribiendo un número negativo). Usaréis el método Math.random()
*/
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int numero;
        int aleatorio;
        int contador=0;

        aleatorio = calcularRandom();

        do{
            numero = leerNum();

            if (numero<aleatorio){
                System.out.println("El numero que buscas es mayor");
                contador++;
            }else if (numero>aleatorio){
                System.out.println("El numero que buscas es menor");
                contador++;
            }else{
                System.out.println("Enhorabuena!!! Has acertado. Tus intentos han sido: "+ contador);
            }

        }while(numero!=aleatorio || numero>=0);
    }

    public static int leerNum(){

        System.out.println("Introduzca un numero entre 0 y 100");
        return sc.nextInt();

    }

    public static int calcularRandom(){

        int num = (int) (Math.random()*101);
        return num;
    }
}
