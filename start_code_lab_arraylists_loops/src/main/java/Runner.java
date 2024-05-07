import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
        scottishIslands.add("Coil");

        scottishIslands.add(0, "Tiree");
        scottishIslands.add(2, "Islay");

        System.out.println("Index of Skye: " + scottishIslands.indexOf("Skye"));

        scottishIslands.remove("Tresco");
        scottishIslands.remove(scottishIslands.indexOf("Arran"));   // Sorry I know its lazy...

        System.out.println("Number of islands: " + scottishIslands.size());

        Collections.sort(scottishIslands);

        for(String island : scottishIslands) {
            System.out.println(island);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

        int lrgVal = 0;

        for(int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }

            if(num > lrgVal) {
                lrgVal = num;
            }
        }

        System.out.println("Difference of Large and small: " + (lrgVal - 1));

        int sum = 0;
        int sumUnlucky = 0;

        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) == 1 && numbers.get(i + 1) == 1) {
                System.out.println("True");
            }

            sum += numbers.get(i);
        }

        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) == 13) {
                break;
            }
            sumUnlucky += numbers.get(i);
        }

        System.out.println("Sum: " + sum);
        System.out.println("Sum without 13 and the numbers after: " + sumUnlucky);

    }

}
