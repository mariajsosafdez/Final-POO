package punto_tres;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de casos a realizar");
        int cantidadCasos = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < cantidadCasos; i++) {
            System.out.println("Ingrese la suma");
            String cosa = sc.nextLine();
            String[] cosito = cosa.split(" ");
            System.out.println(cosa);
            if (Long.parseLong(cosito[0]) > Integer.MAX_VALUE) {
                System.out.println("First number is too big");
            }
            if (Long.parseLong(cosito[2]) > Integer.MAX_VALUE) {
                System.out.println("Second number is too big");
            }
            if (cosito[1].equalsIgnoreCase("+") && (Long.parseLong(cosito[0]) + Long.parseLong(cosito[2])) > Integer.MAX_VALUE) {
                System.out.println("Result is too big");
            } else if (cosito[1].equalsIgnoreCase("*") && (Long.parseLong(cosito[0]) * Long.parseLong(cosito[2])) > Integer.MAX_VALUE) {
                System.out.println("Result is too big");
            }
            System.out.println("====================");
        }
    }
}
