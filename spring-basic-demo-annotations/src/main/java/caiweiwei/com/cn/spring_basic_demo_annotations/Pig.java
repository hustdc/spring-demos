package caiweiwei.com.cn.spring_basic_demo_annotations;

import org.springframework.stereotype.Component;

@Component
public class Pig {
	private Double weight;
    private String color;
    public Pig(){
        this.weight = 1000.0;
        this.color = "white";
    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return  weight + " kg " + color + " pig!";
    }
}
