import java.time.LocalDateTime;

public class Minute {

    public int getMinute(){

        int minute;

        minute= LocalDateTime.now().getMinute();

        return minute;
    }
}

