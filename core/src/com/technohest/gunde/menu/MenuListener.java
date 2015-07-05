package com.technohest.gunde.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.technohest.gunde.GundeMain;

/**
 * Created by oskar on 2015-07-05.
 */
public class MenuListener extends InputListener {
    private String action;
    public MenuListener(String action){
        this.action = action;
    }
    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
        return true;
    }

    @Override
    public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
        if(action.equals("EXIT")){
            Gdx.app.exit();
        }else if(action.equals("PLAY")){
            GundeMain.getInstance().setPlayState();
        }
    }
}
