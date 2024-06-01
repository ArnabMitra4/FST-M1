public class Car {
    String color,transmission;
    int make, tyres, doors;
    Car(){
        tyres=4;
        doors=4;
    }
    public void displayCharacteristics(){
        System.out.println("The Value of Tyre is: "+ tyres);
        System.out.println("The Value of Door is: "+ doors);
        System.out.println("The Value of Color is: "+ color);
        System.out.println("The Value of Transmission is: "+ transmission);
        System.out.println("The Value of Make is: "+ make);
    }
    public void accelarate(){
        System.out.println("Car is moving forward.");
    }
    public void brake(){
        System.out.println("Car has stopped.");
    }
}
