public class Android extends Mobile {
    public static final Integer MaxLength = 50;

    Android(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public String call(String message) {
        if (message.length() > MaxLength) {
            return "<Android> Message cannot be sent";
        }
        return "<Android>Message : " + message;
    }
}