import java.util.Arrays;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 2, 4, 9};
        int target = 4;
        int result = Methods.linearSearch(array, target);
        System.out.println("Индекс элемента: " + result);
        int[] array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target2 = 5;
        int result2 = Arrays.binarySearch(array2, target2);
        System.out.println("Индекс элемента: " + result2);
        int[] array3 = new int[]{5, 3, 8, 4, 2};
        int[] bubbleSort = Methods.bubbleSort(array3);
        int[] var9 = bubbleSort;
        int var10 = bubbleSort.length;

        int result5;
        for(int var11 = 0; var11 < var10; ++var11) {
            result5 = var9[var11];
            System.out.print("" + result5 + " ");
        }

        String str = "radar";
        boolean result4 = Methods.isPalindrome(str);
        System.out.println();
        System.out.println(result4);
        int n = 5;
        result5 = Methods.factorial(n);
        System.out.println("Факториал " + n + " равен " + result5);
        int n2 = 7;
        int result6 = Methods.fibonacciRecursive(n2);
        System.out.println("Рекурсивный метод: " + result6);
        int n3 = 7;
        int result7 = Methods.fibonacciIterative(n3);
        System.out.println("Итеративный метод: " + result7);
        int[] array4 = new int[]{2, 3, 3, 5, 5, 7};
        int[] result8 = Methods.removeDuplicates(array4);
        System.out.println("Массив без дубликатов: " + Arrays.toString(result8));
    }
}
