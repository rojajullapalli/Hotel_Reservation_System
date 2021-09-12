public class Hotel {
    private String hotelName;
    private int regularCustomerRate;
    private int totalRate;

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
        return "\nHotel Name: " + hotelName + "\nHotel rates for a regular customer (per day): " + regularCustomerRate
                + "$\nTotal Cost of Stay: " + totalRate + "$ .";
    }

}
