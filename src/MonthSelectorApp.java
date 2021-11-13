import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
        		"October", "November", "December" };
        double[] monthSales = { 1000.73, 2000.69, 3000.26, 4000.32, 5000.48, 6000.05, 7000.17, 8000.12, 9000.25, 10000.71,
        		7000.95, 8000.18 };
        
        
        
        // declare monthNames and monthSales arrays


        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");
            
            // validate input
            if (monthNumber < 1 || monthNumber > monthName.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            
            System.out.println("Sales for " + monthName[monthNumber-1] + ": " + monthSales[monthNumber-1]);
            
            // get the index number for the month
            // and display the month name and sales            


            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        double total = 0.0;
        for (int i = 0; i < monthName.length; i++) {
        	total = total + monthSales[i];
        }
       
        System.out.println("Total sales: " + total);
        
        // display the total sales for the year
        
        
        Console.displayLine();
    }   

}
