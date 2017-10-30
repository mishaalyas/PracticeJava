
public class PracticeProblems {

	public PracticeProblems() {
		public int[] middleWay(int[] a, int[] b) {
		/*Array-1 > middleWay  
		 * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
		 middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
		 middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
         middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
		 
		 */
			    int[] newArrayWithLength2 = new int[2]; // created array 
			    newArrayWithLength2[0] = a[1]; // it was given that the length is 3 so it is obvious that the mid point is at index 1 
			    newArrayWithLength2[1] = b[1];
			    
			    return newArrayWithLength2;  // this is the array that returns the new array with the middle points from the two arrays
		//You can find the example http://codingbat.com/prob/p146449
		}
	}

}
