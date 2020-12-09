package model;

public abstract class PiramidEnt implements PiramidInt{
    PiramidInt floor;
    public PiramidEnt(PiramidInt floor) {
        this.floor=floor;
    }
}
