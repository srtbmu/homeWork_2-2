public class Audi extends Car implements Printable{          //BWM
    private double weight;
    private String color;

    public double getWeight() {
        return weight;
    }

    @Override
    public String getColor() {
        return color;
    }

    public Audi(String model, String color, int year, double weight, String color1) {
        super(model, color, year);
        this.weight = weight;
        this.color = color1;
    }

    public Audi(String model, String color, int year) {
        super(model, color, year);
    }

    @Override
    public void print() {
        System.out.println(getInfo()+"\nVolume: " + getWeight() +
            "\nTires: " +getColor() );}
}
