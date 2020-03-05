
public class SortOfSort {

    public void sortOfSort(int[] unsorted){
        sortRecursive(unsorted,0,unsorted.length - 1, 1,0);
    }

    public int[] sortRecursive(int[] array, int start, int end, int count, int count2){
        int temp;
        int maxIndex = findMax(array, end + 1, start, array[start], start);
        if(start == end){
            return array;
        }
        else if(count2 == 0 && count < 3){
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
            if(count == 2 && count2 == 1) {
                count = 0;
                count2 = 0;
            }
            return sortRecursive(array,start + 1,end,count + 1, count2);
        }
    }

    public int findMax(int[] array, int last, int start, int max, int maxIndex){
        if(start == last )
            return maxIndex;
        if(array[start] > max) {
            maxIndex = start;
            max = array[start];
        }
        return findMax(array,last,start + 1,max, maxIndex);
    }
}//end of class
