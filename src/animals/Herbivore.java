package animals;

import java.util.Objects;

public class Herbivore extends Mammal {

    private String typeFood;


    public Herbivore(String name,
                     int birthYear,
                     String habitat,
                     int movementSpeed,
                     String typeFood) {
        super(name, birthYear, habitat, movementSpeed);

        setTypeFood(typeFood);
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        if (typeFood == null && typeFood.isEmpty() && typeFood.isBlank()) {
            this.typeFood = "default";
        } else {
            this.typeFood = typeFood;
        }
    }

    public void graze() {
        System.out.println("Травоядное пасется");
    }

    @Override
    public void eat() {
        System.out.println("Травоядное питается"+ getTypeFood());
    }

    @Override
    public void sleep() {
        System.out.println("Травоядное спит ночью");
    }

    @Override
    public void move() {
        System.out.println("Тип перемещения травоядного ходьба или неторопливый бег");
    }

    @Override
    protected void walk() {
        System.out.println(" Травоядные ходят по саваннам, степям, лесам и т.д.");
    }

    @Override
    public String toString() {
        return super.toString() + ", тип пищи " + typeFood + ", пренадлежит к классу травоядных";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(typeFood, herbivore.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }
}
