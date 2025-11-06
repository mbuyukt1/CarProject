public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Model S", "Tesla", 2024, 79999.99, "Red", 10);

        System.out.println(myCar.toString());

        myCar.sell(3);

        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Price: " + myCar.getPrice());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Quantity: " + myCar.getQuantity());

        myCar.setColor("Black");
        myCar.setPrice(75999.99);

        myCar.delivery(5);

        System.out.println("\nAfter updates:");
        System.out.println(myCar.toString());
    }
}