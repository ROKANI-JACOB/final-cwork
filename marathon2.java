
package vu.cousework2;

public class marathon2 {
    //arrays
    public static void main(String[] args) {
    String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", 
            "Matt", "Alex", "Emma", "John", "James", 
            "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"
        };
    int[] times = {
            341, 273, 278, 329, 445, 
            402, 388, 275, 243, 334, 
            412, 395, 299, 343, 317, 265
        };

    // Variables to store fastest and second fastest times
        int fastestTime = Integer.MAX_VALUE;
        int secondFastestTime = Integer.MAX_VALUE;
        String fastestRunner = "";
        String secondFastestRunner = "";

        // Loop through the runners to find the fastest and second fastest
        for (int i = 0; i < times.length; i++) {
            if (times[i] < fastestTime) {
                secondFastestTime = fastestTime; 
                secondFastestRunner = fastestRunner; 
                fastestTime = times[i]; 
                fastestRunner = names[i]; 
            } else if (times[i] < secondFastestTime) {
                secondFastestTime = times[i]; 
                secondFastestRunner = names[i]; 
            }
        }

        // Print the results
        

    System.out.println("Fastest Runner: " + fastestRunner + " with time: " + fastestTime + " minutes.");
        System.out.println("Second Fastest Runner: " + secondFastestRunner + " with time: " + secondFastestTime + " minutes.");
}
}

    
    

