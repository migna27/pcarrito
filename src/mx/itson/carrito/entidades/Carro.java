/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;

import mx.itson.carrito.enums.TipoCarroceria;
import mx.itson.carrito.enums.TipoMotor;
/**
 *
 * @author alumnog
 */
public class Carro {

    /**
     * @return the seguro
     */
    public Aseguradora getSeguro() {
        return seguro;
    }

    /**
     * @param seguro the seguro to set
     */
    public void setSeguro(Aseguradora seguro) {
        this.seguro = seguro;
    }

    /**
     * @return the propietario
     */
    public Propietario getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    /**
     * @return the tipoCarros
     */
    public TipoCarroceria getTipoCarroceria() {
        return tipoCarroceria;
    }

    /**
     * @param tipoCarros the tipoCarros to set
     */
    public void setTipoCarros(TipoCarroceria tipoCarros) {
        this.tipoCarroceria = tipoCarros;
    }

    /**
     * @return the tipoMotor
     */
    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    /**
     * @param tipoMotor the tipoMotor to set
     */
    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    /**
     * @return the kilometraje
     */
    public int getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    private String color;
    private int anio;
    private String marca;
    private int kilometraje;
    private TipoMotor tipoMotor;
    private TipoCarroceria tipoCarroceria;
    private Propietario propietario;
    private Aseguradora seguro;
    /**
     * Calcula el tiempo que tarda el carro en recorrer una distancia.
     * @param distancia Distancia que recorrera el carro.
     * @param velocidad Velocidad a la que viaja el carro.
     * @return Tiempo en el que llegara el carro.
     */
    public double calcularTiempo(double distancia, double velocidad){

        this.kilometraje += distancia;
    double tiempo = distancia / velocidad;
    return tiempo;
    }
    
}
