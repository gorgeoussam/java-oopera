import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, int height, Gender gender) {
        super(name, surname);
        this.height = height;

    }

    public int getHeight() {
        return height;
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(getHeight());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || getClass() != obj.getClass()) return false;

        Actor actor = (Actor) obj;
        return name.equals(actor.name) && surname.equals(actor.surname) && height==actor.getHeight();
    }
}
