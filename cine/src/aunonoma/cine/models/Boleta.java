/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aunonoma.cine.models;

/**
 * Clase boleta donde se va calcular el precio de cada boleta de la venta del cine.
 * 
 * @author  Mateo Quintero
 * @version 0.1
 * @since   2025/03/20
 * @see     autonoma.DirectorioAmistades.views
 */
public class Boleta {
    
    private int numeroBoleta;
    private Pelicula pelicula;
    private Usuario usuario;
    private double precioFinal;

    public Boleta(int numeroBoleta, Pelicula pelicula) {
        this.numeroBoleta = numeroBoleta;
        this.pelicula = pelicula;
    }

    public int getNumeroBoleta() {
        return numeroBoleta;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setNumeroBoleta(int numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
    
    
}
