package web.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Component
public class Car {
    private String model;
    private int series;
    private int id;

    public Car() {}
    public Car(String model, int series, int id) {
        this.model = model;
        this.series = series;
        this.id = id;
    }

    public String getModel() {
        return model;
    }


    public int getSeries() {
        return series;
    }


    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && id == car.id && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, id);
    }
}