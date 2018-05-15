/**
 * Написать класс Circle (круг) по аналогии с Rectangle и метод, который будет возвращать его площадь.
 */
package Task1;

public class Circle {

    private int diam;

    public Circle(){
        diam = 5;
    }

    public Circle (int diam){
        this.diam = diam;
    }

    public int getDiam(){
        return diam;
    }

    public void setDiam (int diam){
        this.diam = diam;
    }

    public double square() {
        double result = Math.PI * ((diam / 2) * (diam / 2));
        return result;
    }

}
