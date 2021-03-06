package dev.study.seansgame.entities.statics;

import java.awt.Graphics;

import dev.study.seansgame.Handler;
import dev.study.seansgame.gfx.Assets;
import dev.study.seansgame.tiles.Tile;


public class Rock1 extends StaticEntity {
	public Rock1(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		
		bounds.x = 15;
		bounds.y = 12;
		bounds.width = 32;
		bounds.height = 20;
	}


	@Override
	public void tick() {

		
	}
	
	@Override
	public void die() {
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.rock1, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

}
