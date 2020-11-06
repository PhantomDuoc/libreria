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
public final class Infantil extends Libro {

    //atributos
    private int edadMinima;
    private int edadMaxima;

    //constructores
    public Infantil() {
    }

    public Infantil(int edadMinima, int edadMaxima, int codigo, String titulo, String autor, String editorial, String resumen, int precio) {
        super(codigo, titulo, autor, editorial, resumen, precio);
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
    }

    //getter y setter
    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    //customer
    @Override
    public String toString() {
        return super.toString() + " Infantil{" + "edadMinima=" + edadMinima + ", edadMaxima=" + edadMaxima + '}';
    }

    public int calcularDescuento() {
        return (int) (super.precio * Compra.DESCUENTO_INFANTIL);
    }
}
