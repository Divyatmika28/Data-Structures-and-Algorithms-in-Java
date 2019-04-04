static String LongestPrefix (String arr[])
{
	int n = arr.length;
	//to find the smallest string 
	int index = findMinlength(arr,n);
		String prefix = "";
		int low = 0, high = index;
		while (low<=high)
		{

			int mid = (low +high) /2;
			if (allContainsPrefix(arr, n, arr[0], low, mid))
			{

				prefix = prefix + arr[0].substring(low, mid-low+1);
				//go for the right part
				low = mid + 1;
			}
			else 
			{
				high = mid - 1;
			}
		}
    return prefix; 

}

findMinlength(String arr, n)
{

		int min = 0;
		for (i= 0; i<=n-1; i++)
		{
			if(arr[i].length() < min)
			{
				min = arr[i].length();
			}
		}
		return min;
	
}

static boolean allContainsPrefix(String arr[], int n , String str, int start, int end)
{

	for (int i = 0; i <= (n-1) ; i++)
	{
		String arr_i = arr[i];
		for (int j = start; j<=end; j++)
			if(arr_i.charAt(j) != str.charAt(i))
				return false;		
	}
	return true; 
}