/*
Christmas Tree Program
Student Name:     Patrick Love
Date:             2-18-19
 */

import java.util.Scanner;
public class ChristmasTree {
    public static void main(String[] args) {
        int height;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your height of the tree: ");
        height= input.nextInt();
        for (int row = 0; row < height; row++) {
            for (int spaces = 0; spaces < height - row; spaces++)
                System.out.print(" ");
            for (int stars = 0; stars < (2 * row + 1); stars++)
                System.out.print("*");
            System.out.println();
        }
    }
}