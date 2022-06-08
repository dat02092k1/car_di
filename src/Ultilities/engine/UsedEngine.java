package Ultilities.engine;

import Interface.IEngine;

public class UsedEngine implements IEngine {
    public String ue = "Used Engine";
    @Override
    public void engine() {
        System.out.println("Engine: " + ue);
    }
}
