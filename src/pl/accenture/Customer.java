package pl.accenture;

import java.util.Optional;

public class Customer {
    private String name;
    private Adress adress;
    private Trip   trip;

    public Customer(String name) {
        this.name = name;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void assignTrip(Trip trip) {
        this.trip = trip;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name +
                "\n, adress=" + Optional.ofNullable(adress).map(Adress::toString).orElse("NO ADRESS") +
                "\n, trip=" + Optional.ofNullable(trip).map(Trip::toString).orElse("NO TRIP") +
                '}';
    }
}
