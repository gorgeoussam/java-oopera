import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }


    public void printDirector() {
        System.out.println(this.director.name+" "+this.director.surname);
    }

    public void printCast(){
        System.out.println("Cast:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.getName()+ " " + actor.getSurname()+" ("+actor.getHeight()+")");
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
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);

            if (currentActor.getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр с фамилией " + surname + " заменён.");
                return;
            }
        }

        // если не нашли
        System.out.println("Актёр с фамилией " + surname + " не найден.");
    }
    }


