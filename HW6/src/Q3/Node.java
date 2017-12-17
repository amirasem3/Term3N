package Q3;

/**
 * AHAY
 * ASAY
 * Created by AmirHosein on 12/17/2017.
 */
class Node {
    private String data;
    private Node link;

    Node(String data, Node link) {
        this.data = data;
        this.link = link;
    }

    String getData() {
        return data;
    }

    Node getLink() {
        return link;
    }

    void setLink(Node link) {
        this.link = link;
    }
}
