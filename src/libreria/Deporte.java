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
public final class Deporte extends Libro {

    //atributos
    private String tipoDeporte;

    //constructores
    public Deporte() {
    }

    public Deporte(String tipoDeporte, int codigo, String titulo, String autor, String editorial, String resumen, int precio) {
        super(codigo, titulo, autor, editorial, resumen, precio);
        this.tipoDeporte = tipoDeporte;
    }

    //getter y setter
    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    //customer
    @Override
    public String toString() {
        return super.toString() + " Deporte{" + "tipoDeporte=" + tipoDeporte + '}';
    }

    public int calcularDescuento() {
        return (int) (super.precio * Compra.DESCUENTO_DEPORTE);
    }
}
