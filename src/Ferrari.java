public class Ferrari extends Car implements Printable{   //MERSEDES

    @Override
    public void print() {
        System.out.println(getInfo() + "seat :" + getSeat() + "model : "+ getModel());
    }

    private int seat;
    private String model;

    public Ferrari(String model, String color, int year, int seat, String model1) {
        super(model, color, year);
        this.seat = seat;
        this.model = model1;
    }

    public int getSeat() {
        return seat;
    }

    @Override
    public String getModel() {
        return model;
    }

    public Ferrari(String model, String color, int year) {
        super(model, color, year);
    }

    }

