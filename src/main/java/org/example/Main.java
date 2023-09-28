package org.example;

/**
 * @author Farida Fatali
 * Practice: <a href="https://www.youtube.com/watch?v=JepvxAypIoI">...</a>
 * Driving License System in Java
 */

public class Main {
    public static void main(String[] args) {
        GenericDriver tomTeller = new GenericDriver("Tom Teller", true);
        tomTeller.deduct(3);
        tomTeller.setMedicalReport();

        CommercialDriver lilyDavis = new CommercialDriver("Lily Davis", false, "inflammable", "truck");
        lilyDavis.deduct(5);
        lilyDavis.setMedicalReport();

        GenericDriver[] driverArray = new GenericDriver[2];
        driverArray[0] = tomTeller;
        driverArray[1] = lilyDavis;

        for (GenericDriver genericDriver : driverArray) {
            System.out.println();
            System.out.println(genericDriver.getName() + "'s license is provisional: " + genericDriver.isProvisional() + "\n"
                    + genericDriver.getName() + " has " + genericDriver.getPoints() + " points" + "\n"
                    + genericDriver.getMedicalReport());
        }
        System.out.println("The materials type: " + lilyDavis.getMaterialsType());
    }
}