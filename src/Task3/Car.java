/**
 * Написать  класс  «автомобиль»,  который  должен  уметь  заводится,  глушить  мотор,  ехать  и  держать  необходимую  скорость.
 */
package Task3;

public class Car {

    private double velocity;
    private boolean workingEngine;

    void startEngine (boolean start){
        workingEngine = true;
    }

    void stopEngine (boolean stop){
        workingEngine = false;
    }

    void move (double speed){
        velocity += speed;
    }
}
