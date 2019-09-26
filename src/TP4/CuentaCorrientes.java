/*package TP4;

public class CuentaCorrientes {

    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public CuentaCorriente(String nombreTitular, double saldo){

        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.numeroCuenta = (long)(Math.random()*10000);

    }


    public void setIngresos(double monto){

        this.saldo += monto;

    }

    public void setReintegros(double monto){

        this.saldo -= monto;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getInfo(){

        return ("Saldo: " + this.saldo + "\nNombre titular: " + this.nombreTitular + "\nNumero de Cuenta: " + this.numeroCuenta);
    }

    public void transferir(CuentaCorriente cuenta, double monto){

        cuenta.saldo += monto;

        this.saldo -= monto;
    }
}
*/