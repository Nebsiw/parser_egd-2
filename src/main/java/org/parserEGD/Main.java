package org.parserEGD;

import org.parserEGD.model.Root;

public class Main {
    public static void main(String[] args) {
        egdstaff parser = new egdstaff();
        //GsonParser parser = new GsonParser();

        Root root = parser.parse();

        System.out.println( root.toString());


    }
}