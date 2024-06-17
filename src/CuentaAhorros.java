import java.util.Scanner;

public class CuentaAhorros {

    public float Monto;

    public void IngresarMonto(){
        System.out.println("Ingrese el monto de la cuenta de ahorros");
        Scanner sc = new Scanner(System.in);
        Monto = (float) sc.nextDouble();
    }

    public void VerMonto(){
        System.out.println("Monto de la cuenta de ahorros" + Monto);
    }

    public void Retirar(){
        System.out.println("Ingrese el monto a retirar:");
        Scanner sc = new Scanner(System.in);
        float retiro = (float) sc.nextDouble();
        if (retiro > Monto){
            System.out.println("No se puede retirar el monto ingresado, saldo insuficiente");
        } else {
            Monto = Monto - retiro;
            System.out.println("Retiro exitoso, saldo actual: " + Monto);
        }
    }
}
