
//Задание 1
//задача 1
public abstract class Transport {

    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;
    private String fuelType;/*Задание 2*/
    private double fuelPercentage;/*Задание 2*/


    public Transport(String brand) {
        this(brand, "default",
                0,
                "default",
                "default",
                0,
                "default",
                60.00);

    }

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     String color,
                     int maxSpeed,
                     String fuelType,
                     double fuelPercentage) {

        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (productionYear >= 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }

        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        setColor(color);


        setMaxSpeed(maxSpeed);

        if (fuelType == null && fuelType.isEmpty() && fuelType.isBlank()) {
            this.fuelType = "default";
        } else {
            this.fuelType = fuelType;
        }


        if (fuelPercentage < 0 || fuelPercentage > 100) {
            this.fuelPercentage =  57.49;
        } else {
            this.fuelPercentage = fuelPercentage;
        }
    }
/////////////////////////////////////////////
/*Задание 2*/
    abstract void refill();
/////////////////////////////////////////////
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) {
            this.maxSpeed = Math.abs(maxSpeed);
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage < 0 || fuelPercentage > 100) {
            this.fuelPercentage =  57.49;
        } else {
            this.fuelPercentage = fuelPercentage;
        }
    }

    @Override
    public String toString() {
        return "Марка " + brand +
                ", модель " + model +
                ", год производства " + productionYear +
                ", страна производства " + productionCountry +
                ", цвет " + color +
                ", максимальная скорость " + maxSpeed +
                " км/ч " + ", тип топлива " + fuelType + ", значение топлива " + fuelPercentage + "%";
    }
}
