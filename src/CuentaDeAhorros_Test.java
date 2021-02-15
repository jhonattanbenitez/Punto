/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Desarrollo
 */
import java.text.DecimalFormat;
import javax.swing.*;

public class CuentaDeAhorros_Test {

    public static void main(String[] args) {

        String titular, numCta;
        double saldo;
        //lectura de variables: 
        titular = JOptionPane.showInputDialog(
                "Digite el nombre del titular: ").trim().toUpperCase();

        numCta = JOptionPane.showInputDialog(
                "Digite el número de la cuenta: ").trim();

        saldo = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite el saldo inicial: $ ").trim());

        CuentaDeAhorros cta1 = new CuentaDeAhorros(titular, numCta, saldo);
        System.out.println(cta1);
        System.out.println("Titular: " + cta1.getTitular());
        System.out.println("Número de la cuenta: " + cta1.getNumCta());
        System.out.println("Saldo actual: " + cta1.getSaldo());

// CuentaDeAhorros cta1 = new CuentaDeAhorros("   Ana López  ", "11", 50000);
        //System.out.println(cta1.toString());
    }

}

class CuentaDeAhorros {
    //Atributos:

    private String titular;
    private final String numCta;
    private double saldo;
    private DecimalFormat df;

// constructor:
    public CuentaDeAhorros(String titular, String numCta, double saldo) {
        this.titular = titular.trim().toUpperCase();
        this.numCta = numCta.trim();
        this.saldo = saldo;

        df = new DecimalFormat("0.00");
    }
    // Getters 

    public String getTitular() {
        return titular;
    }

    public String getNumCta() {
        return numCta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
     //MÉTDO PARA DEPOSITAR DINER
    public void consignar(double consignacion) {
        if (consignacion > 0) {
            saldo += consignacion;
        } else {
           JOPtionPane.showMessageDialog(null, "el valor "
                    + "consignación es <=0", "ERROR CONSIGNACION", 0);
        }
    }

    // Método para retirar el dinero
    public void retirar(double valorRetiro) {
        if (valorRetiro > 0 && saldo - valorRetiro >= 0) {
            saldo -= valorRetiro;
        } else {
            JOPtionPane.showMessageDialog(null, "el valor "
                    + "retiro es <=0 o no tiene saldo suficiente",
                    "ERROR CONSIGNACION", 0);
        }
    }

    @Override
    public String toString() {
        return "CuentaDeAhorros{" + "titular=" + titular + ", numCta="
                + numCta + ", saldo=" + df.format(saldo) + '}';
    }

   

}
