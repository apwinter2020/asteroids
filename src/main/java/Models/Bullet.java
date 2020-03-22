package main.java.Models;

import main.java.Intefaces.Updatable;
import main.java.Util.MyComponent;
import main.java.Util.Vector2D;

public class Bullet extends MyComponent implements Updatable {

    public Bullet(Vector2D position) {
        this(position, "bullet");
    }

    public Bullet(Vector2D position, String componentName) {
        super(position, 50, 5, componentName);
    }


    @Override
    public void update() {
        this.move();
    }

    @Override
    public void move() {
        this.getPosition().setY(this.getPosition().getY() - this.getSpeed());

    }
}


