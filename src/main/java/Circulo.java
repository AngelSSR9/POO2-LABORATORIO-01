public class Circulo {
    private double radio = 5.0;
    private String color = "azul";

    public Circulo(){}

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public double getArea(){
        return radio*radio*Math.PI;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
