package com.game.Controller;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.game.Model.GameScreen;

public class RPGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private GameScreen gameScreen;

	@Override
	public void create() {
		this.batch = new SpriteBatch();
		this.gameScreen = new GameScreen(batch);
		this.gameScreen.create();
	}

	@Override
	public void render() {
		gameScreen.render();
	}

	@Override
	public void dispose() {
		batch.dispose();
	}
}