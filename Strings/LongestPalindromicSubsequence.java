class LPS
{



    static int max (int x, inty )
    {

    	return ( x > y)? x ; y;
    }

    static int lps (String seq)
    {

    	int[][] L = new int[][];
    	for (int i = 0; i<n ; i ++)
    	{
    		L[i][i] = 1;
    	}
    	for (cl= 2 ; cl<=n;cl++)
    	{


    		for (i=0;i<n-cl+1;i++)
    		{


    			j = i+cl-1;
    			if (seq.chatAt(i) == seq.charAt(j) && cl == 2)
    				C[i][j] = 2;
    			else if (seq.chatAt(i) == seq.charAt(j))
    				C[i][j] = 2 + L[i+1][j-1];
                else
    				C[i][j] = max (C[i+1][j, C[i][j-]1)

     		}
    	}
     return L[0][n-1];

    }

  public static void main(String args[])
    {
        String seq = "GEEKSFORGEEKS";
        int n = seq.length();
        System.out.println("The lnegth of the lps is "+ lps(seq));
    }



}