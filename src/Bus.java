import java.util.Objects;

//Задание 1
//задача 3
public class Bus extends Transport {

    private double fuelPercentage;


    public Bus(String brand) {
        super(brand, "Default",
                2000,
                "Россия",
                "белый",
                120,
                "default",
                57.49);
    }

    @Override
    void refill() {/*Задание 2*/
        System.out.println("Автобус заправлен топливом " + getFuelType());
        setFuelPercentage(100.00);
    }
    public Bus(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String color,
               int maxSpeed,
               String fuelType,
               double fuelPercentage) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, fuelType, fuelPercentage);


    }


    @Override
    public String toString() {
        return "Автобус: " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Double.compare(bus.fuelPercentage, fuelPercentage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fuelPercentage);
    }
}
