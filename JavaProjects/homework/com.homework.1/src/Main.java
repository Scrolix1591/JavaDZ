import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    //<editor-fold desc="task1">
    public static void task1() {
        String text = "\"Your time is limited, so don’t waste it living someone else’s life\" Steve Jobs";
        System.out.print("№1\n");
        System.out.print(text.toCharArray()[0]);
        for (int i = 1; i < text.length(); i++) {
            System.out.print(text.toCharArray()[i]);
            if (i%21 <= 0) {
                if (text.charAt(i) != ' ') {
                    int k = i+1;
                    for (; text.charAt(k) != ' '; k++) {
                        System.out.print(text.toCharArray()[k]);
                    }
                    i = k;
                }
                System.out.print("\n\n");
                for(int j = 0; j < i/10; j++) {
                    System.out.print("\t");
                }
            }
        }
    }
    //</editor-fold>
    //<editor-fold desc="task2">
    public static void task2() {
        System.out.print(scanner.nextInt()*scanner.nextInt()/100);
    }
    //</editor-fold>
    //<editor-fold desc="task3">
    public static void task3() {
        String temp;
        int[] nums = new int[3];

        temp = scanner.nextLine();

        for (int i = 0, j = 0; i < temp.length(); i++) {
            if (Character.isDigit(temp.charAt(i)) && j < 3) {
                nums[j] = temp.charAt(i) - '0';
                j++;
            }
        }

        temp = "";
        for (int i = 0; i < 3; i++) {
            temp += nums[i];
        }
        System.out.print(Integer.parseInt(temp));
    }
    //</editor-fold>
    //<editor-fold desc="task4">
    public static void task4() {
        String temp;
        int[] nums = new int[6];

        temp = scanner.nextLine();

        for (int i = 0, j = 0; i < temp.length(); i++) {
            if (Character.isDigit(temp.charAt(i)) && j < 6) {
                nums[j] = temp.charAt(i) - '0';
                j++;
            }
        }

        temp = "";
        for (int i = 0; i < 2; i++) {
            temp += nums[5-i];
        }
        for (int i = 2; i < 4; i++) {
            temp += nums[i];
        }
        for (int i = 4; i < 6; i++) {
            temp += nums[i-4];
        }
        System.out.print(Integer.parseInt(temp));
    }
    //</editor-fold>
    //<editor-fold desc="task5">
    public static void task5() {
        int temp = scanner.nextInt();
        if (temp >= 1 && temp <= 12) {
            if (temp == 12 || temp <= 2) {
                System.out.print("Winter");
                return;
            }
            if (temp >= 3 && temp <= 5) {
                System.out.print("Spring");
                return;
            }
            if (temp >= 6 && temp <= 8) {
                System.out.print("Summer");
                return;
            }
            if (temp >= 9 && temp <= 11) {
                System.out.print("Autumn");
                return;
            }
        }
        else {
            System.out.print("Error");
        }
    }
    //</editor-fold>
    //<editor-fold desc="task6">
    public static void task6() {
        System.out.print("Meters into...\n1. Miles, \n2. Inches, \n3. Yards\n\n");
        switch (scanner.nextInt()) {
            case 1:
                System.out.print(scanner.nextFloat()/1609+" Miles");
                break;

            case 2:
                System.out.print(scanner.nextFloat()*39.37+" Inches");
                break;

            case 3:
                System.out.print(scanner.nextFloat()*1.094+" Yards");
                break;
        }
    }
    //</editor-fold>
    //<editor-fold desc="task7">
    public static void task7() {
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    //</editor-fold>
    //<editor-fold desc="task8">
    public static void task8() {
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i*j + " ");
            }
            System.out.print("\n");
        }
    }
    //</editor-fold>
    //<editor-fold desc="task9">
    public static void task9() {
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(21) - 10;
        }

        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;
        for (int num : nums) {
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("-: " + negativeCount);
        System.out.println("+: " + positiveCount);
        System.out.println("0: " + zeroCount);
    }
    //</editor-fold>
    //<editor-fold desc="task10">
    public static void task10() {
        int[] nums = new int[10];

        int[] evenNums = new int[nums.length];
        int[] oddNums = new int[nums.length];
        int[] negativeNums = new int[nums.length];
        int[] positiveNums = new int[nums.length];

        int evenCount = 0;
        int oddCount = 0;
        int negativeCount = 0;
        int positiveCount = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(21) - 10;
        }

        for (int num : nums) {
            if (num % 2 == 0) {
                evenNums[evenCount++] = num;
            } else {
                oddNums[oddCount++] = num;
            }
            if (num < 0) {
                negativeNums[negativeCount++] = num;
            } else if (num > 0) {
                positiveNums[positiveCount++] = num;
            }
        }

        System.out.println("Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("\nEven:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNums[i] + " ");
        }
        System.out.println();

        System.out.println("\nOdd:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNums[i] + " ");
        }
        System.out.println();

        System.out.println("\nNegative:");
        for (int i = 0; i < negativeCount; i++) {
            System.out.print(negativeNums[i] + " ");
        }
        System.out.println();

        System.out.println("\nPositive:");
        for (int i = 0; i < positiveCount; i++) {
            System.out.print(positiveNums[i] + " ");
        }
        System.out.println();
    }
    //</editor-fold>
    //<editor-fold desc="task11">
    public static void task11(int length, boolean isVertical, char symbol) {
        for (int i = 0; i < length; i++) {
            if (isVertical) {
                System.out.println(symbol);
            } else {
                System.out.print(symbol);
            }
        }
    }
    //</editor-fold>
    //<editor-fold desc="task12">
    public static void task12() {
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(21) - 10;
        }

        System.out.println("Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Sort by...\n1. Max, \n2. Min\n\n");
        switch (scanner.nextInt()) {
            case 1:
                Arrays.sort(nums);
                for (int i = 0; i < nums.length / 2; i++) {
                    int temp = nums[i];
                    nums[i] = nums[nums.length - i - 1];
                    nums[nums.length - i - 1] = temp;
                }
                break;

            case 2:
                Arrays.sort(nums);
                break;
        }

        System.out.println("New Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    //</editor-fold>
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
        //task10();
        //task11(5, true, '*');
        //task12();
        scanner.close();
    }
}