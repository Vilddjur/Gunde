package com.technohest.gunde.overworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL30;

/**
 * Created by oskar on 2015-07-05.
 */
public class GameView implements Screen{
    private final GameController controller;
    private final GameModel         model;
    public GameView(GameController gameController, GameModel model) {
        this.controller = gameController;
        this.model = model;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        float r = 9 / 255.0f;
        float g = 205 / 255.0f;
        float b = 218 / 255.0f;
        Gdx.gl.glClearColor(r, g, b, 1);
        Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
