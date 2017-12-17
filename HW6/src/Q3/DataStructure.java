package Q3;

/**
 * AHAY
 * ASAY
 * Created by AmirHosein on 12/17/2017.
 */
public class DataStructure {
    private Node start;
    private Node end;
    private int size;

    DataStructure() {
        start = null;
        end = null;
        size = 0;
    }

    void addWord(String word) {
        Node nptr = new Node(word, null);
        size++;
        if (start == null) {
            start = nptr;
            end = start;
        } else {
            end.setLink(nptr);
            end = nptr;
        }
    }

    void search(String word) {
        int result = 0;
        Node first = start;
//        if (word.charAt(0)=='.') {
//            //TODO
//            String newStr = word.substring(1);
//            System.out.println(newStr);
//            return specialSearch(newStr);
//        } else {
            while (first != null) {
                if (first.getData().equals(word)) {
                    result = 1;
                } else {
                    result = 0;
                }
                first = first.getLink();

            }

        System.out.println(result);;
    }

//    boolean specialSearch(String specialWord) {
//        System.out.println(search(specialWord));
//        return search(specialWord);
//    }

    public void display() {
        System.out.print("\nDictionary = ");
        if (size == 0) {
            System.out.print("empty\n");
            return;
        }
        if (start.getLink() == null) {
            System.out.println(start.getData());
            return;
        }
        Node ptr = start;
        System.out.print(start.getData() + "->");
        ptr = start.getLink();
        while (ptr.getLink() != null) {
            System.out.print(ptr.getData() + "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData() + "\n");
    }
}
