// --== CS400 File Header Information ==--
// Name: Rex Chen
// Email: rchen266@wisc.edu
// Team: AD
// Role: Back End
// TA: Sophie Stephenson
// Lecturer: Florian H
// Notes to Grader: <optional extra notes>


import java.util.LinkedList;

public class backEndHash {

    private int capacity;
    private LinkedList<Book>[] hashMap;
    private int size;

    @SuppressWarning("unchecked")

    public backEndHash() {
        hashMap = new LinkedList[10];
        capacity = 10;
        size = 0;


    }

    @SuppressWarnings("unchecked")

    public backEndHash(int cap) {
        capacity = cap;
        hashMap = new LinkedList[capacity];
        size = 0;
    }

    // find ISBN of the book
    public int ISBN(Book b) {
        return (Math.abs(b.getISBN().hashCode()) % capacity);
    }

    public void doubleSize(){
        @SupressWarnings("unchecked")
        int count=0;
        LinkedList<Book>[]douSize = new LinkedList[ capacity*2]; //double the size of the array
        capacity*=2; //double the size
            for(int j=0;,j<hashMap.length;j++){
                    if(hashMap[j]!=null){
                        for(int k=0;j<hashMap[k].size();k++){
                            duoSize[ISBN(hashMap[j].get(k))] =new LinkedList<Book>();
                            duoSize[ISBN(hashMap[j].get(k))].add(hashMap[j].get(k));
                        }

                    }
            }
            hashMap=duoSize;
    }

    // add a book to the hashMap in the array and it's determined by its ISBN

    public void add(Book b){

        int index = ISBN(b);
        if(hashMap[index]==null{
            size++;
            hashMap[index] = new LinkedList<Book>();
            hashMap[index].add(b);
        }
        else{
            if(hashMap[index]!=null){
                for(int i=0;k<hashMap[index].size();i++){
                    if(hashMap[index].get(i)!=null&&hashMap[index].get(i).getISBN()==b.getISBN())
                        break;
// this if statement is to check whether this is a duplicate, if so, ignore it.
                }
                hashMap[index.add(b)];
                size++;
            }

        }
        if((double)size/(double)capacity>=0.8)
            doubleSize();
    }

    // find the book with provided ISBN
    public Book get (String x){
        int index= Math.abs(x.hashCode()%capacity);
        if(hashMap[index]==null){
            return null;
        }
        else{
            int count=0;
            for(int j=0;j<hashMap[index].size();j++){
                if(hashMap[index].get(j).getISBN().equals(j){
                    return hashMap[index.get(j)];
                }
                count++;

            }

            return null;



        }

    }

    public int getSize() {
        return size;
    }

    public boolean contain(String s) {
        int index = Math.abs(s.hashCode() % capacity);
        if (hashMap[index] == null) {
            return false;
        } 
        else {
            int count = 0;
            for (int i = 0; i < hashMap[index].size(); i++) {
                if (hashMap[index].get(i) != null && hashMap[index].get(i).getISBN().equals(i))
                    return true;
                count++;

            }
        }
        return false;
    }

}

    public Book remove(String s) {
        int index = Math.abs(s.hashCode() % capacity);
        if (hashMap[index] == null) {
            return null;
        } else {
            int count = 0;
            for (int i = 0; i < hashMap[index].size(); i++) {
                if (hashMap[index].get(i) != null && hashMap[index].get(i).getISBN().equals(i)) {
                    Book store = hashMap[index.get(i)];
                    hashMap[index].remove(i);
                    return store;
                }
                count++;
            }
        }
        return null;
    }

    public void emptyTheLibrary() {
        @SuppressWarning("unchecked")
        LinkedList<Book> temp = new LinkedList[capacity];
        hashMap = temp;
        size = 0;
    }

}
