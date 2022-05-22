/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5;

/**
 *
 * @author user
 */
public class Avion extends Transporte implements ISistemaElectrico{

    private double gas = 0;
        
    @Override
    public String encender(double gas) {
        String msg;    
        this.gas = gas;
            
            if(this.gas > 1)
                msg="Automovil encendido";
            else
                msg="Sin gasolina";
            
        return msg;
    }

    @Override
    public void apagar() {

            System.out.println("Automovil apagado");
        
    }

    @Override
    public String enciendeluces() {
            return "Luces encendidas";
    }
    
}
