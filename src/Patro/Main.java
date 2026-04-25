/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patro;

/**
 *
 * @author sistemas
 */
public class Main {
    
    public static void main(String[] args) {
        PatoReal p1 = new PatoReal();
        PatitoGoma p2 = new PatitoGoma();
        PatoCabeRoja p4 = new PatoCabeRoja();
        PatoSeñuelo p3 = new PatoSeñuelo();
        
        
        p1.mostrar();
        p1.cuaquear();
        p1.volar();
        p1.nadar();
        
        p2.mostrar();
        p2.cuaquear();
        p2.volar();
        p2.nadar();
        
        p3.mostrar();
        p3.cuaquear();
        p3.volar();
        p3.nadar();
        
        p4.mostrar();
        p4.cuaquear();
        p4.volar();
        p4.nadar();
    }
}
