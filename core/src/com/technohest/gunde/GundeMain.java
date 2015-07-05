package com.technohest.gunde;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.technohest.gunde.menu.MenuView;
import com.technohest.gunde.overworld.GameController;
import com.technohest.gunde.overworld.GameModel;
import com.technohest.gunde.overworld.GameView;

public class GundeMain extends Game {
	Screen overworld;
	Screen battle;
	Screen menu;
	private static GundeMain instance = null;

	private GundeMain(){

	}
	public static GundeMain getInstance(){
		if(instance == null){
			instance = new GundeMain();
		}
		return instance;
	}
	@Override
	public void create() {
		GameModel model = new GameModel();
		menu = new MenuView();
		overworld = new GameView(new GameController(model), model);
		setScreen(menu);
	}

	public void setPlayState() {
		setScreen(overworld);
	}
}
