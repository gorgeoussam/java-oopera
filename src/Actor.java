public class Actor extends Person {
    private int height;
    private Gender gender;

    public Actor(String name, String surname, int height, Gender gender) {
        super(name, surname);
        this.height=height;

    }

    public int getHeight() {
        return height;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if ((obj == null) || getClass() != obj.getClass()) return false;

        Actor actor = (Actor) obj;
        return name.equals(actor.name) && surname.equals(actor.surname);
    }
}
