public class Hotel {
    private String hotelName;
    private int regularCustomerRate;
    private int totalRate;
    private int regularCustomerRateForWeekday;
    private int regularCustomerRateForWeekend;

    public Hotel(String hotelName, int regularCustomerRateForWeekday, int regularCustomerRateForWeekend) {
        this.hotelName = hotelName;
        this.regularCustomerRateForWeekday = regularCustomerRateForWeekday;
        this.regularCustomerRateForWeekend = regularCustomerRateForWeekend;
        this.totalRate = 0;
    }

    public Hotel(String hotelName, int regularCustomerRate) {
        this.hotelName = hotelName;
        this.regularCustomerRate = regularCustomerRate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRegularCustomerRate() {
        return regularCustomerRate;
    }

    public void setRegularCustomerRate(int rate) {
        this.regularCustomerRate = rate;
    }

    public long getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(int rate) {
        this.totalRate = rate;
    }

@Override
public String toString() {
    return "\nHotel Name: " + hotelName + "\nHotel rates for a Weekday (per day): " + regularCustomerRateForWeekday
            + "$\nTotal rates for a WeedEnd (per day): " + regularCustomerRateForWeekend + "$ .";
}

}
