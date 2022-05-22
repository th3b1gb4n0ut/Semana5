/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5;

/**
 *
 * @author user
 */
public class Runsemana5 {
    
    public static void main(String[] args){
        
        System.out.println("Automovil -- Clase hija");
        Automovil topaz = new Automovil();
        System.out.println(topaz.encender(0));
        System.out.println(topaz.enciendeluces());
        topaz.apagar();
        
        System.out.println("Transporte -- Clase hija");
        Transporte topazGuia = new Automovil();
        System.out.println(topazGuia.encender(0));
        topazGuia.apagar();
        
        System.out.println("Sistema Electrico -- Interface");
        ISistemaElectrico topazX = new Automovil();
        System.out.println(topazX.enciendeluces());
        
        System.out.println("Avion -- Clase hija");
        Avion topazZ = new Avion();
        System.out.println(topazZ.encender(0));
        System.out.println(topazZ.enciendeluces());
        topazZ.apagar();
    }
}


