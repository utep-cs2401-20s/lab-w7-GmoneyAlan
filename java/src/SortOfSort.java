public class SortOfSort {

    public static void main(String[] args) {
        int[] alan = {2,4,5,1,4,6};
        int[] alan2 = sortOfSort(alan);
        for(int i = 0; i < alan2.length; i++){
            System.out.print(alan2[i] + " ");
        }
    }


    public static int[] sortOfSort(int[] unsorted){
        int max = unsorted[0];
        int tempMax, index = 0;

        for(int r = 0; r < unsorted.length; r++){
            for(int c = 0; c < unsorted.length - r; c ++){
                tempMax = unsorted[c];
                if(tempMax > max){
                    int temp = tempMax;
//                    unsorted[c] = unsorted[0];
//                    unsorted[0] = temp;
                    max = tempMax;
                    index = c;
                }
            }
            if(unsorted.length - r % 2 == 0){
                int temp = unsorted[unsorted.length - r - 1];
                unsorted[unsorted.length - r - 1] = max;
                unsorted[index] = temp;
            } else{
                int temp = unsorted[0 + r];
                unsorted[r] = max;
                unsorted[index] = temp;

            }
        }
        return unsorted;

    }

}
