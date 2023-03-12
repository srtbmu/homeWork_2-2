public class Car implements Printable{
    private String model;
    private String color;
    private int year;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println(getInfo());
    }
public String getInfo(){
        return "\nmodel :"  + this.model+
                "\ncolor :" + this.color+
                "\nyear :"  + this.year;
}
}
