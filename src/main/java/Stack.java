public class Stack<T> {
    Node<T> head;

    Stack(){
        head =null;
    }

    public boolean isEmpty(){
        return head ==null;
    }

    void push(T data){
        Node<T> newNode=new Node(data);

        if(head==null) head=newNode;
        else{
            newNode.next=head;
            head=newNode;
        }
    }


}
