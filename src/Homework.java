public class Homework {
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 3};
        System.out.println("if arr1 equal err2" + areEqual(arr1,arr2));
        System.out.println("if arr1 egual err3" + areEqual(arr1,arr3));
    }

    public static boolean areEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;

        }

        return true;
    }
}
