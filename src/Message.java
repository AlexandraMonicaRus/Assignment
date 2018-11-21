public class Message {
    private long number;
    private String text;

    public Message(long number, String text) {
        this.number = number;
        this.text = text;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
