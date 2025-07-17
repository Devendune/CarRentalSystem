package CarRentalSystem;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;

public class Reservation
{
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date startDate;
    Date endDate;
    Time startTime;
    Time endTime;
    ReservationStatus reservationStatus;

    public int createReserve(User user,Vehicle vehicle)
    {
        reservationId=123;
        this.user=user;
        this.vehicle=vehicle;
        reservationStatus=ReservationStatus.RESERVED;

        return reservationId;
    }

}
