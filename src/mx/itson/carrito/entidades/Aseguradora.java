/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;

/**
 *
 * @author alumnog
 */
public class Aseguradora {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cobertura
     */
    public String getCobertura() {
        return cobertura;
    }

    /**
     * @param cobertura the cobertura to set
     */
    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    /**
     * @return the montoAsegurado
     */
    public String getMontoAsegurado() {
        return montoAsegurado;
    }

    /**
     * @param montoAsegurado the montoAsegurado to set
     */
    public void setMontoAsegurado(String montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }
    private String nombre;
    private String cobertura;
    private String montoAsegurado;
    
}
