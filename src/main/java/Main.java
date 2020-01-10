import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        final String path = "pupils.csv";

        try {
            Files.readAllLines(Paths.get(path)).stream()
                    .skip(1)
                    .map(line -> line.split(";"))
                    .map(elements -> new Pupil(Integer.parseInt(elements[0]), elements[1], elements[2], elements[3], Integer.parseInt(elements[4]), elements[5]))
                    .filter(pupil -> pupil.getPostcode() % 2 == 0)
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();

        try {
            Files.readAllLines(Paths.get(path)).stream()
                    .skip(1)
                    .map(line -> line.split(";"))
                    .map(elements -> new Pupil(Integer.parseInt(elements[0]), elements[1], elements[2], elements[3], Integer.parseInt(elements[4]), elements[5]))
                    .filter(pupil -> pupil.getCity().equals("Linz"))
                    .sorted(Comparator.comparing(Pupil::getDateOfBirth))
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();

        try {
            System.out.println(
                Files.readAllLines(Paths.get(path)).stream()
                    .skip(1)
                    .map(line -> line.split(";"))
                    .map(elements -> new Pupil(Integer.parseInt(elements[0]), elements[1], elements[2], elements[3], Integer.parseInt(elements[4]), elements[5]))
                    .filter(pupil -> pupil.getCity().equals("Leonding"))
                    .count() + " SchülerInnen leben in Leonding.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}