import java.util.Scanner;

public class HMSConverter {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int hours;
        int minutes;
        int seconds;
        int totalSec;

        System.out.print("Enter the number of hours: ");
        hours = scnr.nextInt();
        System.out.print("\nEnter the number of minutes: ");
        minutes = scnr.nextInt();
        System.out.print("\nEnter the number of seconds: ");
        seconds = scnr.nextInt();

        totalSec = (hours * 3600) + (minutes * 60) + seconds;
        System.out.print("\nTotal seconds: " + totalSec);

        scnr.close();
    }
    
}
