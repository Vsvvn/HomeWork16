package animals;

import java.time.LocalDate;
import java.util.Objects;

//Задание 3
public abstract class Animal {

    private String name;
    private int birthYear;

    public Animal(String name, int age) {


        setName(name);

        if (age >= 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null && name.isEmpty() && name.isBlank()) {
            this.name = "default";
        } else {
            this.name = name;
        }
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    @Override
    public String toString() {
        return name +
                ", возраст " + birthYear + " лет, ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Animal animals = (Animal) o;
        return birthYear == animals.birthYear && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear);
    }
}
