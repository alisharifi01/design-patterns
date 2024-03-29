package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    public void execute(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
