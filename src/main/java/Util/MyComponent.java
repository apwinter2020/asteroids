package main.java.Util;

import main.java.Intefaces.Drawable;
import main.java.Intefaces.Movable;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public  class MyComponent implements Drawable, Movable {

    private Vector2D position;
    private int size, speed;


    private String componentName;

    private BufferedImage image;

    public MyComponent(Vector2D position, int size, int speed, String componentName) {
        this(position, componentName);

        this.size = size;
        this.speed = speed;
    }

    public MyComponent(Vector2D position, String componentName) {
        this.componentName = componentName;
        this.position = position;

        this.init();
    }

    private void init() {
        this.image = ImageLoader.getInstance().loadImage("image\\" + this.componentName + ".png");
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(this.image, this.position.getX(), this.position.getY(), this.getSize(), this.getSize(), null);
    }


    public Vector2D getPosition() {
        return position;
    }

    protected void setPosition(Vector2D position) {
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public Rectangle2D getBox() {
            return new Rectangle2D.Float(position.getX(), position.getY(), size, size);
    }

    @Override
    public void move() {

    }
}


