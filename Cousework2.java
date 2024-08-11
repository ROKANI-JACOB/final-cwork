 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.cousework2;

/**
 *
 * @author User
 */
public class Cousework2 {

    public static void main(String[] args) {
        
  
        // Create an instance of BalexCompany
        balexCompany company = new balexCompany();

        // Employee data
        double[][] employees = {
            {7.50, 35},  // Employee 1
            {8.20, 47},  // Employee 2
            {10.00, 73}  // Employee 3
        };  

        // Calculate and print pay for each employee
        for (double[] employee : employees) {
            double basePay = employee[0];
            double hours = employee[1];
            String result = company.calculatePay(basePay, hours);
            System.out.println(result);
        }
    }
}

        
        
        
        
    

