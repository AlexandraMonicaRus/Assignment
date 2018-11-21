import java.util.Date;

public class Call {

    private String callerName;
    private long callerNumber;
    private Date timestamp;

    public Call(String callerName, long callerNumber, Date timestamp) {
        this.callerName = callerName;
        this.callerNumber = callerNumber;
        this.timestamp = timestamp;
    }

    public String getCallerName() {
        return callerName;
    }

    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public long getCallerNumber() {
        return callerNumber;
    }

    public void setCallerNumber(long callerNumber) {
        this.callerNumber = callerNumber;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
