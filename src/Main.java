import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 3};
//        //Task 1
//        System.out.println("Середня значення елементів масиву = "+ averageNumber(arr));
//
//        //Task 2
//        minAndMax(arr);
//
//        //Task 3
//        revertArr(arr);
//
//        //Task 4
//        checkIfNumIsPresent(arr, 2);

        //Task 7.1
        System.out.println(repeatEnd("Hello",3));

        //Task 7.2
        System.out.println(mixString("abc", "xyz"));

        //Task 7.3
        System.out.println(xyzMiddle("AxyzBBB"));

        //Task 7.4
        System.out.println(zipZap("zopzop"));

        //Task 7.5
        System.out.println(xyzThere("abc.xyz"));


    }

 public static String repeatEnd(String string, int number) {
        String string2 = string.substring(string.length()-number);
        return string2.repeat(number);
   }
    public static boolean xyzThere(String string) {
     int index = string.indexOf("x");
     boolean flag = true;
      if(index > 0 && string.charAt(index-1) == '.'){
         flag = false;
      }
      return flag;
    }

    public static boolean xyzMiddle(String string) {
        int length = string.length()-1;
       int index = string.indexOf('x');
        int index2 = string.indexOf('z');
        int rightchar = length - index2;
boolean flag = false;
        if (rightchar - index <= 1 && rightchar - index >=0  || index - rightchar <=1 && index-rightchar >=0) {
         flag = true;
        }

        return flag;
    }
    public static String mixString(String string1, String string2) {
        StringBuilder builder = new StringBuilder();
        int maxLength = Math.max(string1.length(), string2.length());
        for (int i = 0; i < maxLength; i++) {
            if (i < string1.length()) {
                builder.append(string1.charAt(i));
            }
            if (i < string2.length()) {
                builder.append(string2.charAt(i));
            }
        }
        return builder.toString();
    }
    public static StringBuilder zipZap(String string) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (i + 2 < string.length() && string.charAt(i) == 'z' && string.charAt(i + 2) == 'p') {
                builder.append("zp");
                i += 2;
            } else {
                builder.append(string.charAt(i));
            }
        }
        return builder;
    }

    public static int averageNumber(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        return sum / numbers.length;

    }
    public static void minAndMax(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int max = numbers[numbers.length - 1];
        int min = numbers[0];
        System.out.println("min = " + min + " max = " + max);
    }

    public static void revertArr(int[] numbers) {
        System.out.print("Масив в зворотньому порядку: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void checkIfNumIsPresent(int[] numbers, int find_number) {
        if (Arrays.binarySearch(numbers, find_number) >= 0) {
            System.out.println("\nЧисло " + find_number + " присутнє в масиві " + Arrays.toString(numbers));
        } else {
            System.out.println("\nЧисло " + find_number + " не присутнє в масиві " + Arrays.toString(numbers));
        }
    }

}