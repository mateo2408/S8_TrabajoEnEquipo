public class MontosTotales {
    CuentaAhorros ca = new CuentaAhorros();
    CuentaCorriente cc = new CuentaCorriente();

    public void montoTotal(){
        System.out.println("El monto total de las cuentas es:");
        float montoAhorros = ca.MontoAhorros;
        cc.MontoCorriente
        System.out.println("Monto total de las cuentas: " + (montoAhorros + cc.MontoCorriente));
    }
}
