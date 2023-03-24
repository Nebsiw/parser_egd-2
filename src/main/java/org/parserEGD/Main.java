package org.parserEGD;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        egdstaff parser = new egdstaff();


        //Root root = parser.parse();

        //System.out.println(root.toString());
        try (FileWriter writer = new FileWriter("staff.csv", false)) {

            writer.write(String.valueOf(parser.parse()));
            writer.flush();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }


    }
}