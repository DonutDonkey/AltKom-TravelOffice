package pl.accenture;

public class AbroadTrip extends Trip {
    private double insurance;
    public void setInsurance(double insurance) { this.insurance = insurance; }

    @Override
    public double getPrice() { return super.getPrice() + insurance; }

    @Override
    protected String checkIfAssignedPrice() { return (getPrice() <= insurance) ? "NO ASSIGNED PRICE" :
                                              super.checkIfAssignedPrice(); }

    public AbroadTrip(Date start, Date end, String destination) { super(start, end, destination); insurance = 0; }
}
