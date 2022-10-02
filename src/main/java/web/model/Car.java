package web.model;

public class Car {
    private String model;
    private int series;
    private long price;

    public Car(String model, int series, long price) {
        this.model = model;
        this.series = series;
        this.price = price;
    }

    public Car() {}

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public long getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series + '\'' +
                ", price=" + price + '\'' +
                '}';
    }

}
