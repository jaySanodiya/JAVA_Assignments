package assignment.D803;

import java.util.Scanner;

public class Main {
    public Hotel provideFood(int amount){
        if(amount>1000)
            return new TajHotel();
        else if(amount>200 && amount<=1000)
            return new RoadSideHotel();
        else
            return null;
    }

    public static void main(String[] args) {
        Main m1 = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======Welcome========");
        System.out.println("Enter Amount");
        int amount = scanner.nextInt();
        Hotel hotel = m1.provideFood(amount);

        if(hotel instanceof RoadSideHotel){
            hotel.chickenBiryani();
            hotel.masalaDosa();
        }
        else if(hotel instanceof TajHotel){
            TajHotel h1 = (TajHotel)hotel;
            h1.welcomeDrink();
            hotel.chickenBiryani();
            hotel.masalaDosa();
        }
        else
            System.out.println("Please Enter a valid amount");


    }
}
