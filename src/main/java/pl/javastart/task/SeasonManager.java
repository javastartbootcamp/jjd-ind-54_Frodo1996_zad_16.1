package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonManager {

    public void run(Scanner scanner) {
        Season[] values = Season.values();
        printOptions(values);
        findSeasonForUserAndPrintInfo(scanner, values);
    }

    private static void findSeasonForUserAndPrintInfo(Scanner scanner, Season[] values) {
        String userInput = scanner.nextLine();
        for (Season value : values) {
            if (value.getPlName().equalsIgnoreCase(userInput)) {
                String[] months = value.getMonths();
                System.out.println("W tej porze roku są następujące miesiące:\n" + Arrays.toString(months));
            }
        }
    }

    private static void printOptions(Season[] values) {
        System.out.println("Podaj porę roku:");
        for (Season value : values) {
            System.out.println(value.getPlName());
        }
    }
}