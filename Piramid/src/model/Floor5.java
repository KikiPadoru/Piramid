package model;

public class Floor5 extends PiramidEnt {
    public Floor5(PiramidInt floor) {
        super(floor);
    }
    @Override
    public int size() {
        return 5;
    }

    @Override
    public String design() {
        return floor.design()+"##########\n";
    }
    @Override
    public String proper() {
        if(this.size()>floor.size()){return floor.proper();}
        else return "\u001B[31mNo\u001B[0m";
    }
}
