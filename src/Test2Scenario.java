public class Test2Scenario {
    public static void main(String[] args) {
        //create a new queue
        SeatQueue seatQueue = new SeatQueue();
        //create new requests
        SeatRequest request1 = new SeatRequest(1120, "Melis Çakır", 2030L);
        SeatRequest request2 = new SeatRequest(1121, "Esra Erez", 1100L);
        SeatRequest request3 = new SeatRequest(1122, "Şefika Selin Taşdemir", 1800L);
        SeatRequest request4 = new SeatRequest(1123, "Büşra Oğuz", 2330L);
        SeatRequest request5 = new SeatRequest(1124, "Gökçesu Cirtil", 1400L);
        SeatRequest request6 = new SeatRequest(1125, "Kaan Oğuz", 1000L);
        SeatRequest request7 = new SeatRequest(1126, "Nefin Coşkun", 1930L);
        SeatRequest request8 = new SeatRequest(1127, "Theo James", 1730L);

        //add requests in queue
        seatQueue.enqueue(request1);
        seatQueue.enqueue(request2);
        seatQueue.enqueue(request3);
        seatQueue.enqueue(request4);
        seatQueue.enqueue(request5);
        seatQueue.enqueue(request6);
        seatQueue.enqueue(request7);
        seatQueue.enqueue(request8);
        //display the initial queue
        System.out.println("\n----Queue----");
        seatQueue.printQueue();

        //remove 3 requests in queue
        seatQueue.dequeue();
        seatQueue.dequeue();
        seatQueue.dequeue();
        //display the remaning queue
        System.out.println("\n----Final Queue----");
        seatQueue.printQueue();
    }
}

