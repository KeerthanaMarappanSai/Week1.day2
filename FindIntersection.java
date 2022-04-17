package week1.day2;

public class FindIntersection {
	public static void main(String[] args) {
		int arr1[] = {3,2,11,4,6,7};
		int arr2[] = {1,2,8,4,9,7};
		
		int length1 =arr1.length;
		int length2 =arr2.length;
		
		System.out.println("Matching Element in first array is ");
		
		for(int i = 0; i< length1; i++)
		{
			for(int r=0; r< length2; r++)
			{
				if(arr1[i]==arr2[r])
					System.out.println(arr1[i]);
			}
		}
	}

}
