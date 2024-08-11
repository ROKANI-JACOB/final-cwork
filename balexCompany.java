
package vu.cousework2;


public class balexCompany {

       // Constants priv modifier
    private static final double MINIMUM_WAGE = 8.00;
    private static final double MAX_HOURS = 60;
    private static final double OVERTIME_RATE = 1.5;
    private static final double REGULAR_HOURS = 40;

    // Method to calculate pay based on base pay and hours worked
    public String calculatePay(double basePay, double hoursWorked) {
        // Error handling for base pay
        if (basePay < MINIMUM_WAGE) {
            return String.format("Error: Base pay must not be less than the minimum wage of $%.2f.", MINIMUM_WAGE);
        }

        // Error handling for hours worked
        if (hoursWorked > MAX_HOURS) {
            return "Error: Hours worked cannot exceed 60 hours in a week.";
        }

        // Calculate total pay
        double totalPay;
        if (hoursWorked <= REGULAR_HOURS) {
            totalPay = hoursWorked * basePay;
        } else {
            double regularPay = REGULAR_HOURS * basePay;
            double overtimeHours = hoursWorked - REGULAR_HOURS;
            double overtimePay = overtimeHours * (basePay * OVERTIME_RATE);
            totalPay = regularPay + overtimePay;
        }

        return String.format("Total pay for %.2f hours worked at $%.2f/hour is $%.2f.", hoursWorked, basePay, totalPay);
    }
}
    


    
    
    


       