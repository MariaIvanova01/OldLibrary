package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameSearchedBook = scan.nextLine();
        int countChecedBooks = 0;
        String nameBook = scan.nextLine();

        while(!nameBook.equals("No More Books")){
            if (nameBook.equals(nameSearchedBook)){
                System.out.printf("You checked %d books and found it.", countChecedBooks);
                break;
            }
            countChecedBooks ++;
            nameBook = scan.nextLine();
        }
        if (nameBook.equals("No More Books")){
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countChecedBooks);
        }
    }
}
