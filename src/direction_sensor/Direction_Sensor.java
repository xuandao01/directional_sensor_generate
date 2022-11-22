
package direction_sensor;

import java.awt.Graphics;
import java.util.ArrayList;

public class Direction_Sensor {
    private SColor color;
    private Point center;
    private int diameter1;
    private int diameter2;
    private int direction;
    private int radius;
    public static ArrayList<Direction_Sensor> listSensor = new ArrayList<>();

    
    public void drawSensor(Graphics g){
        g.fillArc(center.getX(), center.getY(), diameter1, diameter2, direction, radius);
        g.drawArc(center.getX(), center.getY(), diameter1, diameter2, direction, 360);
    }   

    public Direction_Sensor() {
    }

    public Direction_Sensor(SColor color, Point center, int diameter1, int diameter2, int direction, int radius) {
        this.color = color;
        this.center = center;
        this.diameter1 = diameter1;
        this.diameter2 = diameter2;
        this.direction = direction;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getDiameter1() {
        return diameter1;
    }

    public void setDiameter1(int diameter1) {
        this.diameter1 = diameter1;
    }

    public int getDiameter2() {
        return diameter2;
    }

    public void setDiameter2(int diameter2) {
        this.diameter2 = diameter2;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public SColor getColor() {
        return color;
    }

    public void setColor(SColor color) {
        this.color = color;
    }
    
    
}
