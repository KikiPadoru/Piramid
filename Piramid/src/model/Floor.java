package model;

public class Floor implements PiramidInt {
    public Floor(){}
    @Override
    public int size(){
        return 0;
    }

    @Override
    public String design() {
        return"";
    }

    @Override
    public String proper() {
        return "\u001B[32mYes\u001B[0m";
    }

}
