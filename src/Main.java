public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
                createObject("AS8"),
                createObject("Superfast"),
                createObject("Huracan")};

        for (Printable printable : printables) {
            printable.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "AS8":
                Audi AS8= new Audi("Audi ", "Red",2020,2.2,"зимние");
                return AS8;
            case "Superfast":
                Ferrari Superfast= new Ferrari("Ferrari", "Gray", 2022 ,202,"Superfast");
                return Superfast;
            case "Huracan":
                lamborghini Huracan = new lamborghini("lamborghini", "red", 210,"white","Blye");
                return Huracan;
        }
        return null;
    }

}