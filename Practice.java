package edu.kirkwood.cis171;

import java.util.Scanner;
import java.util.Random;

public class Practice {

    public static void main(String[] args){
        System.out.println("Working order!");

        if (3 == 3){
            System.out.println("Yes");
        }

        int x;

        for (x = 0; x < 3; x++){
            System.out.println("Seems to be working.");
        }

        while (x > 1){
            System.out.println("Or does it?");
            x--;
        }

        System.out.println("Heya, what's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println(name + ", what a pretty name!");
    }
}
