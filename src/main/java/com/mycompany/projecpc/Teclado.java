/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecpc;

/**
 *
 * @author ferca
 */
public class Teclado extends DispositvoEntrada {
    protected final int idTeclado;
     protected static int contadorTeclados;
    
        public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada,marca);
         this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        return sb.toString();
    }

 
        
        
        
}
