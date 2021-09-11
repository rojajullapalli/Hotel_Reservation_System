import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    @Test
    public void toAddHotelHotel_Should_returnTrue() {
        System.out.println("Welcome to Hotel Reservation System");
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        Hotel hotelCheck = new Hotel("Bridgewood", 160);
        try{
            boolean checkIfAdded = hotelReservationSystem.addHotel(hotelCheck);
            Assertions.assertEquals(checkIfAdded, true);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
