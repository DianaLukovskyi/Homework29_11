public class Homework2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 8, 7};
        int count = countNum(array);
        System.out.println("quantity ever count: " + count);

    }

    public static int countNum(int[] arra) {
        int count = 0;
        for (int num : arra) {
            if (num % 2 == 0) {
                count++;

            }


        }
        return count;
    }
}
