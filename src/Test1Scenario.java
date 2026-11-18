public class Test1Scenario {
    public static void main(String[] args){
        //create a new list
        TicketList ticketList = new TicketList();
        //create tickets
        Ticket ticket1=new Ticket(1120,"Melis Çakır","Tangled","K08","20:30");
        Ticket ticket2=new Ticket(1121,"Esra Erez","Harry Potter","E07","11:00");
        Ticket ticket3=new Ticket(1122,"Şefika Selin Taşdemir","How to Lose a Guy in 10 Days","D07","18:00");
        Ticket ticket4=new Ticket(1123,"Büşra Oğuz","How to Train Your Dragon","E09","23:30");
        Ticket ticket5=new Ticket(1124,"Gökçesu Cirtil","","F12","14:00");
        //add tickets in ticketList
        ticketList.addTicket(ticket1);
        ticketList.addTicket(ticket2);
        ticketList.addTicket(ticket3);;
        ticketList.addTicket(ticket4);
        ticketList.addTicket(ticket5);
        //print the list
        System.out.println("--------TICKET LIST--------");
        ticketList.printList();
        //remove one ticket by ID
        ticketList.removeTicket(1122);
        System.out.println();
        //after remove print list again
        System.out.println("--------UPDATED TICKET LIST-------");
        ticketList.printList();
        System.out.println();
        //search for one ticket by ID
        int searchedId=1123;
        Ticket searched=ticketList.findTicket(searchedId);
        //if the Id exists
        if(searched!=null){
            System.out.println("Ticket Searched: "+searched);
        }else{
            //otherwise print warning message
            System.out.println("Ticket "+searchedId+" not found.");
        }
        System.out.println();
        System.out.println("-------FINAL TICKET LIST-------");
        ticketList.printList();



    }
}
