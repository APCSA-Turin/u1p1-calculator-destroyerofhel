package com.example;
import java.util.Scanner;

public class TipCalculator {
    static double roundDollars(double dollars) {
        // I thought of this myself, somewhat based on past lessons.
        return Math.round(dollars*100)/100.0;
    }
    /*static String formatDollars(double roundedDollars) {
        String formattedDollars = String.format("%.2f", roundedDollars);
        System.out.println(formattedDollars.substring(formattedDollars.length()));
        if(formattedDollars.substring(formattedDollars.length()) == "0") {
            formattedDollars = formattedDollars.substring(0, formattedDollars.length()-1);
        }
        return formattedDollars;
    }*/
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      

        double tip = (cost*(percent/100f));
        double cost_with_tip = (cost + tip);
        double costPerPerson = (cost/people);
        double tip_per_person = (tip/people);
        double cost_per_person_with_tip = (cost_with_tip/people);
        
        /*String result = "-------------------------------\n" +
                       "Total bill before tip: $" + formatDollars(cost) + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + formatDollars(tip) + "\n" +
                       "Total Bill with tip: $" + formatDollars(cost_with_tip) + "\n" +
                       "Per person cost before tip: $" + formatDollars(costPerPerson) + "\n" +
                       "Tip per person: $" + formatDollars(tip_per_person) + "\n" +
                       "Total cost per person: $" + formatDollars(cost_per_person_with_tip) + "\n" +
                       "-------------------------------\n";
        */
        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + roundDollars(cost) + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + roundDollars(tip) + "\n" +
                       "Total Bill with tip: $" + roundDollars(cost_with_tip) + "\n" +
                       "Per person cost before tip: $" + roundDollars(costPerPerson) + "\n" +
                       "Tip per person: $" + roundDollars(tip_per_person) + "\n" +
                       "Total cost per person: $" + roundDollars(cost_per_person_with_tip) + "\n" +
                       "-------------------------------\n";
        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        String result = "";
    
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        double tip = (cost*(percent/100f));
        double cost_with_tip = (cost + tip);
        double costPerPerson = (cost/people);
        double tip_per_person = (tip/people);
        double cost_per_person_with_tip = (cost_with_tip/people);

        result = "-------------------------------\n" +
                       "Total bill before tip: $" + roundDollars(cost) + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + roundDollars(tip) + "\n" +
                       "Total Bill with tip: $" + roundDollars(cost_with_tip) + "\n" +
                       "Per person cost before tip: $" + roundDollars(costPerPerson) + "\n" +
                       "Tip per person: $" + roundDollars(tip_per_person) + "\n" +
                       "Total cost per person: $" + roundDollars(cost_per_person_with_tip) + "\n" +
                       "-------------------------------\nItems ordered:\n";

        Scanner scanner = new Scanner(System.in);

        String response = "";
        while (!response.equals("-1")) {
            System.out.println("Enter an item name or type '-1' to finish:");
            response = scanner.nextLine();
            if(!response.equals("-1")) { result = result + response + "\n";}
        }

        if(result.length() > 0 && result.substring(result.length()-1,result.length()) == "\n") {
            result = result.substring(1, result.length()-2);
        }

        result += "-------------------------------\n";

        scanner.close();

        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6;
        int percent = 25;
        double cost = 52.27;            
        //System.out.println(calculateTip(people,percent,cost));
        //System.out.println(extraCredit(people, percent, cost));
        //extraCredit(people,percent,cost);
    }
}
        
