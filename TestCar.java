public class Car {
    private String carName;
    private String make;
    private String model;
    private int year;
    private int miles;

    public Car(String carName, String make, String model, int year, int miles) {
        this.carName = carName;
        this.make = make;
        this.model = model;
        this.year = year;
        this.miles = miles;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
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

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

}
