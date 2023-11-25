package n1exercici2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dni = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdueix el número dni (NO POSIS LA LLETRA)");
        dni = entrada.nextInt();
        entrada.close();
        CalculoDni calculoDni = new CalculoDni(dni);


    }
}
