package main.java.racingCar.controller;

import main.java.racingCar.view.InputViewer;

public class Game {
    public static void main(){
        System.out.println("--");
        InputViewer inputViewer=new InputViewer();
        int carNumber = inputViewer.carInputViewer();
        int gameNumber = inputViewer.tryInputViewer();

    }
}