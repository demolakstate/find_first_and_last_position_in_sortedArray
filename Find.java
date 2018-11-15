class Find {

	public static void main(String[] args) {
	Find f = new Find();
	 int[] f2 = f.searchRange(new int[] {5,5,7,7,8,8,10, 10}, 8);
	//int[] f2 = f.searchRange(new int[] {1,3,3}, 3);

	for (int i = 0; i < f2.length; i++) {
		System.out.println(" " + f2[i] );
}
	

} // end main method
    public int[] searchRange(int[] nums, int target) {

	// declare array boundary
	int lo = 0;
	int hi = nums.length;

	boolean solution_reached = false;

	// declare solution
	int left = -1;
	int right = -1;

// divide the array into 2 parts

      while (lo <= hi && !solution_reached) {

	int middle = (lo + hi) / 2; // take floor

	System.out.println("middle " + middle);
	
	// we reach a solution area if middle == target
	// we can then spread to left and right to get starting and ending index
	if (nums[middle] == target) {
	solution_reached = true;
	
	// get left index
	int leftInd = 0;
	while( nums[middle - leftInd] == target ){

	left = middle - leftInd; // update left solution

          leftInd += 1; 
         if (middle - leftInd < 0) // stop iteration, edge is reached
		break;
	
	  } // end while loop - left index

	

	// get right index
         int rightInd = 0;

	while( nums[middle + rightInd] == target ){
	right = middle + rightInd; // update right solution

            rightInd += 1;
	System.out.println("rightInd: " + rightInd);

	if ((middle + rightInd) > hi - 1)
		break; // stop iteration, edge is reached

	} // end while loop - right index

	


	}// end if
	else if (nums[middle] < target) { // look for solution on the right since array is sorted
		lo = middle + 1;
}

	else
		hi = middle; // solution is on the left partition



} // end while loop

    // return solution

      return new int[] {left, right};



        
  } // end method searchRange

} // end class Solution