public class Ticket {
    //Declaring fields with appropriate access modifiers
    private int ticketId;
    private String customerName;
    private String movieName;
    private String seatNumber;
    private String showTime;

    //a parameterized constructor that accepts
    //ticketId, customerName, movieName, seatNumber and showTime as parameters
    public Ticket(int ticketId, String customerName, String movieName,String seatNumber,String showTime){
        this.ticketId = ticketId;
        this.customerName=customerName;
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.showTime=showTime;
    }

    //getter methods
    public int getTicketId(){
        return ticketId;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getMovieName(){
        return movieName;
    }
    public String getSeatNumber(){
        return seatNumber;
    }
    public String getShowTime() {
        return showTime;
    }

    //setter methods
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
    public void setCustomerName(String customerName) {
        this.customerName=customerName;
    }
    public void setMovieName(String movieName) {
        this.movieName=movieName;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber=seatNumber;
    }
    public void setShowTime(String showTime){
        this.showTime=showTime;
    }
}
