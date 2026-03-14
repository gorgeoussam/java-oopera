import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }


    public void printDirector() {
        System.out.println(this.director.name + " " + this.director.surname);
    }

    public void printCast() {
        System.out.println("Cast:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.getName() + " " + actor.getSurname() + " (" + actor.getHeight() + ")");
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("this actor is already present in cast ");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String surname) {

        int count = 0;
        int index = -1;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) count++;
            index = i;
        }

        if (count == 0) {
            System.out.println("Actor with name " + surname + " not found");
        } else if (count >= 1) {
            System.out.println("Multiply duplicates found " + count);
        } else {
            listOfActors.set(index, newActor);
            System.out.println("Actor +" + surname + " is replaced");
        }

    }


}



