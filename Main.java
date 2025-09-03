package main;

import transport.*;

public class Main {
    public static void main(String[] args) {
        // 1) constructor chain: Vehicle -> Bicycle -> EBike
        EBike e = new EBike("EB-101", 50);   // fixed closing parenthesis and semicolon
        e.deliver("Sandwich", "Library");

        // 2) abstract restriction (comment to see error):
        // Vehicle v = new Vehicle("V-1");  // Vehicle is abstract, so can't instantiate

        // 3) interface + final rule check
        Drone d = new Drone("DR-1");
        // d.deliver("Notes", "ExamCell");   // blocked (commented out)
        d.deliver("USB", "CSE Block");      // allowed

        // 4) Payable demo
        double bill = d.cost(5);            // fixed comment syntax
        System.out.println("Drone delivery cost: Rs." + bill);
    }
}
