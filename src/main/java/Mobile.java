public abstract class Mobile {
    private String name;
    private String color;
    private String brand;

    Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String call(String message) {
        return "Message : " + message;
    }

    public String mobileInfo() {
       return "name: " + name + ", color: " + color + ", brand: " + brand;
    }
}
