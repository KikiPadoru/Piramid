package com.company;

import model.*;

public class Main {

    public static void main(String[] args) {
        PiramidInt piramid = new Floor1(new Floor2(new Floor4(new Floor3(new Floor5(new Floor())))));
        System.out.println(piramid.design()+piramid.proper());
        PiramidInt piramid1 = new Floor5(new Floor4(new Floor3(new Floor2(new Floor1(new Floor())))));
        System.out.println(piramid1.design()+piramid1.proper());
    }
}
