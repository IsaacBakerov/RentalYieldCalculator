import java.util.Scanner;

public class Main {
    //Method for calculating rental yield percentage per year, given the monthly rent and price of property
    private static float rentalYield(int rent, int price) {
        float annualRent = rent * 12;
        return (annualRent / price) * 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Monthly rent: ");
        int rent = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter the Overall price of the property: ");
        int price = Integer.parseInt(sc.nextLine());
        float result = rentalYield(rent, price);
        System.out.println("Rental yield per year: " + result + "%.");
    }
}