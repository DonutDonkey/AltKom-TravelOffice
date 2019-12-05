package pl.accenture;

public class Trip {
    private Date   start;
    private Date   end;
    private String destination;

    private double price;

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public Trip(Date start, Date end, String destination) {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }

    private String getPriceString() { return ((Double)getPrice()).toString(); }

    protected String checkIfAssignedPrice() { return (getPrice() <= 0) ? "NO ASSIGNED PRICE" : getPriceString(); }

    @Override
    public String toString() {
        return "Trip{" +
                "start=" + start.toString() +
                ", end=" + end.toString() +
                ", destination='" + destination + '\'' +
                ", price='" + checkIfAssignedPrice() + '\'' +
                '}';
    }
}
