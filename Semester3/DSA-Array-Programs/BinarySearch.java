import java.util.*;
public class BinarySearch{
    public static void main(String[] args){
	System.out.print("Enter size of array: ");
	Scanner s = new Scanner(System.in);
	int size = s.nextInt();
	int a[] = new int[size];
	for(int i = 0; i < size ;i++){
	    System.out.print("Enter element: ");
	    a[i] = s.nextInt();
	}
	for (int i = 0; i < a.length - 1; i++){
            for (int j = 0; j < a.length - i - 1; j++){
                if (a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
	System.out.println("Sorted: "+Arrays.toString(a));
	System.out.print("Enter element to search: ");
	int target = s.nextInt();
	int low = 0;
        int high = a.length - 1;
        int resultIndex = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (a[mid] == target){
                resultIndex = mid;
                break;
            }
	    else if (a[mid] < target){
                low = mid + 1;
            }
	    else{
                high = mid - 1;
            }
        }
        if (resultIndex != -1){
            System.out.println("Element " + target + " found at index: " + resultIndex);
        }
	else{
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}