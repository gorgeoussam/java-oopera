import java.util.ArrayList;

public class Ballet extends MusicalShow{
    private Choreographer choreographer;
    private MusicAuthor musicAuthor;


    public Ballet(String title, int duration, Director director, MusicAuthor musicAuthor, String librettoText, Choreographer choreographer, MusicAuthor musicAuthor1) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
        this.musicAuthor = musicAuthor1;
    }
}
