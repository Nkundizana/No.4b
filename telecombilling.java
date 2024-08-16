/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class telecombilling {
    
    public static void main(String[] args) {
        double initialLoad = 10000.0; 
        double serviceChargeRate = 0.10; 
        int callDurationMinutes = 5; 
        int costPerSecond = 200; 

       
        double serviceCharge = initialLoad * serviceChargeRate;

        
        int callDurationSeconds = callDurationMinutes * 60;
        double callCost = callDurationSeconds * costPerSecond;

       
        double finalBalance = initialLoad - serviceCharge - callCost;

        System.out.println("The user's balance after the call is: UGX " + finalBalance);
    }
}

    

