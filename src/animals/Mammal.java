package animals;

import java.util.Objects;

public abstract class Mammal extends Animal {

    private String habitat;
    private int movementSpeed;

    public Mammal(String name,
                  int birthYear,
                  String habitat,
                  int movementSpeed) {
        super(name, birthYear);

        if (habitat == null && habitat.isEmpty() && habitat.isBlank()) {
            this.habitat = "default";
        } else {
            this.habitat = habitat;
        }

        if (movementSpeed >= 0) {
            this.movementSpeed = movementSpeed;
        } else {
            this.movementSpeed = Math.abs(movementSpeed);
        }
    }


    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    protected abstract void walk();


    @Override
    public String toString() {
        return super.toString() + " среда обитания " + habitat +
                ", скорость движения " + movementSpeed + " км/ч";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Mammal mammal = (Mammal) o;
        return movementSpeed == mammal.movementSpeed && Objects.equals(habitat, mammal.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, movementSpeed);
    }
}
