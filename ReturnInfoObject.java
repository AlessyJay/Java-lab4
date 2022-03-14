class Main {
    public static void main(String[] args) {

    }
}

class Car {
    private String Brand, Model, Colour;
    private int Year;
    private int Quantity;
    private double Price;

    public Car(String carBrand, String carModel, String carColour,
            int carYear, int carQuantity, double carPrice) {
        carBrand = Brand;
        carModel = Model;
        carColour = Colour;
        carYear = Year;
        carQuantity = Quantity;
        carPrice = Price;
    }

    public void Delivery(int count) {
        Quantity += count;
    }

    public void Sell(int count) {
        Quantity -= count;
    }

    public String getBrand() {
        return this.Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return this.Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getColour() {
        return this.Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public int getYear() {
        return this.Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getQuantity() {
        return this.Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public double getPrice() {
        return this.Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

}