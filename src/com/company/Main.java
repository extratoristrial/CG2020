package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> faveMovies = new HashMap<>();

        Scanner keyboard = new Scanner(System.in);

        boolean keepGoing;
        do {
            System.out.println("Name a favorite movie: ");
            String movie = keyboard.nextLine();
            if (movie.length() < 1) {
                keepGoing = false;
            } else {
                keepGoing = true;
                System.out.println("What's the genre?");
                String genre = getGenre(keyboard);
                faveMovies.put(movie, genre);
            }
        } while (keepGoing);

        for (Map.Entry<String, String> mov : faveMovies.entrySet()) {
            System.out.println(mov.getKey() + " , " + mov.getValue());
        }
    }

    public static String getGenre(Scanner keyboard) {
        String[] genres = {"Action", "Romance", "Sports", "Comedy"};
        int index = 0;
        for (String genre : genres) {
            System.out.println(index + ": " + genre);
            index++;
        }
        int choice = keyboard.nextInt();
        keyboard.nextLine();

        String answer;
        switch (choice) {
            case 0:
                answer = genres[0];
                break;
            case 1:
                answer = genres[1];
                break;
            case 2:
                answer = genres[2];
                break;
            default:
                answer = genres[3];
        }
        return genres[choice];
    }
}


