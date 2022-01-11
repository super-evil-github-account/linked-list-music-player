# linked-list-music-player
Practice your Linked List skills with implementation of a demo music player


In this task, you will build a demo of a music player using your own doubly Linked List implementation and OOP 

Step 1: 
Create the basic song class

Song 

		private Song next; 
		private Song previous; 
		private String song; 
		private String artist; 
		private String album; 
		private Duration duration;
    
		implement getters, setters, toString
    
		constructors to implement (overload constructors! Try to avoid code repetition): 
		public Song(Song next, Song previous, String song, String artist, String album, Duration duration); 
		public Song(Song next, Song previous, String song, String artist, Duration duration); 
		public Song(Song next, Song previous, String song, String artist) 
	
Step 2: 
Create the playlist class

 Playlist 
 
    private Song head; 
    private song tail; 
    private int size;  

		constructor:
		public Playlist()

		In the following methods you will create the linked list. please take into consideration that the size of the playlist will change accordingly
    
   		implement the following methods:
		public void prepend(Song song): add a new song to the beginning of the list
		public void append(Sons song): add a new song to the end of the list
		public void removeFirst(): remove the first element of the list. note that you will need to re-set the head	
		public void removeLast(): remove the last element of the list
		public void insertAt(int index, Song song): insert song at given index
		public int getSize(): return the size of the list
		public String toString(): return a String of all the songs in the playlist

Step 3:
Create a Runner class with main method and test your playlist

                                                           
** good luck! **
                                                            


