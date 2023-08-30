import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CompareLines {
    public static void main(String[] args) {
        try {
            Double maxLength = new BufferedReader(new FileReader("input.txt")).lines()
                    .map(s -> {
                        String onlyNumbers = s.replaceAll("[^0-9]", " ");
                        String[] onlyNumbersArray = onlyNumbers.split(" ");
                        List<Double> doubleNumbers = new ArrayList<>();
                        for (int i = 1; i < onlyNumbersArray.length; i++) {
                            doubleNumbers.add(Double.parseDouble(String.valueOf(onlyNumbersArray[i])));
                        }
                        double x1 = doubleNumbers.get(0);
                        double y1 = doubleNumbers.get(1);
                        double x2 = doubleNumbers.get(2);
                        double y2 = doubleNumbers.get(3);

                        return Math.abs(Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
                    })
                    .max(Double::compare).orElseThrow();
            System.out.println(maxLength);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

