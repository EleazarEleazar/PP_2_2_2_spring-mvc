package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private String brand;
    private int year;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (o == this) return true;
        Car car = (Car) o;
        return year == car.year
                && Objects.equals(model, car.model)
                && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, brand, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}
