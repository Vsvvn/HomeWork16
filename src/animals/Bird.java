package animals;

import java.util.Objects;

public abstract class Bird extends Animal {

    private String habitat;

    public Bird(String name,
                int age,
                String habitat) {
        super(name, age);
        if (habitat == null && habitat.isEmpty() && habitat.isBlank()) {
            this.habitat = "default";
        } else {
            this.habitat = habitat;
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public abstract void hunt();

    @Override
    public String toString() {
        return super.toString() + "среда обитания " + habitat;
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
        Bird bird = (Bird) o;
        return Objects.equals(habitat, bird.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }
}
