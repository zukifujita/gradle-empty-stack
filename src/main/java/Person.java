public class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String makeCall(Mobile mobile, String message) {
        return mobile.call(message);
    }
}