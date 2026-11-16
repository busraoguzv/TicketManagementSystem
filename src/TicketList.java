public class TicketList {
    //
    public class TicketNode{
        Ticket data;
        TicketNode next;

        public TicketNode(Ticket data){
            this.data=data;
            this.next=null;
        }
    }

    //instance variable
    private TicketNode head;

    //constructor:head should be initialized to null
    public TicketList(){
        this.head=null;
    }

    //add a new ticket reservation to the list
    public void addTicket(Ticket t){
        TicketNode newTicket=new TicketNode(t);
        if(head==null){
            head=newTicket;
        }else{
            TicketNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newTicket;
        }
    }
    //remove a ticket reserved to the list
    public Ticket removeTicket(int id){
        //if the list is empty
        if(head==null){
            return null;
        }
        //Otherwise, traverse the list
        //start from head
        TicketNode current=head;
        //create a new node for previous
        TicketNode prev=null;
        while(current.next!=null && current.data.getTicketId()!=id){
            //keep the previous
            prev=current;
            current=current.next;
        }
        if(current.next!=null){
            Ticket removedTicket=current.data;
            if(prev==null){
                //if the  node is head
                head=current.next;
            }else{
                //link the previous node and after the current
                prev.next=current.next;
            }
            //return the removed ticket
            return removedTicket;
        }
        //if id is not in the list
        return null;
    }
    //search for a reserved ticket
    //and return ticket's information
    public Ticket findTicket(int id){
        //if list is empty
        if(head==null){
            return null;
        }
        //otherwise traverse the list from head
        TicketNode current=head;
        while(current!=null){
            //check if its id equal
            if(current.data.getTicketId()==id){
                return current.data;
            }
            //if not found move next
            current=current.next;
        }
        //if id is not in the list
        //id is not found
        return null;
    }
    //print all tickets currently in the list
    public void printlist(){
        //check if is empty
        if(isEmpty()){
            System.out.println("There is no tickets in the list");
            return;
        }
        //traverse through the list
        //start from head
        TicketNode temp=head;
        while(temp!=null){
            System.out.print(temp.data.getTicketId()+" ");
            //move to the next ticket
            temp=temp.next;
        }
    }
    public boolean isEmpty(){
        return head==null;
    }

}
