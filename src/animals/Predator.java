package animals;

import java.util.Objects;

public class Predator extends Mammal {


    private String typeFood;

    public Predator(String name,
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

    public void hunt() {
        System.out.println("Хищник охотится");
    }

    @Override
    public void eat() {
        System.out.println("Хищник питается" + getTypeFood());
    }

    @Override
    public void sleep() {
        System.out.println("Хищник спит днем и ночью");
    }

    @Override
    public void move() {
        System.out.println("Тип перемещения хищника ходьба или неторопливый бег");
    }

    @Override
    protected void walk() {
        System.out.println(" хищники ходят по саваннам, степям, лесам и т.д.");
    }

    @Override
    public String toString() {
        return super.toString() + ", тип пищи " + typeFood  + ", пренадлежит к классу хищников";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(typeFood, predator.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }
}
