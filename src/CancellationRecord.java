public class CancellationRecord {
    private int ticketId;
    private String customerName;
    private long cancellationTime;
    public CancellationRecord(int ticketId,String customerName,long cancellationTime) {
        this.ticketId=ticketId;
        this.customerName=customerName;
        this.cancellationTime=cancellationTime;
    }
    public int getTicketId() {
        return ticketId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public long getCancellationTime() {
        return cancellationTime;
    }
    public void setTicketId(int ticketId){
        this.ticketId=ticketId;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setCancellationTime(long cancellationTime){
        this.cancellationTime=cancellationTime;
    }
    @Override
    public String toString() {
        long hour=cancellationTime/100;
        long minute=cancellationTime%100;
        return String.format("\n{Cancellation Id: %d | Customer Name: %s | Cancellation Time: %02d:%02d",cancellationTime,customerName,hour,minute);
    }
}
