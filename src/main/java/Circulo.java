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

}
