/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventacarros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class VentaCarros {

    private static final Scanner teclado = new Scanner(System.in);
    private static final ArrayList<Carro> ventas = new ArrayList<>();

    private static boolean existeCarro(String placa) {
        boolean existe = false;
        for (Carro carro : ventas) {
            if (carro.getPlaca().equals(placa)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    private static void Menu() {
        int opcion = 0;
        do {
            System.out.println("\t\tMENU OPCIONES ");
            System.out.println("\t1. Agregar Carro");
            System.out.println("\t2. consultar carro por placa");
            System.out.println("\t3. Listar todos los carros registrados con todos sus datos");
            System.out.println("\t4. Salir");
            System.out.println("Ingrese opcion");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1: {
                    AgregarCarro();
                }
                break;
                case 2: {
                    ConsultarCarro();
                }
                break;
                case 3: {
                    ListarCarros();
                }
                break;
                case 4: {
                    System.out.println("Saliendo");
                }
                break;
            }
            System.out.println("Precione enter para continuar");
            teclado.nextLine();
        } while (opcion != 4);
    }

    private static void AgregarCarro() {
        String fallo = teclado.nextLine();
        System.out.println("Ingrese la placa del carro");
        String placa = teclado.nextLine();
        boolean existe = existeCarro(placa);
        if (existe) {
            System.out.println("Esa placa ya esta registrada");
        } else {
            System.out.println("Ingrese la marca del carro");
            String marca = teclado.nextLine();
            System.out.println("Ingrese el color del carro");
            String color = teclado.nextLine();
            System.out.println("Ingrese el modelo del carro");
            int modelo = teclado.nextInt();
            Carro car = new Carro(placa, marca, color, modelo);
            ventas.add(car);
            System.out.println("CARRO AGREGADO CORRECTAMENTE");
        }
    }

    private static void ConsultarCarro() {
        String fallo = teclado.nextLine();
        System.out.println("Ingrese la placa del carro que desea consultar");
        String buscarPlaca = teclado.nextLine();
        boolean existe = false;
        for (Carro carro : ventas) {
            if (carro.getPlaca().equals(buscarPlaca)) {
                System.out.println("Placa del carro: " + carro.getPlaca());
                System.out.println("Marca del carro: " + carro.getMarca());
                System.out.println("Color del carro: " + carro.getColor());
                System.out.println("Modelo del carro: " + carro.getModelo());
                existe = true;
                break;
            }
        }
        if (!existe) {
            System.out.println("No existe carro con esa placa");
        }
    }

    private static void ListarCarros() {
        System.out.println("Los carros registrados fueron: ");
        for (Carro carro : ventas) {
            System.out.println("----------------------------");
            System.out.println("Placa: " + carro.getPlaca());
            System.out.println("Marca: " + carro.getMarca());
            System.out.println("Color: " + carro.getColor());
            System.out.println("Modelo: " + carro.getModelo());
        }
        System.out.println("----------------------------");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu();
    }

}
