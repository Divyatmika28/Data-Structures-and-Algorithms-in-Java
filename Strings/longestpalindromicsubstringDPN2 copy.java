public String longestPalindrome(String s)
{

	if (s == null || s.length()<=1)
		return s;
	int len = s.length();
	int laxlen = 1; 

	boolena[][] dp = new boolean[len][len];

	String longest = null; 

	for (int l = 0; l<s.length(); l++)
	{
		for (int i = 0; i<len-1 ; i++)
		{

			 j = i + 1;
			 if (s.charAt(i) == s.charAt(j) && (dp[i+1][j-1] || j-i<=2)
			 {
			 	dp[i][j] = true;
			 }
			 if (j-i+1 > maxlen)
			 {
			 	maxlen = j-i+1;
			 longest = s.substring(i, j+1);
			 }
		}




	}



}