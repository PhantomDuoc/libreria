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
public abstract class Libro implements Compra {

    protected int codigo;
    protected String titulo;
    protected String autor;
    protected String editorial;
    protected String resumen;
    protected int precio;

    public Libro() {
    }

    public Libro(int codigo, String titulo, String autor, String editorial, String resumen, int precio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.resumen = resumen;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override

    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", resumen=" + resumen + ", precio=" + precio + '}';
    }

    public int calcularIvaTotal() {
        return (int) (this.precio * Compra.IVA);
    }

    public int calcularTotal() {
        return (int) (this.precio + calcularIvaTotal() - calcularDescuento());
    }

}
