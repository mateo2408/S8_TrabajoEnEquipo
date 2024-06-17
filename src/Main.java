import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("Bienvenido al banco");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Cuenta corriente");
            System.out.println("2. Cuenta de ahorros");
            System.out.println("3. CDT");
            System.out.println("4. Salir");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                CuentaCorriente cc = new CuentaCorriente();
                System.out.println("Seleccione una opcion:");
                System.out.println("1. Ingresar monto");
                System.out.println("2. Ver saldo");
                System.out.println("3. Retirar");
                System.out.println("4. Salir");
                Scanner sc1 = new Scanner(System.in);
                int opcion1 = sc.nextInt();
                switch (opcion1) {
                    case 1:
                        cc.ingresomonto();
                        break;

                    case 2:
                        cc.saldo();
                        break;

                    case 3:
                        cc.retiro();
                        break;

                    case 4:
                        break;
                }
                break;

            case 2:
                CuentaAhorros ca = new CuentaAhorros();
                System.out.println("Seleccione una opcion:");
                System.out.println("1. Ingresar monto");
                System.out.println("2. Ver saldo");
                System.out.println("3. Retirar");
                System.out.println("4. Salir");
                Scanner sc2 = new Scanner(System.in);
                int opcion2 = sc.nextInt();
                switch (opcion2) {
                    case 1:
                        ca.IngresarMonto();
                        break;

                    case 2:
                        ca.VerMonto();
                        break;

                    case 3:
                        ca.Retirar();
                        break;

                    case 4:
                        break;
                }
                break;

            case 3:
                CDT cdt = new CDT();
                System.out.println("Seleccione una opcion:");
                System.out.println("1. Ingresar monto");
                System.out.println("2. Ver monto");
                System.out.println("3. Cerrar inversion");
                System.out.println("4. Salir");
                Scanner sc3 = new Scanner(System.in);
                int opcion3 = sc.nextInt();
                switch (opcion3) {
                    case 1:
                        cdt.IngresarMonto();
                        break;

                    case 2:
                        cdt.verMonto();
                        break;

                    case 3:
                        cdt.cerrarinversion();
                        break;

                    case 4:
                        break;
                }
                break;
            case 4:
                System.out.println("Gracias por usar nuestros servicios");
                break;
        }
        }while (opcion != 4);
    }
}