public class lamborghini extends Car implements Printable{
    @Override
    public void print() {
        System.out.println(getInfo() + "interior Color" + getInteriorColor() + " coubtry :" + getCountry());
    }

    //TOYOTA
    private String interiorColor;
    private String country;

    public lamborghini(String model, String color, int year, String interiorColor, String country) {
        super(model, color, year);
        this.interiorColor = interiorColor;
        this.country = country;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public String getCountry() {
        return country;
    }

    public lamborghini(String model, String color, int year) {
        super(model, color, year);
    }
}
