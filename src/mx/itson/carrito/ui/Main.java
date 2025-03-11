/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;

import java.util.HashSet;
import java.util.Scanner;
import mx.itson.carrito.entidades.Aseguradora;
import mx.itson.carrito.entidades.Carro;
import mx.itson.carrito.entidades.Propietario;
import mx.itson.carrito.enums.TipoMotor;
import mx.itson.carrito.enums.TipoCarroceria;

/**
 *
 * @author alumnog
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la distancia recorrida");
        double distancia = sc.nextDouble();
        System.out.println("Escribe la velocidad del carro");
        double velocidad = sc.nextDouble();
        
        // generamos una instancia de la clase carro
        Carro bmw = new Carro();
       bmw.setMarca("BMW");
       bmw.setColor("Negro");
       bmw.setAnio(2021);
       bmw.setKilometraje(10000);
       bmw.setTipoMotor(TipoMotor.HIBRIDO);
       bmw.setTipoCarros(TipoCarroceria.SUV);
       
       Propietario prop = new Propietario();
       prop.setNombre("Miguel");
       prop.setDomicilio("calle 23 colonia centro");
       prop.setTelefono("6221188756");
       prop.setEmail("gosvaldo372@gmail.com");
       
       Aseguradora seg = new Aseguradora();
       seg.setNombre("Seguros patito");
       seg.setCobertura("parcial");
       seg.setMontoAsegurado("$90,000");
       
       bmw.setPropietario(prop);
       bmw.setSeguro(seg);
        // invicamos al metodo contenido en la clase carro
        double tiempo = bmw.calcularTiempo(distancia, velocidad);
        System.out.println("El tiempo que tardara en recorrer el carro "+ bmw.getMarca() +
                (" de color ")+ bmw.getColor()+ (" del año ") + bmw.getAnio()+ (" es ")+ tiempo + (" y ahora su kilometraje es de "+ bmw.getKilometraje())+ (" el propietario dre este carro es " ) + bmw.getPropietario().getNombre() );
        
        
    }
}
