
public class problem1 {

	public static void main(String[] args) {
		int[] a ={15,9,60, 44, 12, 1, 4};
		ExamSort(a, a.length);
		printArr(a);
		
	}
	
	private static void printArr(int[] a){
		for(int i=0; i<a.length-1; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void ExamSort(int[] a, int size){
		//O(nlogn) in best and worst case - merge sort
		int[] helper = new int[size];
		mergeSort(a, helper, 0, size-1);
		
	}
	
	static void mergeSort(int[] a, int[] helper, int low, int high){
		if(low<high)
			return;
		int middle=(low+high)/2;
		mergeSort(a,helper, low, middle);
		mergeSort(a,helper, middle+1, high);
		merge(low, middle, high, a , helper);
	
	}
	
	static void merge(int low, int middle, int high, int[] a, int[] helper){
		for(int i=low; i<=high; i++){
			helper[i]=a[i];
		}
		
		int i=low;
		int j=middle+1;
		int k=low;
		
		while(i<=middle && j<=high){
			if(helper[i]<=helper[j]){
				a[k]=helper[i];
				i++;
			}
			
			else{
				a[k] = helper[j];
				j++;
			}
			k++;
		}
		
		while(i<=middle){
			a[k]=helper[i];
			k++;
			i++;
		}
		
		
	}
	

	
}
