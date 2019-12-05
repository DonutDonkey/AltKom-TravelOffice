package pl.accenture;

public class DomesticTrip extends Trip {
    private double ownArrivalDiscount;
    public void setOwnArrivalDiscount(double ownArrivalDiscount) { this.ownArrivalDiscount = ownArrivalDiscount; }

    @Override
    public double getPrice() { return super.getPrice() - ownArrivalDiscount; }

    public DomesticTrip(Date start, Date end, String destination) { super(start, end, destination);
                                                                    ownArrivalDiscount = 0;}
}
