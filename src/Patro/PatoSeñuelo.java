/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patro;

/**
 *
 * @author sistemas
 */
public class PatoSeñuelo extends Pato implements Volable{
    
    @Override
    public void mostrar(){
        System.out.println("Yo soy Pato Senuelo");
    }
    @Override
    public void volar(){
        System.out.println("INCAPAZ DE VOLAR");
    }
    public void cuaquear(){
        System.out.println("<<silencio>>");
    }
}
