static int Palindrome (String str)
{

   int n = str.length();
   //create two arrays, to determine if a substring is a palindrome and to know the cost 
   boolean[][] P = new boolean[n][n];
   int[] C = new int[n];

   //Every substring of lebgth 1 is a palnidrome 
   for (i= 0;i< n;i++)
   {
   	P[i][i] = 0; //no insertions 
   }

// L is a substring length so we have a length from L to n 
   for (l= 2 ; l<=n ; l++)
   {
      for (i=0 ; i<n-l+1 ; i++)
      {

        j = L+ i -1 ; // so we have a substring of i....j of length l so L = i-j+1 so we cal j 
        if (L == 2)
        	P[i][j] = (str.charAt(i) ==
                                 str.charAt(j));
        else 
        	P[i][j] = (str.charAt(i) == 
                           str.charAt(j)) && P[i+1][j-1];


        if (P[i][j] == true)
                    C[i][j] = 0;
                else
                {
                    // Make a cut at every possible
                    // localtion starting from i to j,
                    // and get the minimum cost cut.
                    C[i][j] = Integer.MAX_VALUE;
                    for (k = i; k <= j - 1; k++)
                        C[i][j] = Integer.min(C[i][j], 
                                C[i][k] + C[k+1][j] + 1);
                }
            }

      }

   }
}