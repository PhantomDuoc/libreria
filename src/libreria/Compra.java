/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 *
 * @author Bizza
 */
public abstract interface Compra {

    double IVA = 0.19;
    double DESCUENTO_INFANTIL = 0.05;
    double DESCUENTO_DEPORTE = 0.1;

    int calcularIvaTotal();

    int calcularDescuento();

    abstract int calcularTotal();
}
