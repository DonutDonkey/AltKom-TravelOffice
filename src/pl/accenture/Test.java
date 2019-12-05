package pl.accenture;

public class Test {
    public static void main(String[] args) {
        Adress adress = new Adress("street", "zip","city");
        Customer customer = new Customer("name");
        Trip trip = new Trip(new Date(1111,11,1), new Date(2222,22,2), "destination");

        customer.assignTrip(trip);

        System.out.println(customer.toString());
//
//        //4.9
//
        TravelOffice travelOffice = new TravelOffice();

        travelOffice.addCustomer(new Customer("pierwszy"));
        travelOffice.addCustomer(new Customer("drugi"));
        travelOffice.addCustomer(new Customer("trzeci"));

        System.out.println(travelOffice.toString());
//
//        //5.2
//
        DomesticTrip domesticTrip = new DomesticTrip(new Date(1111, 11, 1),
                                                     new Date(2222, 22, 2),
                                                     "Domestic Trip Destination");
        domesticTrip.setOwnArrivalDiscount(250);
        domesticTrip.setPrice(1000);

        AbroadTrip abroadTrip = new AbroadTrip(new Date(3333, 33, 3),
                                               new Date(4444, 44, 4),
                                                 "Abroad Trip Destination");
        abroadTrip.setInsurance(250);
        abroadTrip.setPrice(1000);

        Customer customerDomestic = new Customer("Domestic Customer");
        customerDomestic.setAdress(adress);
        customerDomestic.assignTrip(domesticTrip);
        System.out.println(customerDomestic.toString());

        System.out.println(System.lineSeparator());
        System.out.println("####################");
        System.out.println(System.lineSeparator());

        Customer customerAbroad = new Customer("Abroad Customer");
        customerAbroad.setAdress(adress);
        customerAbroad.assignTrip(abroadTrip);
        System.out.println(customerAbroad.toString());
    }
}
