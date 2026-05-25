package model;

public class Node {
    private Contact value;
    private Node next;

    public Node(Contact value ){
        this.value=value;
        this.next=null;
    }


    public Node getNext() {
        return next;
    }

    public Contact getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(Contact value) {
        this.value = value;
    }
}
