import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport {
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {

            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;


        }

        @Override
        public String toString() {
            return "удаленный запуск двигателя " + remoteEngineStart +
                    ", доступ без ключа " + keylessAccess;
        }
    }


    public static class Insurance {
        private int validityPeriod;
        private final double price;
        private String number;

        public Insurance(int validityPeriod, String number) {


            if (validityPeriod != 0 && validityPeriod == LocalDate.now().getYear()) {
                this.validityPeriod = validityPeriod;
                System.out.println("страховка действует в " + validityPeriod);
            } else {
                System.out.println("Нужно срочно ехать оформлять новую страховку!");
            }

            this.price = 10000;

            if (number.length() == 9) {
                this.number = number;
                System.out.println("номер страховки " + number);
            } else {
                System.out.println("Номер страховки некорректный!");

            }
        }

        @Override
        public String toString() {
            return ", цена страховки составляет " + price + " рублей" + "\n";
        }

        public int getValidityPeriod() {
            return validityPeriod;
        }

        public double getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

        public void setValidityPeriod(int validityPeriod) {
            this.validityPeriod = validityPeriod;
        }

        public void setNumber(String number) {
            this.number = number;
        }


    }


//    Задание № 1
//    Задача № 1

    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberSeats;
    private boolean seasonTires;

    private Key key;
    private Insurance insurance;


    public Car(String brand) {
        this(brand, "default",
                1.5,
                "default",
                120,
                2000,
                "default",
                "default",
                "default",
                "xx000x000",
                2,
                true,
                new Key(false, false),
                new Insurance(2020, "000000000"),
                "default",
                57.49);
    }

    @Override
    void refill() {/*Задание 2*/
        System.out.println("Автомобиль заправлен топливом " + getFuelType());
        setFuelPercentage(100.00);
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int maxSpeed,
               int productionYear,
               String productionCountry,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberSeats,
               boolean seasonTires,
               Key key,
               Insurance insurance,
               String fuelType,
               double fuelPercentage) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, fuelType, fuelPercentage);

        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }


        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = "хх000х000";
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (numberSeats > 0) {
            this.numberSeats = numberSeats;
        } else {
            this.numberSeats = 2;
        }

        this.seasonTires = seasonTires;

        this.key = key;
        this.insurance = insurance;
    }


    public double getEngineVolume() {
        return engineVolume;
    }


    public String getTransmission() {
        return transmission;
    }


    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public boolean isSeasonTires() {
        return seasonTires;
    }


    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    public void setSeasonTires(boolean seasonTires) {
        this.seasonTires = seasonTires;
    }

    public void seasonTiresChange() {
        setSeasonTires(!seasonTires);
    }
//    Метод реализующий смену шин через boolean


////////////////////////////////////////////////////////////////////////////////////////
//   Метод реализующий смену шин через String                                         //
////////////////////////////////////////////////////////////////////////////////////////                                                                                    //
//    public String seasonTiresChange() {                                             //
//                                                                                    //
//        int[] month = {9, 10, 11, 12, 1, 2};                                        //
//        String seasonTires = null;                                                  //
//                                                                                    //
//        for (int element : month) {                                                 //
//            if (this.seasonTires <= 12 && this.seasonTires > 0) {                   //
//                if (this.seasonTires == element) {                                  //
//                    seasonTires = "зимняя.";                                        //
//                    break;                                                          //
//                } else {                                                            //
//                    seasonTires = "летняя.";                                        //
//                }                                                                   //
//            } else {                                                                //
//                throw new IllegalArgumentException("Такого месяца несуществет!");   //
//            }                                                                       //
//        }                                                                           //
//        return seasonTires;                                                         //
//    }                                                                               //
////////////////////////////////////////////////////////////////////////////////////////

    public boolean registrationNumberCheck() {

        char[] letters = {'а', 'в', 'е', 'к', 'м', 'н', 'о', 'р', 'с', 'т', 'у', 'х'};

        boolean result;
        boolean result1;
        boolean result2;
        boolean result3;
        boolean result4;
        boolean result5;
        boolean result6;
        boolean result7;

        char one;
        one = Character.valueOf(registrationNumber.charAt(0));
        char two;
        two = Character.valueOf(registrationNumber.charAt(4));
        char three;
        three = Character.valueOf(registrationNumber.charAt(5));

        result1 = registrationNumber.length() == 9;

        result2 = false;
        for (char element : letters) {
            if (element == (one)) {
                one = element;
                result2 = true;
            }
        }
        result3 = one == (registrationNumber.charAt(0));
        result = result1 && result2 && result3;

        result = result && Character.isDigit(registrationNumber.charAt(1));
        result = result && Character.isDigit(registrationNumber.charAt(2));
        result = result && Character.isDigit(registrationNumber.charAt(3));

        result4 = false;
        for (char element : letters) {
            if (element == (two)) {
                two = element;
                result4 = true;
            }
        }
        result5 = two == (registrationNumber.charAt(4));
        result = result1 && result4 && result5;

        result6 = false;
        for (char element : letters) {
            if (element == (three)) {
                three = element;
                result6 = true;
            }
        }
        result7 = result && three == (registrationNumber.charAt(5));
        result = result1 && result6 && result7;

        result = result && Character.isDigit(registrationNumber.charAt(6));
        result = result && Character.isDigit(registrationNumber.charAt(7));
        result = result && Character.isDigit(registrationNumber.charAt(8));

        return result;
    }
//    Метод реализующий проверку номера регистрации

    @Override
    public String toString() {
        return "Автомобиль: " + super.toString() + ", объем двигателя — " + engineVolume + "\n" +
                "коробка передач " + transmission +
                "тип кузова " + bodyType + ", регистрационный номер " + registrationNumber +
                ", количество мест " + numberSeats + ", летняя резина " + seasonTires + insurance + key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && getProductionYear() == car.getProductionYear() &&
                numberSeats == car.numberSeats && seasonTires == car.seasonTires && Objects.equals(getBrand(), car.getBrand()) &&
                Objects.equals(getModel(), car.getModel()) && Objects.equals(getColor(), car.getColor()) &&
                Objects.equals(getProductionCountry(), car.getProductionCountry()) &&
                Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) &&
                Objects.equals(registrationNumber, car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), engineVolume, getColor(), getProductionYear(), getProductionCountry(), transmission, bodyType,
                registrationNumber, numberSeats, seasonTires);
    }

}