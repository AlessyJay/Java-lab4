class Car {
    private String Brand, Model, Colour;
    private int Year, Quantity;
    private double Price;

    public Car(String Brand, String Model, String Colour,
            int Year, int Quantity, double Price) {
        this.Brand = Brand;
        this.Model = Model;
        this.Colour = Colour;
        this.Year = Year;
        this.Quantity = Quantity;
        this.Price = Price;
    }

    public void Delivery(int count) {
        Quantity += count;
    }

    public void Sell(int count) {
        Quantity -= count;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return String.format("Car: " +
                "Brand: %s, " +
                "Model: %s, " +
                "Colour: %s, " +
                "Year: %s, " +
                "Quantity: %s, " +
                "Price: %s",
                Brand, Model, Colour,
                Year, Quantity, Price);
    }
}

class showCar {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Yaris", "Black", 2017, 10, 30_000);

        System.out.println(car.toString());
        car.Sell(7);
        System.out.println(car.getColour());
        car.setColour("White");
        System.out.println(car.toString());
    }
}