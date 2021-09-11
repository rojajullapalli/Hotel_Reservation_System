import java.util.ArrayList;

public class HotelReservationSystem {
    private ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

    public boolean addHotel(Hotel newHotel) {
        hotelList.add(newHotel);
        return true;
    }
}
