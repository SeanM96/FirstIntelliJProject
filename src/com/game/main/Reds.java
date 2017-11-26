package com.game.main;

import java.awt.*;

public class Reds extends GameObject {

    public Reds(int x, int y, ID id) {

        super(x,y,id);

        velX = 1;
    }

    public void tick(){
    }
    public void render(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(x,y,25,25);
    }
}