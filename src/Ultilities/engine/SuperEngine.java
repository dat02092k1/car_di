package Ultilities.engine;

import Interface.IEngine;

public class SuperEngine implements IEngine {
    public String se = "Super Engine";
    @Override
    public void engine() {
        System.out.println("Engine: " + se);
    }
}
