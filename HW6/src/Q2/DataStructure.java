package Q2;

/**
 * AHAY
 * ASAY
 * Created by AmirHosein on 12/16/2017.
 */
class DataStructure {
    private Node start;
    private Node end;
    private int size;

    DataStructure() {
        start = null;
        end = null;
        size = 0;
    }

    void addNumber(int number) {
        Node nptr = new Node(number, null);
        size++;
        if (start == null) {
            start = nptr;
            nptr.setIndex(size - 1);
            end = start;
        } else {
            end.setLink(nptr);
            nptr.setIndex(size - 1);
            end = nptr;
        }
    }

    void findMedian() {
        double middleElement;
        if (size == 0) {
            System.out.print("empty\n");
            return;
        }
        if (start.getLink() == null) {
            System.out.println(start.getData());
            return;
        }
        Node iterateNode = start;
        if (size % 2 == 0) {
            while (iterateNode.getLink() != null) {
                if (iterateNode.getIndex() == size / 2 - 1) {
                    double result = (double) iterateNode.getData() + (double) iterateNode.getLink().getData();
                    middleElement = result / 2;
                    System.out.println(middleElement);
                    break;
                }
                iterateNode = iterateNode.getLink();
            }
        } else {
            while (iterateNode.getLink() != null) {
                if (iterateNode.getIndex() == size / 2) {
                    middleElement = iterateNode.getData();
                    System.out.println(middleElement);
                    break;
                }
                iterateNode = iterateNode.getLink();
            }
        }

    }

}

