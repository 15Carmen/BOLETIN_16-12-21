import java.util.Scanner;

public class Ejercicio_4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num, auxiliar, inverso = 0, cifra;

        do {
            System.out.println("Introduce un número");
            num = sc.nextInt();
        }while (num < 10);

        auxiliar = num;

        while (auxiliar!=0){
            cifra = auxiliar%10;
            inverso = inverso*10+cifra;
            auxiliar = auxiliar/10;
        }

        if (num == inverso){
            System.out.println("El número es capicúa");
        }else {
            System.out.println("El número no es capicúa");
        }
    }
}
