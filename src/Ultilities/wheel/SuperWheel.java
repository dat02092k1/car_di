package Ultilities.wheel;

import Interface.IWheel;

public class SuperWheel implements IWheel {
    public String sw = "Super Wheel";

    @Override
    public void wheel() {
        System.out.println("Wheel: " + sw);
    }
}
