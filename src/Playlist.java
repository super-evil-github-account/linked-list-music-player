public class Playlist {

    private Song head;
    private Song tail;
    private int size;

    public Playlist(){
        head = new Song(null, null, null, null);
        tail = head;
    }

    public void prepend(Song song){

        if (size == 0){

            tail = song;
            song.setPrevious(head);
            head.setNext(song);

        } else {

            song.setNext(head.getNext());
            song.setPrevious(head);
            head.setNext(song);

        }

        size++;
    }

    public void append(Song song){

        if (size == 0){

            song.setPrevious(head);
            head.setNext(song);
            tail = song;

        } else {

            tail.setNext(song);
            song.setPrevious(tail);
            tail = song;
        }

        size++;
    }

    public void removeFirst(){

        if (size != 0){
            head.setNext(head.getNext().getNext());
            size--;
        }
    }

    public void removeLast(){

        if (size == 1){

            removeFirst();

        } else if (size > 1){

            Song temp = head.getNext();
            int count = 1;

            while (count != size){

                if (count == size -1){

                    tail = temp.getNext();
                    temp.setNext(null);
                    size--;
                    break;
                }

                count++;
                temp = temp.getNext();
            }

        }
    }

    public void insertAt(int index, Song song){

        if (index == 0){

            prepend(song);

        } else if (index == size){

            append(song);

        } else {

            if (index <= size){

                Song temp = head.getNext();
                int count = 0;

                while (count != size){

                    if (count == index -1){
                        Song tempNext = temp.getNext();
                        temp.setNext(song);
                        song.setNext(tempNext);
                        song.setPrevious(temp);
                        size++;
                        break;
                    }

                    count++;
                    temp = temp.getNext();
                }

            }
        }
    }

    public void removeAt(int index){ // feel free to throw exception here!

        if (index >= size && index <= 0){
            System.out.println("invalid index");
            return;
        }

        if (index == 0){

            removeFirst();

        } else if (index == size) {

            removeLast();

        } else {

            Song temp = head.getNext();
            int count = 1;

            while (count != size){

                if (count == index -1){

                    temp.getNext().setPrevious(temp.getNext());
                    temp.setNext(temp.getNext().getNext());
                    size--;
                    break;
                }

                count++;
                temp = temp.getNext();
            }
        }
    }

    public int getSize(){
        return size;
    }

    public String toString(){

        String list = "";
        Song temp = head.getNext();

        while (temp != null){
            list += temp.toString() + ", ";
            temp = temp.getNext();
        }

        return list;
    }
}
