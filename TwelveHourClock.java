public class TwelveHourClock extends Clock{

    private int newHour;

    TwelveHourClock() {
       this.ConvertToTwelve();
    }

public void ConvertToTwelve(){



    if(super.hour>=13){

        this.newHour = super.hour-12;
    }
    else
    {
        this.newHour = super.hour;
    }

}

    void displayTime12(){

        System.out.println("Time in a 12 hour clock "+this.newHour+":"+super.minute+":"+super.seconds);

    }

}
