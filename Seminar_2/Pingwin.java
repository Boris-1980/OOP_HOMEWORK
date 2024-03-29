package Seminar_2;

public class Pingwin extends Animal implements Swimable, Runable {

    public Pingwin(String name, int box) {
        super(name, box);
    }

    @Override
    public int speedofRun() {
        return 5;
    }

    @Override
    public String voice() {
        return "Издает звук: Кря, но по пингвиньи)";
    }

    @Override
    public int speedofSwim() {
        return 23;
    }
    
}
