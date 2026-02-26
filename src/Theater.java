import java.util.ArrayList;

public class Theater{


    public static void main(String[] args) {
        Actor Tom = new Actor("Tom", "Cruise", 158, Gender.MALE);
        Actor Uma = new Actor("Uma", "Turman", 181, Gender.FEMALE);
        Actor Brad = new Actor("Bradd", "Pitt", 180, Gender.MALE);

        Choreographer Name = new Choreographer("ChoreographerName", "ChoreographerSurname");
        MusicAuthor Hans = new MusicAuthor("Hans", "Zimmerman");
        Director Steven = new Director("Steven", "Spielberg", 9000);
        Director Quentin = new Director("Quentin", "Tarantino", 666);

        MusicalShow regular = new MusicalShow("Rgular", 1, Quentin, Hans, "not sure what it is");
        Opera opera = new Opera("Opera", 2, Steven, Hans, "cool opera", 314);
        Ballet ballet = new Ballet("Ballet", 3,Quentin, Hans, "cool ballet", Name, Hans);

        regular.addActor(Brad);
        opera.addActor(Tom);
        ballet.addActor(Uma);

        regular.printCast();
        opera.printCast();
        ballet.printCast();

        opera.replaceActor(Uma, "Cruise");
        opera.printCast();

        opera.replaceActor(Uma, "Ivanov");

        opera.printLibrettoText();
        ballet.printLibrettoText();

    }
}

