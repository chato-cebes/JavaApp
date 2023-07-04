/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poliformismo;

/**
 *
 * @author Elper
 */
public class Main { 
    public static void main (String  [] args){
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("GHT352", "Ferrari", "89");
        misVehiculos[1] = new VehiculoTurismo("LKS922", "Audi", "78", 2);
        misVehiculos[2] = new VehiculoDeportivo ("TYV461", "McLaren", "98", 1000 );
        misVehiculos[3] = new VehiculoFurgoneta ("LET902", "BMW", "75", 2000);
        
        for (Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.showData());
            System.out.println("------------------------------");
        }
    }
    
}
