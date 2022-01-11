import java.time.Duration;

public class Runner {

    public static void main(String[] args) {

        Art.welcome();

        Playlist playlist = new Playlist();

        // prepend
        Art.prepend();

        playlist.prepend(new Song("POWER", "Kanye West", "My Beautiful Dark Twisted Fantasy", Duration.ofSeconds(270)));
        playlist.prepend(new Song("Lush Life", "Zara Larsson"));
        System.out.println(playlist.toString());

        // append
        Art.append();

        playlist.append(new Song("The Story Of O.J", "Jay-Z", Duration.ofSeconds(210)));
        System.out.println(playlist.toString());

        // insert at
        Art.insertAt();

        playlist.insertAt(2, new Song("King Push", "Pusha T", Duration.ofSeconds(151)));
        playlist.insertAt(4, new Song("Juice", "Lizzo", Duration.ofSeconds(189)));
        System.out.println(playlist.toString());

        // remove at
        Art.removeFirst();

        playlist.removeFirst();
        System.out.println(playlist.toString());

        // remove last
        Art.removeLast();

        playlist.removeLast();
        System.out.println(playlist.toString());

        // remove at
        Art.removeAt();

        playlist.removeAt(1);
        System.out.println(playlist.toString());

    }
}
