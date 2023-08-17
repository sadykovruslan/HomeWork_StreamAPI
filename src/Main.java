import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader bf = new BufferedReader(new FileReader("input.txt"));

           Stream<String> lines = bf.lines();
           lines
                   .map(s -> {
                       String digits = s.replaceAll("[^0-9]", "");
                       double x1 = Double.parseDouble(String.valueOf(digits.charAt(0)));
                       double y1 = Double.parseDouble(String.valueOf(digits.charAt(1)));
                       double x2 = Double.parseDouble(String.valueOf(digits.charAt(2)));
                       double y2 = Double.parseDouble(String.valueOf(digits.charAt(3)));
                       return Math.sqrt(Math.abs(Math.pow((x2 - x1), 2) - Math.pow((y2 - y1), 2)));
                   });
    }}





