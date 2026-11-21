public class SeatQueue {
    private class SeatRequestNode{
        SeatRequest data;
        SeatRequestNode next;
        SeatRequestNode(SeatRequest data){
            this.data=data;
            this.next=null;
        }
    }
    private SeatRequestNode front;
    private SeatRequestNode rear;
    private int size;
    public SeatQueue(){
        this.front=null;
        this.rear=null;
        this.size=0;
    }
    public void enqueue(SeatRequest request){
        SeatRequestNode newNode=new SeatRequestNode(request);
        if(isEmpty()){
            front=rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;

        }
        size++;
    }
    public SeatRequest dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return null;
        }
        SeatRequest removedSeat=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        size--;
        return removedSeat;
    }
    public int size(){
        return size;
    }
    public void PrintQueue(){
        SeatRequestNode temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return front==null && rear==null;
    }
}
