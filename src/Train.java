//Задание 1
//задача 2

import java.util.Objects;

public class Train extends Transport {


    private int priceTrip;
    private int timeTrip;
    private String nameDepartureStation;
    private String terminalStop;
    private int numberOfWagons;

    public Train(String brand) {
        super(brand, "Default",
                2000,
                "Default",
                "Default",
                120,
                "default",
                60.00);
    }



    @Override
    void refill() {/*Задание 2*/
        System.out.println("Поезд заправлен топливом " + getFuelType());
        setFuelPercentage(100.00);
    }

    public Train(String brand,
                 String model,
                 int productionYear,
                 String productionCountry,
                 String color,
                 int maxSpeed,
                 int priceTrip,
                 int timeTrip,
                 String nameDepartureStation,
                 String terminalStop,
                 int numberOfWagons,
                 String fuelType,
                 double fuelPercentage) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed,fuelType,fuelPercentage);


        if (priceTrip > 0) {
            this.priceTrip = priceTrip;
        } else {
            this.priceTrip = 1000;
        }


        if (timeTrip > 0) {
            this.timeTrip = timeTrip;
        } else {
            this.timeTrip = 2;
        }

        if (nameDepartureStation == null || nameDepartureStation.isEmpty() || nameDepartureStation.isBlank()) {
            this.nameDepartureStation = "default";
        } else {
            this.nameDepartureStation = nameDepartureStation;
        }


        if (terminalStop == null || terminalStop.isEmpty() || terminalStop.isBlank()) {
            this.terminalStop = "default";
        } else {
            this.terminalStop = terminalStop;
        }

        if (numberOfWagons > 0) {
            this.numberOfWagons = numberOfWagons;
        } else {
            this.numberOfWagons = 1;
        }


    }

    public int getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(int priceTrip) {
        this.priceTrip = priceTrip;
    }

    public int getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(int timeTrip) {
        this.timeTrip = timeTrip;
    }

    public String getNameDepartureStation() {
        return nameDepartureStation;
    }

    public void setNameDepartureStation(String nameDepartureStation) {
        this.nameDepartureStation = nameDepartureStation;
    }

    public String getTerminalStop() {
        return terminalStop;
    }

    public void setTerminalStop(String terminalStop) {
        this.terminalStop = terminalStop;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }


    @Override
    public String toString() {
        return
                "Поезд: " + super.toString() +
                        ", цена поездки " + priceTrip + "," + "\n" +
                        "время поездки " + timeTrip +
                        ", станция отправления " + nameDepartureStation +
                        ", станиция назначения " + terminalStop +
                        ", количество вагонов " + numberOfWagons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return priceTrip == train.priceTrip && timeTrip == train.timeTrip && numberOfWagons == train.numberOfWagons && Objects.equals(nameDepartureStation, train.nameDepartureStation) && Objects.equals(terminalStop, train.terminalStop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceTrip, timeTrip, nameDepartureStation, terminalStop, numberOfWagons);
    }
}
