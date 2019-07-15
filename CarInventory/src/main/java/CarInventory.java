public class CarInventory{

    //variables
    private int carId;
    private String make;
    private String model;
    private int year;
    private String color;
    private int miles;

    //getters and setters
    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }
    //print the cars in this format
    public String toString(){

        return "Car {" +
                "Car ID= '" + carId + '\'' +
                "make= '" + make + '\'' +
                ", model= '" + model + '\'' +
                ", year= " + year +
                ", color= '" + color + '\'' +
                ", miles= " + miles +
                '}';
    }
}
