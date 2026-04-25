/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import INTERFACES.*;
/**
 *
 * @author sistemas
 */
    public class PatoReal extends Pato implements Volable {
    
    @Override
    public void mostrar(){
        System.out.println("Yo soy un verdadero PATO REAL");
    }
    
   
     public void cuaquear(){
        System.out.println("Soy un verdadero pato por eso hago CUAC CUAC");
    }

    @Override
    public void volable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }
}