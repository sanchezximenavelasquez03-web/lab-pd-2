/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patro;

/**
 *
 * @author sistemas
 */
public class PatoReal extends Pato implements Volable {
    
    @Override
    public void mostrar(){
        System.out.println("Yo soy un verdadero PATO REAL");
    }
    
    @Override
    public void volar(){
        System.out.println("Pueo volar con mis alas");
    }
     public void cuaquear(){
        System.out.println("Soy un verdadero pato por eso hago CUAC CUAC");
    }
}
