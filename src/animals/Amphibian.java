package animals;

import java.util.Objects;

public class Amphibian extends Animal {

    private String habitat;

    public Amphibian(String name,
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

    public void hunt() {
        System.out.println("Земноводное охотится");
    }

    @Override
    public void eat() {
        System.out.println("Земноводное питается насекомыми и беспозвоночными");
    }

    @Override
    public void sleep() {
        System.out.println("Земноводное спит днем");
    }

    @Override
    public void move() {
        System.out.println("Земноводное перемещается и по земле и в воде");
    }

    @Override
    public String toString() {
        return super.toString() + "среда обитания " + habitat  + ", пренадлежит к классу земноводных";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(habitat, amphibian.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }
}
