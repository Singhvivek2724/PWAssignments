public class LinkedListSum {
     Node head;
        class Node{
            int data;
            Node next;

            public Node(int data){
                this.data=data;               

            }
        }

    public void insertAtEnd(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            head.next=null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next =newNode;
           
    }
    public void cycleDetect() {
        Node start = head;
        Node end = head;
        int flag = 0;
        while (start != null && end != null && end.next != null) {
            start = start.next;
            end = end.next.next;
            if (start == end) {
                flag = 1;
                break;
            }

        }
        if (flag != 0) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("Not detected");
        }
    }
    public void insertAtFirst(int data) {
        Node temp = new Node(data);
        temp.next = head;
        temp.data = data;
        head = temp;
    }

    public void insertAtGivenPos(int data, int index) {
        Node p = head;
        Node q = null;
        for (int i = 0; i < index - 1; i++) {
            q = p;
            p = p.next;

        }
        Node temp = new Node(data);
        q.next = temp;
        temp.next = p;
        temp.data = data;

    }

    public int sum1(){
        Node p=head;
        int rem=0;
        while(p!=null){
            rem=rem*10+p.data;
            p=p.next;
        }
        return rem;
    }
    public void display(){
        Node p=head;
        while(p!=null){
            System.out.print(p.data + " ") ;
            p=p.next;
        }
        System.out.println();
    }   
    public static void main(String[] args) {
       LinkedListSum ll1=new LinkedListSum();
       ll1.insertAtEnd(7);
       ll1.insertAtEnd(5);
       ll1.insertAtEnd(9);
       ll1.insertAtEnd(4);
       ll1.insertAtEnd(6);
       ll1.display();

       LinkedListSum ll2=new LinkedListSum();
       ll2.insertAtEnd(8);
       ll2.insertAtEnd(4);
  
        
       ll2.display();
        System.out.println(ll1.sum1() + ll2.sum1());
      
       


    }
    
}
