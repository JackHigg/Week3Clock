public class Clock {

    protected int hour;
    protected int minute;
    protected int seconds;

    Clock() {
        this.setHour();
        this.setMinute();
        this.setSeconds();
    }

    private void setHour(){

        Hour hour = new Hour();
        this.hour=hour.getHour();

    }

    private void setMinute(){

        Minute minute=new Minute();
        this.minute=minute.getMinute();

    }

    private void setSeconds(){

        Seconds seconds=new Seconds();
        this.seconds=seconds.getSeconds();

    }



    void displayTime(){

        System.out.println("Time in a 24 hour clock "+hour+":"+minute+":"+seconds);

    }

}
