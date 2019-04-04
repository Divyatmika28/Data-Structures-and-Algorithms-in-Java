public class NaiveSearch
{

   int M = pat.length();
   int N = text.length();

   for (int i = 0; i<=N-M; i++)
   {
     int j ; 
     for (j=0 ; j<M; j++)
     {

     	if (pat.charAt(j) != txt.charAt( i + j))
     		break; 

     	if (j==M)
     		System.out.println("Found" +i);
     }


   }


}