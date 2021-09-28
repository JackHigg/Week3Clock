import java.util.Scanner;

public class Driver {

    static Scanner kboard= new Scanner(System.in);

    public static void main(String[] args){


        TwelveHourClock time=new TwelveHourClock();    //declares new object time

        int choice;

        System.out.println("What format would you like to see the time 1:24 hour format 2:12 hour format");
        choice =kboard.nextInt();

        if (choice==1){
            time.displayTime();
        }
        else
        {
            time.displayTime12();
        }




    }
}
