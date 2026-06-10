import java.util.Scanner;

public class SecondsConverter {

    public static void main(String[] args){
        
        Scanner scnr = new Scanner(System.in);
        int seconds;
        int hours;
        int minutes;
        int secResults;
        int tempVal1;
        int tempVal2;

        System.out.print("Enter the number of seconds: ");
        seconds = scnr.nextInt();
        
        hours = seconds / 3600;
        tempVal1 = seconds - (hours * 3600);
        minutes = tempVal1 / 60;
        tempVal2 = tempVal1 - (minutes * 60);
        secResults = tempVal2;

        System.out.print("\nHours: " + hours);
        System.out.print("\nMinutes: " + minutes);
        System.out.print("\nSeconds: " + secResults);
        
        scnr.close();

    }
    
}
