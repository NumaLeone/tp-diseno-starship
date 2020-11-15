package edu.austral.dissis.starship.base.GameObjects;

import edu.austral.dissis.starship.base.collision.Collisionable;
import edu.austral.dissis.starship.base.vector.Vector2;

import java.awt.*;

public abstract class gameObject implements Collisionable{
    private Vector2 position;
    private Vector2 direction;
    private Shape shape;

    public gameObject(Shape shape, Vector2 position, Vector2 direction){
        this.shape  =shape;
        this.position = position;
        this.direction = direction;
    }

    @Override
    public void collisionedWith(Collisionable collisionable) {

    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public void setDirection(Vector2 direction) {
        this.direction = direction;
    }

    public Vector2 getPosition() {
        return position;
    }

    public Vector2 getDirection() {
        return direction;
    }

    @Override
    public Shape getShape() {
        return shape;
    }
    private void setShape(Shape shape){
        this.shape = shape;
    }

}
