package com.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class App {

    public static void main(String[] args) {

        // Demonstrate String immutability
        System.out.println("=== String Immutability ===");

        String original = "Hello";
        String modified = original.concat(" World");

        System.out.println("Original: " + original);
        System.out.println("Modified: " + modified);

        // Demonstrate file copying
        System.out.println("\n=== File Copying ===");

        File source = new File("source.txt");
        File destination = new File("dest.txt");

        try {
            if (!source.isFile()) {
                throw new IOException("source.txt not found");
            }

            Files.copy(
                source.toPath(),
                destination.toPath(),
                StandardCopyOption.REPLACE_EXISTING
            );

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.err.println("Copy failed: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}

