import java.time.Duration;

public class Song {

    private Song next;
    private Song previous;
    private String song;
    private String artist;
    private String album;
    private Duration duration;

    public Song(String song, String artist, String album, Duration duration) {
        this.next = null;
        this.previous = null;
        this.song = song;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public Song(String song, String artist, Duration duration){
        this(song, artist, null, duration);
    }

    public Song(String song, String artist){
        this(song, artist, null, null);
    }

    public Song getNext() {
        return next;
    }

    public void setNext(Song next) {
        this.next = next;
    }

    public Song getPrevious() {
        return previous;
    }

    public void setPrevious(Song previous) {
        this.previous = previous;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                " now playing='" + song + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", duration=" + duration +
                '}';
    }
}
