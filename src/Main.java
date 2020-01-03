import com.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();


/*
        list.add(10);
        list.add(30);
        list.add(1, 20);
        list.addBegin(0);
        list.add(1,15);
*/

        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
