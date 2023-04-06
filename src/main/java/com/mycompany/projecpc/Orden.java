/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecpc;

/**
 *
 * @author ferca
 */
public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 3;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora( Computadora computadora ){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
            //++this.contadorComputadoras;
        }else{
            System.out.println("Ha superado el max de computadoras");
        }
    }
    
    public void mostrarOrden(){
        
            System.out.println("Orden de computadoras");
            
        for (int i = 1; i <= this.computadoras.length; i++) {
            System.out.println("PC número " + i + ": " + computadoras[i - 1]);
        }
    }
    
    
}
