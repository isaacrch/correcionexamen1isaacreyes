package isaacreyescorreccionexamen1;

import java.util.Scanner;

public class procesos {

    static int cargo = 1000;
    static String[] nombre = new String[10];
    static long cedula = 0;
    private static Scanner leer = new Scanner(System.in);
    static int indice = 0;
    static long factura = 0;

    static int numEntradasSol = 0;
    static int numEntradasSombra = 0;
    static int numEntradasPref = 0;
    static float totalVentas = 0;
    static float totalCargos = 0;
    static float cargsol = 0;
    static float cargsom = 0;
    static float cargpref = 0;
    static float acusol = 0;
    static float acusom = 0;
    static float acupre = 0;

    public static void entradasSolNorteSur() {
        float entradasol = 10500;
        float totalsol = 0;
        float subtotal = 0;
        char continuar = 'n';
        byte acumulador = 0;
        do {
            if (indice > 9) {
                System.out.println("arreglo lleno");
                continuar = 'n';
            } else {
                System.out.println("digite su nombre: ");
                nombre[indice] = leer.next();
                System.out.println("digite su numero de cedula: ");
                cedula = leer.nextLong();
                System.out.println("digite el numero de factura: ");
                factura = leer.nextLong();
                System.out.println("cuantas entradas desea comprar: ");
                acumulador = leer.nextByte();
                subtotal = entradasol * acumulador;
                float cargoEntrada = acumulador * cargo;
                totalsol = subtotal + cargoEntrada;

                numEntradasSol += acumulador;
                totalVentas += totalsol;
                totalCargos += cargoEntrada;
                cargsol += cargoEntrada;
                acusol = numEntradasSol * 10500 + cargsol;
                System.out.println("numero de factura: " + factura);

                System.out.println("numero de cedula: " + cedula);

                System.out.println("nombre del comprador: " + nombre[indice]);
                indice++;
                System.out.println("localidad: entrada sol ");
                System.out.println("cantidad de entradas: " + acumulador);
                System.out.println("el subtotal es: " + subtotal);
                System.out.println("cargos por servicios: " + cargoEntrada);
                System.out.println("el total es: " + totalsol);
                System.out.println("para regresar al menu principal digite 'n' : ");
                System.out.println("para agragar otro comprador de esta localidad digite 's' : ");
                continuar = leer.next().toLowerCase().charAt(0);
            }
        } while (continuar != 'n');
    }

    public static void SombraEsteOeste() {

        float entradasombra = 20500;
        float subtotal = 0;
        float total = 0;
        char continuar = 'n';
        byte acumulador = 0;
        do {
            if (indice > 9) {
                System.out.println("arreglo lleno");
                continuar = 'n';
            } else {
                System.out.println("digite su nombre: ");
                nombre[indice] = leer.next();
                System.out.println("digite su numero de cedula: ");
                cedula = leer.nextLong();
                System.out.println("digite el numero de factura: ");
                factura = leer.nextLong();
                System.out.println("cuantas entradas desea comprar: ");
                acumulador = leer.nextByte();
                subtotal = entradasombra * acumulador;
                float cargoEntrada = acumulador * cargo;
                total = subtotal + cargoEntrada;

                numEntradasSombra += acumulador;
                totalVentas += total;

                totalCargos += cargoEntrada;
                cargsom += cargoEntrada;
                acusom = numEntradasSombra * 20500 + cargsom;
                System.out.println("numero de factura: " + factura);

                System.out.println("numero de cedula: " + cedula);

                System.out.println("nombre del comprador: " + nombre[indice]);
                indice++;
                System.out.println("localidad: entrada sombra ");
                System.out.println("cantidad de entradas: " + acumulador);
                System.out.println("el subtotal es: " + subtotal);
                System.out.println("cargos por servicios: " + cargoEntrada);
                System.out.println("el total es: " + total);
                System.out.println("para regresar al menu principal digite 'n' : ");
                System.out.println("para agregar otro comprador de esta localidad digite 's' : ");
                continuar = leer.next().toLowerCase().charAt(0);
            }
        } while (continuar != 'n');
    }

    public static void entradasPreferencial() {

        float entradasPref = 25500;
        float subtotal = 0;
        float total = 0;
        char continuar = 'n';
        byte acumulador = 0;
        do {
            if (indice > 9) {
                System.out.println("arreglo lleno");
                continuar = 'n';
            } else {
                System.out.println("digite su nombre: ");
                nombre[indice] = leer.next();
                System.out.println("digite su numero de cedula: ");
                cedula = leer.nextLong();
                System.out.println("digite el numero de factura: ");
                factura = leer.nextLong();
                System.out.println("cuantas entradas desea comprar: ");
                acumulador = leer.nextByte();
                subtotal = entradasPref * acumulador;
                float cargoEntrada = acumulador * cargo;
                total = subtotal + cargoEntrada;

                numEntradasPref += acumulador;
                totalVentas += total;
                totalCargos += cargoEntrada;
                cargpref += cargoEntrada;
                acupre = numEntradasPref * 25500 + cargpref;
                System.out.println("numero de factura: " + factura);

                System.out.println("numero de cedula: " + cedula);

                System.out.println("nombre del comprador: " + nombre[indice]);
                indice++;
                System.out.println("localidad: entrada preferencial ");
                System.out.println("cantidad de entradas: " + acumulador);
                System.out.println("el subtotal es: " + subtotal);
                System.out.println("cargos por servicios: " + cargoEntrada);
                System.out.println("el total es: " + total);
                System.out.println("para regresar al menu principal digite 'n' : ");
                System.out.println("para agregar otro comprador de esta localidad digite 's' : ");
                continuar = leer.next().toLowerCase().charAt(0);
            }
        } while (continuar != 'n');

    }

    public static void reporteVentas() {
        System.out.println("REPORTE DE VENTAS");
        System.out.println("Entradas vendidas en sol: " + numEntradasSol);
        System.out.println("Dinero Acumulado en sol: " + acusol);
        System.out.println("Entradas vendidas en sombra: " + numEntradasSombra);
        System.out.println("Dinero Acumulado en sombra: " + acusom);
        System.out.println("Entradas vendidas en preferencial: " + numEntradasPref);
        System.out.println("Dinero Acumulado en preferencial: " + acupre);
        System.out.println("Total de ventas: " + totalVentas);
        System.out.println("Total de cargos por servicios: " + totalCargos);
    }

    public static void inicializar() {

        for (int i = 0; i < nombre.length; i++) {

            nombre[i] = "";

        }
        System.out.println("*** arreglo inicializado ***");
    }

}
