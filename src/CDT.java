import java.util.Scanner;

public class CDT {

    public float MontoCDT;

    public void IngresarMonto(){
        System.out.println("Ingrese el monto a invertir: ");
        Scanner sc = new Scanner(System.in);
        MontoCDT = (float) sc.nextDouble();
        System.out.println("Cantidad de interes");
        float interes = (float) sc.nextDouble();
        MontoCDT = MontoCDT + (MontoCDT * interes);
    }

    public void verMonto(){
        System.out.println("Monto invertido en CDT: " + MontoCDT);
    }

    public void cerrarinversion (){
        System.out.println("La inversion a sido cerra el dinero se ingresara a la cuenta corriente");
        System.out.println("Monto a ingresar a la cuenta corriente: " + MontoCDT);
    }
}
