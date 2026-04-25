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
public class PatoSeñuelo extends Pato implements Volable{ 
    
 
    @Override
    public void mostrar(){
        System.out.println("Yo soy Pato Senuelo");
    }

    public void cuaquear(){
        System.out.println("<<silencio>>");
    }

    @Override
    public void volable() {
        System.out.println("INCAPAZ DE VOLAR");    
    }
}
    

