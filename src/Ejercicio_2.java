import java.util.Scanner;

public class Ejercicio_2 {

    /*
    Ejercicio 2. Realizar un programa que lea una serie de números enteros positivos hasta que se
introduzca un cero y muestre la cantidad de números introducidos, la media, el número mayor y el
número menor.
     */

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        do{

            System.out.println(leerNum());

        }while(sc.nextInt()!=0);

            System.out.println("El número mayor es: " + mayor(sc.nextInt()));
            System.out.println("El número menor es: " + menor(sc.nextInt()));
        }

    public static int leerNum(){

        System.out.println("Introduzca un número entero positivo:");
        return sc.nextInt();
    }

    public static int mayor(int num){
        int numMayor =0;
            if (numMayor<=num){
                numMayor=num;
            }
        return numMayor;
    }

    public static int menor(int num){
        int numMenor = 999999999;
        if (numMenor>=num){
            numMenor=num;
        }
        return numMenor;
    }

}
