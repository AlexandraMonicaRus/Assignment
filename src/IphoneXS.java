import java.util.ArrayList;

public class IphoneXS extends Iphone {

    public final double BATTERY_LIFE = 62;
    private long imei;
    private double remainingBatteryLife = BATTERY_LIFE;

    public IphoneXS(long imei) {
        this.imei = imei;
        contacts = new ArrayList<>();
        messages = new ArrayList<>();
        calls = new ArrayList<>();
    }

    @Override
    public void sendMessages(Message message) {
        if (message.getText().length() <= 500) {
            // We first saved the message that we are going to send
            messages.add(message);

            // Here will be the part where we call the service that sends a message

            // After sending the message the battery will be reduced by 1h
            remainingBatteryLife = remainingBatteryLife - 1;
        } else {
            System.out.println("Your message exceeds the maximum characters allowed!");
        }
    }

    @Override
    public void makeCall(Call call) {
        //We first saved the call that is made before making the actual call
        calls.add(call);

        // Call the actual service that generates the call

        // After making a call the battery will be reduced by 2h
        remainingBatteryLife = remainingBatteryLife - 2;
    }
}
