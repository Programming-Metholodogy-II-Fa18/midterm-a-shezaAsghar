import java.util.ArrayList;
import java.util.Arrays;

//***for this i used arraylists because my #2 doesnt fully work, and I wanted to be able to check my work for this problem 

public class problem3 {
	public static void main(String[] args){
		ArrayList myList=new ArrayList();
		myList.add(1);
		myList.add(5);
		myList.add(8);
		myList.add(10);
		myList.add(12);
		myList.add(14);
		myList.add(18);
		myList.add(20);
		myList.add(33);
		myList.add(41);
		int result=ProblemThree(myList, 20);
		System.out.println(result);
	}
	
	static int ProblemThree(ArrayList myList, int value){
		Object[] arr=myList.toArray();
		int[] a=new int[arr.length];
		for(int i=0; i<arr.length; i++){
			a[i]=(int)arr[i];
		}
		
		int res=binarySearch(0, a.length,a, value,0);
		return res;
	}
	
	public static int binarySearch(int s, int e, int[] a, int value, int numComparisons){
		if(e<s){
			return numComparisons;
		}
		int mid=(s+e)/2;
		
		if(a[mid]==value){
			numComparisons++;
			return numComparisons;
		}
		if(a[mid]>value){
			numComparisons++;
			return binarySearch(s, mid+1, a, value, numComparisons);
		}
		else{
			numComparisons++;
			return binarySearch(mid+1, e, a, value, numComparisons);
		}
	}
	
}
