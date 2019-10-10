public class IPhone extends Mobile {
    public static final Integer MaxLength = 50;

    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public String call(String message) {
        if (message.length() > MaxLength) {
            return "<iPhone> Message cannot be sent";
        }
        return "<iPhone>Message : " + message;
    }
}