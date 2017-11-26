package com.game.main;

import java.awt.Color;
import java.awt.Graphics;

public class WhiteBall extends GameObject {

    public WhiteBall(int x, int y, ID id) {

        super(x,y,id);

        velX = 1;
    }

    public void tick(){
    }
    public void render(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval(x,y,20,20);
    }
}
