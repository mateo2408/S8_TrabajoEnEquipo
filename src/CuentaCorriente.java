import java.util.Scanner;

public class CuentaCorriente {

    public float saldo;

    public void ingresomonto () {
        System.out.println("Ingrese el monto de la cuenta corriente:");
        Scanner sc = new Scanner(System.in);
        saldo = (float) sc.nextDouble();
    }

    public void saldo (){
        System.out.println("Saldo de la cuenta corriente es: " + saldo);
    }

    public void retiro(){
        System.out.println("Ingrese el monto a retirar:");
        Scanner sc = new Scanner(System.in);
        float retiro = (float) sc.nextDouble();
        if (retiro > saldo){
            System.out.println("No se puede retirar el monto ingresado, saldo insuficiente");
        } else {
            saldo = saldo - retiro;
            System.out.println("Retiro exitoso, saldo actual: " + saldo);
        }
    }

}
