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
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Infantil i1 = new Infantil(5, 8, 1, "Papelucho", "Paz", "Editorialsita", "Es un libro muy weno", 5000);
        Deporte d1 = new Deporte("Ciclismo", 2, "Manual de la bicicleta", "Una bici", "Omega", "Sirve para aprender a andar en bici", 9999);
        RegistroLibro rl = new RegistroLibro();
        rl.agregarLibro(i1);
        rl.agregarLibro(d1);
        rl.listarLibros();
        rl.obtenerCategoria();
        rl.obtenerBoleta();
    }

}
