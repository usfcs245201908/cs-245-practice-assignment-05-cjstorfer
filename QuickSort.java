public class QuickSort implements SortingAlgorithm{
    int split(int[] a, int left, int right){
        int pivot = a[right];
        int i = (left-1);
        for (int j = left; j < right; j++){
            if (a[j] <= pivot){
                i++;
     
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[right];
        a[right] = temp;
        return i+1;
    }
    public void quickSort(int[] a, int left, int right){

        if (left < right){
            int split_index = split(a, left, right);
     
            quickSort(a, left, split_index-1);
            quickSort(a, split_index+1, right);
        } 
    }
    public void sort(int[] a){
        quickSort(a,0,a.length-1);
    }
}