package com.game.main;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject{

    public Player(int x, int y, ID id) {
        super(x,y,id);
    }

    public void tick(){
        x+=velX;
        y+=velY;


        if (x >= Game.WIDTH - 42)
            x = Game.WIDTH - 42;
        if (x < Game.WIDTH - Game.WIDTH)
            x = Game.WIDTH - Game.WIDTH;
        if (y >= Game.HEIGHT - 66)
            y = Game.HEIGHT - 66;
        if (y < Game.HEIGHT - Game.HEIGHT)
            y = Game.HEIGHT - Game.HEIGHT;
    }

    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x,y,32,32);
    }


}
