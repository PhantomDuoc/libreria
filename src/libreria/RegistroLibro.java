/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bizza
 */
public class RegistroLibro {

    private List<Libro> listaLibros;

    public RegistroLibro() {
        listaLibros = new ArrayList<>();
    }

    public boolean agregarLibro(Libro newLibro) {
        return listaLibros.add(newLibro);
    }

    public void listarLibros() {
        for (Libro tmp : listaLibros) {
            System.out.println(tmp.toString());//polimorfismo
        }
    }

    public boolean validar(String titulo, String autor) {
        for (Libro tmp : listaLibros) {
            if (tmp.getTitulo().equals(titulo) && tmp.getAutor().equals(autor)) {
                return true;
            }
        }
        return false;
    }

    public void obtenerCategoria() {
        int contDeporte = 0, contInfantil = 0;
        for (Libro tmp : listaLibros) {
            if (tmp instanceof Deporte) {
                contDeporte++;
            }
            if (tmp instanceof Infantil) {
                contInfantil++;
            }
        }
        System.out.println("Libros Infantiles >> " + contInfantil);
        System.out.println("Libros Deportes >> " + contDeporte);
    }

    public void obtenerCategoria2() {
        int contDeporte = 0, contInfantil = 0;
        for (Libro tmp : listaLibros) {
            if (tmp.toString().contains("Deporte")) {
                contDeporte++;
            }
            if (tmp.toString().contains("Infantil")) {
                contInfantil++;
            }
        }
        System.out.println("Libros Infantiles >> " + contInfantil);
        System.out.println("Libros Deportes >> " + contDeporte);
    }

    public void obtenerBoleta() {
        int total = 0;
        System.out.println("..........BOLETA..........");
        for (Libro tmp : listaLibros) {
            System.out.println(tmp.getTitulo() + " $" + tmp.calcularTotal());
            System.out.println("Precio >> $" + tmp.getPrecio());
            System.out.println("IVA >> $" + tmp.calcularIvaTotal());
            System.out.println("Descuento >> $" + tmp.calcularDescuento());
            System.out.println("---------------------------");
            total += tmp.calcularTotal();
        }
        System.out.println("Total a Pagar >> $" + total);
    }
}
