/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import INTERFACES.Volable;

/**
 *
 * @author sistemas
 */
public class PatoCabezaRoja {
    public abstract class PatoCabeRoja extends Pato implements Volable{
    
    @Override
    public void mostrar(){
        System.out.println("Yo un real soy PATO CABEZA ROJA");
    }
    public void volar(){
        System.out.println("Puedo volar con mis alas");
    }
    public void cuaquear(){
        System.out.println("Soy un verdadero pato por eso hago CUAC CUAC");
    }
}
}
