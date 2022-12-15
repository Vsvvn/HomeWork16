package animals;

import java.util.Objects;

public class Flying extends Bird {

    private String moveType;

    public Flying(String name, int age, String habitat, String moveType) {
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

    public void flying() {
        System.out.println("Летающие птицы летают, ходят и бегают");
    }


    @Override
    public void eat() {
        System.out.println("Летающая ест на земле и в полете");
    }

    @Override
    public void sleep() {
        System.out.println("Летающая птица спит ночью");
    }

    @Override
    public void move() {
        System.out.println("Летающая птица перемещается " + getMoveType());
    }

    @Override
    public void hunt() {
        System.out.println("Летающая птица охотится в полете");
    }

    @Override
    public String toString() {
        return super.toString() + ", тип перемещения " + moveType + ", пренадлежит к классу летающих птиц";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(moveType, flying.moveType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), moveType);
    }
}
