import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String path = "pupils.csv";

        try {

            List<Pupil> pupils = new ArrayList<>();

            Files.readAllLines(Paths.get(path)).stream()
                    .skip(1)
                    .peek(System.out::println)
                    .map(line -> line.split(";"))
                    .map(elements -> new Pupil(Integer.parseInt(elements[0]), elements[1], elements[2], elements[3], elements[4], elements[5]))
                    .peek(pupils::add)
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}