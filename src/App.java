import java.util.Scanner;
import numero.*;
import poliretos.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ariel Dax Navarrete Freire  -- 17*****0");

        System.out.print("Ingrese el tamaño/nivel: ");
        Integer lv = sc.nextInt();
        System.out.println("Ingrese el caracter con el que dibujar");
        String c = sc.nextLine();

        Numero n = new Numero(lv, c);
        n.imprimirNumero();
        sc.close();

    }
}
