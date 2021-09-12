import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class HotelReservationSystem {
    private ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

    public void getMessage(){
        System.out.println("welcome to hotel reservation system");
    }

    public boolean addHotel(Hotel newHotel) {
        System.out.println("");
        hotelList.add(newHotel);
        return true;
    }

    public Hotel findCheapestHotel(Date start, Date end) {
        long noOfDays = (1 + (end.getTime() - start.getTime())) / (1000 * 60 * 60 * 24)+1;
        System.out.println("num of days "+noOfDays);
        Hotel cheapestHotel = hotelList.stream()
                .sorted(Comparator.comparing(Hotel::getRegularCustomerRate))
                .findFirst()
                .orElse(null);
        int  totalCostOfStay = (int) (noOfDays * cheapestHotel.getRegularCustomerRate());
        cheapestHotel.setTotalRate(totalCostOfStay);
        System.out.println("the cheapest hotel among three is "+cheapestHotel);
        return cheapestHotel;
    }

}
