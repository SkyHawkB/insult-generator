package com.github.skyhawkb.insultgen.pc;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class InsultDictionary {
    private static ArrayList<String> insults = new ArrayList<>();
    private static Random gen = new Random();

    private static void init() {
        insults.clear();

        InputStream in = InsultDictionary.class.getResourceAsStream("./insults.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        try {
            String line;
            while((line = reader.readLine()) != null) {
                insults.add(line);
            }
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static String getInsult() {
        init();
        int randomIndex = gen.nextInt(insults.size());
        return insults.get(randomIndex);
    }
}
