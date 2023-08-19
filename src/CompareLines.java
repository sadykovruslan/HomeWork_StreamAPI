import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilterOutputStream;
import java.sql.Array;
import java.util.stream.Stream;

public class CompareLines {
    public static void main(String[] args) {



        try {
            new BufferedReader(new FileReader("input.txt")).lines()
                    .map(s -> {
                        String onlyNumbers = s.replaceAll("[^0-9]", "");
                        double x1 = Double.parseDouble(String.valueOf(onlyNumbers.charAt(0)));
                        double y1 = Double.parseDouble(String.valueOf(onlyNumbers.charAt(1)));
                        double x2 = Double.parseDouble(String.valueOf(onlyNumbers.charAt(2)));
                        double y2 = Double.parseDouble(String.valueOf(onlyNumbers.charAt(3)));


                        return Math.abs(Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
                    })
                    .max(Double::compare);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

