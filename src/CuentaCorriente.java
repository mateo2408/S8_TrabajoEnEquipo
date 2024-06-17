import java.util.Scanner;

public class CuentaCorriente {

    public float MontoCorriente;

    public void ingresomonto () {
        System.out.println("Ingrese el monto de la cuenta corriente:");
        Scanner sc = new Scanner(System.in);
        MontoCorriente = (float) sc.nextDouble();
    }

    public void saldo (){
        System.out.println("Saldo de la cuenta corriente es: " + MontoCorriente);
    }

    public void retiro(){
        System.out.println("Ingrese el monto a retirar:");
        Scanner sc = new Scanner(System.in);
        float retiro = (float) sc.nextDouble();
        if (retiro > MontoCorriente){
            System.out.println("No se puede retirar el monto ingresado, saldo insuficiente");
        } else {
            MontoCorriente = MontoCorriente - retiro;
            System.out.println("Retiro exitoso, saldo actual: " + MontoCorriente);
        }
    }

    public void montoCDT() {
        System.out.println("El monto ingresado desde sus inversion es:");
        CDT cdt = new CDT();
        cdt.IngresarMonto();
        MontoCorriente = MontoCorriente + cdt.MontoCDT;
        System.out.println("Monto total en la cuenta de ahorros: " + MontoCorriente);
    }

}
