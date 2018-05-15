/**
 * Написать  класс,  который  умеет  считать  количество  созданных  объектов  этого  класса  (static).
 */
package Task2;

public class Main {
    static int counter;

    public Main(){
        counter ++;
    }

    public static void main(String[] args){

        Main first = new Main();
        Main second = new Main();
        Main third = new Main();

        System.out.println(counter);
    }

}
