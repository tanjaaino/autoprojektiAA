package hh.sof03.vko3autoprojekti.domain;

public class Car {

    // attribuutit
    private String model;
    private Integer year;
    // kontruktorit
    public Car(String model, Integer year) {
        this.model = model;
        this.year = year;
    }

    public Car() {
        this.model = null;
        this.year = null;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "model=" + model + ", year=" + year;
    }

    // getterit
    
    // setterit
    // toString


}
