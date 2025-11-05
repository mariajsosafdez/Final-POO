package punto_dos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static Cliente mayorMontoCompra(ArrayList<Cliente> clientes) {
        Cliente clienteMayor = clientes.getFirst();
        for (Cliente c : clientes) {
            if (c.getMontoCompra().doubleValue() > clienteMayor.getMontoCompra().doubleValue()) {
                clienteMayor = c;
            }
        }
        return clienteMayor;
    }

    static double promedioCompra(ArrayList<Cliente> clientes) {
        double promedio = 0;
        for (Cliente c : clientes) {
            promedio += c.getMontoCompra().doubleValue();
        }
        return promedio / clientes.size();
    }

    static String menuChafa() {
        System.out.println("========== Menú sin presupuesto ==========");
        System.out.println("1. Crear cliente");
        System.out.println("2. Crear admin");
        System.out.println("3. Mirar cliente con mayor monto compra");
        System.out.println("4. Promedio de las compras");
        System.out.println("0. Salir 👋🗿");
        System.out.println("==============================");
        return sc.nextLine();
    }

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Administrador> administradores = new ArrayList<>();
        while (true) {
            switch (menuChafa()) {
                case "1": //crear cliente
                    System.out.println("Ingrese el id del cliente");
                    String idC = sc.nextLine();
                    System.out.println("Ingrese el nombre del cliente");
                    String nombreC = sc.nextLine();
                    System.out.println("Ingrese el monto de compra");
                    BigDecimal montocompra = BigDecimal.valueOf(Integer.parseInt(sc.nextLine()));
                    try {
                        clientes.add(new Cliente(idC,nombreC,montocompra));
                    }catch (InvalidNameException e){
                        System.out.println(e.getMessage());
                        System.out.println("No nos robes por favor");
                        break;
                    }
                    System.out.println("Cliente creado con éxito");
                    break;
                case "2": //crear admin
                    System.out.println("Ingrese el id del admin");
                    String idA = sc.nextLine();
                    System.out.println("Ingrese el nombre del admin");
                    String nombreA = sc.nextLine();
                    try {
                        administradores.add(new Administrador(idA,nombreA));
                    }catch (InvalidNameException e){
                        System.out.println(e.getMessage());
                        System.out.println("No tienes poder");
                        break;
                    }
                    System.out.println("Admin creado con éxito");
                    break;
                case "3": //mayor monto compra
                    System.out.println(mayorMontoCompra(clientes));
                    break;
                case "4": //promedio
                    System.out.println(promedioCompra(clientes));
                    break;
                case "0": //chao
                    System.out.println("Chao con adiós 👋🦕");
                    System.exit(0);
                default:
                    System.out.println("Escriba bien bobote");
            }
        }
    }
}
