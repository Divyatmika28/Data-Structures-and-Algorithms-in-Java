public String solution (String a , String b)
{
   int[] res = new int [a.length() + b.length()]; 
   for (int i = 0 ; i< a.length() ; i++)
   	for (int j = 0; j<b.length(); j++)
   		res[ i + j + 1] += (a.charAt(i) - '0') * (b.charAt(j) - '0');

   	

}