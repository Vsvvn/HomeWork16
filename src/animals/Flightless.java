package animals;

import java.util.Objects;

public class Flightless extends Bird{
    private String moveType;

    public Flightless(String name, int age, String habitat, String moveType) {
        super(name, age, habitat);

        if (moveType == null && moveType.isEmpty() && moveType.isBlank()) {
            this.moveType = "default";
        } else {
            this.moveType = moveType;
        }
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }

    public void flightless() {
        System.out.println("Нелетающие птицы ходят по земле");
    }

    @Override
    public void eat() {
        System.out.println("Нелетающая птица ест на земле");
    }

    @Override
    public void sleep() {
        System.out.println("Нелетающая птица спит ночью");
    }

    @Override
    public void move() {
        System.out.println("Нелетающая птица перемещается " + getMoveType());
    }

    @Override
    public void hunt() {
        System.out.println("Нелетающая птица охотится на земле");
    }

    @Override
    public String toString() {
        return super.toString() +", тип перемещения " + moveType + ", пренадлежит к классу нелетающих птиц";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(moveType, that.moveType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), moveType);
    }
}
