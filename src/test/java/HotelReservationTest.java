import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelReservationTest {
    @Test
    public void toAddHotelHotel_Should_returnTrue() {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        hotelReservationSystem.getMessage();
        Hotel hotelCheck = new Hotel("Bridgewood", 160);
        Hotel hotelCheck1 = new Hotel("Lakewood", 110);
        Hotel hotelCheck2 = new Hotel("Ridgewood", 220);
        try{
            boolean checkIfAdded = hotelReservationSystem.addHotel(hotelCheck);
            Assertions.assertEquals(checkIfAdded, true);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void toAddHotelHotel_withRegular_WeekendAndWeekday_Should_returnTrue() {
        HotelReservationSystem service = new HotelReservationSystem();
        Hotel hotel1 = new Hotel("Lakewood", 110, 90);
        Hotel hotel2 = new Hotel("Bridgewood", 150, 50);
        Hotel hotel3 = new Hotel("Ridgewood", 220, 150);
        service.addHotel(hotel1);
        service.addHotel(hotel2);
        service.addHotel(hotel3);
        try{
            boolean checkIfAdded = service.addHotel(hotel1);
            Assertions.assertEquals(checkIfAdded, true);
            System.out.println(hotel1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
