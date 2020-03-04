public class SortOfSort {

    public static void main(String[] args) {
        int[] alan = {2,4,5,1,4,6};
        int max = findMax(alan, alan.length,1,alan[1]);
            System.out.println(max);
         double a = 3.0;


        sortOfSort(alan);
        for(int i = 0; i < alan.length; i++){
            System.out.print(alan[i] + " ");
        }

    }
// 0 1 2 3 4 5 6

    public static void sortOfSort(int[] unsorted){
        sortRecursive(unsorted,0,unsorted.length - 1, 0,0);
    }

    public static int[] sortRecursive(int[] array, int start, int end, int count, int count2){
        int temp;
        int maxIndex = findMax(array, end + 1, start, array[start], start);
        if(start == end){
            return array;
        }
        else if(count2 == 0){
            temp = array[end];
            array[end] = array[maxIndex];
            array[maxIndex] = temp;
            if(count == 2 && count2 == 0) {
                count = 0;
                count2 = 1;
            }
            return sortRecursive(array,start,end - 1, count + 1,count2);
        }
        else {
            temp = array[start];
            array[start] = array[maxIndex];
            array[maxIndex] = temp;
            if(count == 2 && count2 == 0) {
                count = 0;
                count2 = 0;
            }
            return sortRecursive(array,start + 1,end,count + 1, count2);
        }

    }

    public static int findMax(int[] array, int last, int start, int max, int maxIndex){
        if(start == last - 1)
            return maxIndex;
        if(array[start] > max) {
            maxIndex = start;
            max = array[start];
        }
        return findMax(array,last,start + 1,max, maxIndex);
    }

}
