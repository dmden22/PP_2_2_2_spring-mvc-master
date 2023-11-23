package web.model;

public class Car {

    private String model;
    private String series;
    private String vin;

    public Car() {
    }

    public Car(String model, String series, String vin) {
        this.model = model;
        this.series = series;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return  "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", vin='" + vin + '\'';
    }
}
