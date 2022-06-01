package se.lexicon;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Fill in seconds to see hours, minutes and seconds: ");
        int seconds = scan.nextInt();
        int time1 = seconds % 60;// seconds
        int time2 = seconds / 60;// hours
        int time3 = time2 % 60;// minutes
        time2 = time2 / 60;
        System.out.print( time2 + ":" + time3 + ":" + time1);
    }
}