package Q2;

/**
 * AHAY
 * ASAY
 * Created by AmirHosein on 12/17/2017.
 */
public class Node {
    public int index ;
    private Node link ;
    private int data ;
    Node(int d , Node n){
        data = d;
        link = n;
    }
    void setLink(Node n)
    {
        link = n;
    }

    Node getLink()
    {
        return link;
    }
    int getData()
    {
        return data;
    }
    int getIndex(){
        return index;
    }
    void setIndex(int index){
        this.index = index;
    }
}
