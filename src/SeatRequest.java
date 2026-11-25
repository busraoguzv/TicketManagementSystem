public class SeatRequest {
    //instance variables
    private int customerId;
    private String movieName;
    private long requestTime;

    //a parametriezed constructor
    //that accepts customerId,movieName and requestTime as parameters
    public SeatRequest(int customerId,String movieName,long requestTime){
        this.customerId=customerId;
        this.movieName=movieName;
        this.requestTime=requestTime;
    }

    //getter methods
    public int getCustomerId(){
        return customerId;
    }
    public String getMovieName(){
        return movieName;
    }
    public long getRequestTime(){
        return requestTime;
    }
    //setter methods
    public void setCustomerId(int customerId){
        this.customerId=customerId;
    }
    public void setMovieName(String movieName){
        this.movieName=movieName;
    }
    public void setRequestTime(long requestTime){
        this.requestTime=requestTime;
    }
    //toString method for printing the customer's request
    public String toString(){
        long hour=requestTime/100;
        long min=requestTime%100;
        return String.format("\n{Customer Id: %5d | Movie Name: %-21s | Request Time: %02d:%02d}",customerId,movieName,hour,min);

    }
}
