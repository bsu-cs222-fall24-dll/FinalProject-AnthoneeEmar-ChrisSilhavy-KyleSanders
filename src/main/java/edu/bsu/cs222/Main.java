package edu.bsu.cs222;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            ArtistByGenre artistByGenre = new ArtistByGenre();

            Scanner scanner = new Scanner(System.in);
            System.out.println("hip-hop | indie-pop | rock | sad | work-out");
            System.out.println("Enter a genre: ");
            String genre = scanner.nextLine();

            artistByGenre.getArtistByGenre(genre.toLowerCase());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}