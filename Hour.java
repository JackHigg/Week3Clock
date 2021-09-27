import java.time.LocalDateTime;


public class Hour {

    public int getHour(){

        int hour;

        hour=LocalDateTime.now().getHour();

        return hour;
    }
}
