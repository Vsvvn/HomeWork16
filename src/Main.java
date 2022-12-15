import animals.*;

public class Main {

    public static void separator() {
        System.out.println("========================");
    }
    public static void separator1() {
        System.out.println();
    }


    public static void main(String[] args) {


        Car ladaGranta = new Car("Lada", "Lada Granta", -1.7, "желтый", 150,
                2015, "Россия", "автоматическая", "седан",
                "а111аг222", 4, true, new Car.Key(false, false),
                new Car.Insurance(2022, "995589949"), "бензин", 97.00);

        ladaGranta.setSeasonTires(true);
//        метод реализующий возможность смены сезонных шин

        ladaGranta.refill();
//        метод реализующий вывод в консоль типа топлива
        System.out.println(ladaGranta);
        System.out.println("Регистрационный номер: " + ladaGranta.registrationNumberCheck());
//        метод реализующий вывод проверки корретности регистрационного номера
        separator();


        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия",
                "", 301, 3500, 1, "Белорусского вокзала",
                "Минск - Пассажирский", 11, "дизель", 67.00);
        lastochka.refill();
        System.out.println(lastochka);


        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                "", 270, 1700, 2, "Ленинградского вокзала",
                "Ленинград-Пассажирский", 8, "дизель", 66.08);
        leningrad.refill();
        System.out.println(leningrad);
        separator();


        Bus volgaBus = new Bus("VolgaBus", "Ситиритм 12 GLF", 2007, "Россия",
                "оранжевый", 120, "бензин", 59.66);
        volgaBus.refill();
//        метод реализует вывод в консоль название типа топлива и установливает значение топлива 100.00%
        System.out.println(volgaBus);

        Bus liaz = new Bus("Лиаз", "ЛИАЗ-5292 РЕСТАЙЛИНГ", 2018, "Россия",
                "синий", 110, "дизель", 59.77);
        liaz.refill();
//        метод реализует вывод в консоль название типа топлива и установливает значение топлива 100.00%
        System.out.println(liaz);

        Bus kavz = new Bus("КАВЗ", "КАВЗ-4270", 2019, "Россия",
                "белый", 100, "бензин", 68.00);
        kavz.refill();
//        метод реализует вывод в консоль название типа топлива и установливает значение топлива 100.00%
        System.out.println(kavz);
        separator();

        Herbivore giraffe = new Herbivore("Жираф", 2010, "саванна", 60, "листья");
        System.out.println(giraffe);

        Herbivore gazelle = new Herbivore("Газель", 2014, "степь", 50, "трава");
        System.out.println(gazelle);

        Herbivore horse = new Herbivore("Лошадь", 2016, "степь", 60, "трава");
        System.out.println(horse);

        separator1();

        Predator hyena = new Predator("Гиена", 2014, "саванна", 60, "мясо");
        System.out.println(hyena);

        Predator tiger = new Predator("Тигр", 2017, "тропический лес, саванна", 96, "мясо");
        System.out.println(tiger);

        Predator bear = new Predator("Медведь", 2018, "тайга", 50, "всеядный");
        System.out.println(bear);

        separator1();

        Amphibian frog = new Amphibian("Лягушка", 2021, "тайга, тропический лес");
        System.out.println(frog);

        Amphibian freshwaterSnake = new Amphibian("Уж пресноводный", 2020, "тропический лес, тайга");
        System.out.println(freshwaterSnake);

        separator1();

        Flightless peacock = new Flightless("Павлин", 2019, "саванна, тропический лес", " по земле");
        System.out.println(peacock);

        Flightless penguin = new Flightless("Пенгвин", 2020, "тундра", " по земле");
        System.out.println(penguin);

        Flightless dodoBird = new Flightless("Птица Додо", 1760, "тропический лес", " по земле");
        System.out.println(dodoBird);

        separator1();

        Flying seagull = new Flying("Чайка", 2018, "тундра", " по воздуху");
        System.out.println(seagull);

        Flying albatross = new Flying("Альбатрос", 2017, "тундра", " по воздуху");
        System.out.println(albatross);

        Animal falcon = new Flying("Сокол", 2016, "тундра, тайга, саванна", " по воздуху");
        System.out.println(falcon);
    }
}
