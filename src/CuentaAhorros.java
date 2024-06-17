import java.util.Scanner;

public class CuentaAhorros {

    public float MontoAhorros;

    public void IngresarMonto(){
        System.out.println("Ingrese el monto de la cuenta de ahorros");
        Scanner sc = new Scanner(System.in);
        MontoAhorros = (float) sc.nextDouble();
    }

    public void VerMonto(){
        System.out.println("Monto de la cuenta de ahorros" + MontoAhorros);
    }

    public void Retirar(){
        System.out.println("Ingrese el monto a retirar:");
        Scanner sc = new Scanner(System.in);
        float retiro = (float) sc.nextDouble();
        if (retiro > MontoAhorros){
            System.out.println("No se puede retirar el monto ingresado, saldo insuficiente");
        } else {
            MontoAhorros = MontoAhorros - retiro;
            System.out.println("Retiro exitoso, saldo actual: " + MontoAhorros);
        }
    }

    public void interes(){
        MontoAhorros = MontoAhorros + (MontoAhorros * 0.06f);
        System.out.println("El monto de la cuenta de ahorros con el interes es: " + MontoAhorros);
    }
}
