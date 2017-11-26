package com.game.main;

import java.awt.*;

public class Yellows extends GameObject {

    public Yellows(int x, int y, ID id) {

        super(x,y,id);

        velX = 1;
    }

    public void tick(){
    }
    public void render(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillOval(x,y,25,25);
    }
}