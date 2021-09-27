import java.time.LocalDateTime;

    public class Seconds {

        public int getSeconds(){

            int seconds;

            seconds= LocalDateTime.now().getSecond();

            return seconds;
        }
}
