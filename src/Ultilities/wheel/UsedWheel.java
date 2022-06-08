package Ultilities.wheel;

import Interface.IWheel;

public class UsedWheel implements IWheel {
    public String uw = "Used Wheel";

    @Override
    public void wheel() {
        System.out.println("Wheel: " + uw);
    }
}
