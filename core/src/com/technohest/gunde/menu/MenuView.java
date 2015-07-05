package com.technohest.gunde.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.*;


/**
 * @author oskar
 * Created by oskar on 2015-07-05.
 */
public class MenuView implements Screen {
    private final Stage stage;

    public MenuView(){
        BitmapFont font = new BitmapFont();
        TextureAtlas buttonAtlas = new TextureAtlas("assets/menuButtons.pack");
        Skin skin = new Skin();
        skin.addRegions(buttonAtlas);


        TextButtonStyle style = new TextButtonStyle();
        style.up = skin.getDrawable("menuButton");
        style.down = skin.getDrawable("pressedMenuButton");
        style.font = font;

        TextButton playButton = new TextButton("Play", style);
        TextButton exitButton = new TextButton("Exit", style);

        playButton.addListener(new MenuListener("PLAY"));
        exitButton.addListener(new MenuListener("EXIT"));


        Table table = new Table();
        table.add(playButton);
        table.row();
        table.add(exitButton);

        /**
         * Making sure the table is centered
         */
        float x = (Gdx.graphics.getWidth())/2.0f;
        float y = (Gdx.graphics.getHeight())/2.0f;
        table.setPosition(x, y);


        stage = new Stage();
        stage.addActor(table);
    }
    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        float r = 9 / 255.0f;
        float g = 205 / 255.0f;
        float b = 218 / 255.0f;
        Gdx.gl.glClearColor(r, g, b, 1);
        Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
        stage.draw();
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
        Gdx.input.setInputProcessor(null);
    }

    @Override
    public void dispose() {

    }
}
