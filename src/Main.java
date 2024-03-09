import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("task1");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOddNumbersFromList(nums);

        System.out.println("task2");
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums2);
        prinEvenFromList(nums2);

        System.out.println("task3");
        Set<String> set = new HashSet<>();
        set.add("Привет");
        set.add("нет");
        set.add("да");
        set.add("Привет");
        set.add("да");
        set.add("нет");

        System.out.println(set);


        System.out.println("task4");

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

        Map<String, Integer> repeats = new HashMap();

        for (int i = 0; i < strings.size(); i++) {
            if (repeats.get(strings.get(i)) != null) {
                repeats.replace(strings.get(i), repeats.get(strings.get(i)) + 1);
            } else {
                repeats.put(strings.get(i), 1);
            }
        }
        System.out.println(repeats);

    }

    private static void prinEvenFromList(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                System.out.println(nums.get(i));
            }
        }
    }

    private static void printOddNumbersFromList(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 1) {
                System.out.println(nums.get(i));
            }
        }
    }
}
