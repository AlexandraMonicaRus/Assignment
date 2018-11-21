import java.sql.Timestamp;
import java.util.List;

public class PhoneController {

    public static void main(String[] args) {

        // add 2 contacts for Samsung S8 model
        Phone phone = new SamsungS8(992392354);

        Contact contact1 = new Contact(1, 751234562, "Adrian", "Bogdan");
        Contact contact2 = new Contact(2,752234562, "Alexandra", "Gigel");
        ((SamsungS8) phone).createContact(contact1);
        ((SamsungS8) phone).createContact(contact2);

        List<Contact> contacts = ((SamsungS8) phone).listContacts();
        for (Contact contact : contacts) {
            System.out.println("Contact: " + contact.getFirstName() + " " + contact.getLastName() + " " + contact.getPhoneNumber());
        }

        // send message to the first contact from the contact list
        long firstContactPhoneNumber = contacts.get(0).getPhoneNumber();
        Message message = new Message(firstContactPhoneNumber, "Hello!" );
        phone.sendMessages(message);

        List<String> messages = ((SamsungS8) phone).listMessagesForContact(firstContactPhoneNumber);
        for (String messageText : messages) {
            System.out.println("Message for contact number: " + firstContactPhoneNumber + " is: " + messageText);
        }

        // call the second contact from the contact list
        Contact secondContact = contacts.get(1);
        long secondContactNumber = secondContact.getPhoneNumber();
        String secondContactName = secondContact.getFirstName() + secondContact.getLastName();
        Call call = new Call(secondContactName, secondContactNumber, new Timestamp(System.currentTimeMillis()));
        phone.makeCall(call);

        List<Call> callHistoryList = ((SamsungS8) phone).viewCallHistory();
        for (Call callHistory : callHistoryList) {
            System.out.println(callHistory.getCallerName() + " " + callHistory.getCallerNumber() + " " + callHistory.getTimestamp());
        }
    }
}
