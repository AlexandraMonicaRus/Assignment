import java.util.ArrayList;
import java.util.List;

public abstract class Iphone implements Phone{

    private String color;
    private String material;
    protected List<Contact> contacts;
    protected List<Message> messages;
    protected List<Call> calls;

    public void createContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> listContacts() {
        return contacts;
    }

    public List<String> listMessagesForContact(int phoneNumber) {
        List<String> textMessages = new ArrayList<>();
        for (Message message : messages) {
            if (phoneNumber == message.getNumber()) {
                textMessages.add(message.getText());
            }
        }

        return textMessages;
    }

    public List<Call> viewCallHistory() {
        return calls;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
