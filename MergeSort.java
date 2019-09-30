public class MergeSort implements SortingAlgorithm{
    public void merge(int[] a, int left, int mid, int right){ 
        int left_side = mid - left + 1; 
        int right_side = right - mid; 

        int[] L = new int [left_side]; 
        int[] R = new int [right_side]; 
  
        for (int i=0; i<L.length; ++i) 
            L[i] = a[left + i]; 
        for (int j=0; j<R.length; ++j) 
            R[j] = a[mid + 1+ j]; 

        int i = 0;
        int j = 0; 
        int k = left; 

        while (i < L.length && j < R.length){ 
            if (L[i] <= R[j]){ 
                a[k] = L[i]; 
                i++; 
            } 
            else{ 
                a[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 

        while (i < L.length){ 
            a[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        while (j < R.length){ 
            a[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
      
    public void mergeSort(int[] a, int left, int right){ 
        if (left < right){ 
            int mid = (left+right)/2; 
  
            mergeSort(a, left, mid); 
            mergeSort(a, mid+1, right); 
  
            merge(a, left, mid, right); 
        } 
    } 
    public void sort(int[] a){
        mergeSort(a,0,a.length-1);
    }
}