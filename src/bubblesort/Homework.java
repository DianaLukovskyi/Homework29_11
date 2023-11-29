package bubblesort;

public class Homework {
    public static void main(String[] args) {
        int[] array1 = {10,15,10,1,25,10};
        int[] array2 = {10,15,10,1,25,45};

        System.out.println(equalNum(array1,10,30));
        System.out.println(equalNum(array2,10,30));









    }
    public static boolean equalNum( int[] array,int n, int m){

        int sum = 0;
        for(int num :array){
            if (num == m){
                sum+=num;

            }
        }

        return sum ==n * m;




    }
}
