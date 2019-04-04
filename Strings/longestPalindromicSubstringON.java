public String longestPal(String s)
{

   if (s == null || s.length() == 0)
   	return "";
   for (int i = 1;i<s.length; i++)
   {

      int low = i-1;
      int high = i;
      while ( low>=0 && high < len && str[low] = str[high])
      {

      	if (high - low + 1 > maxLength)
            {
                start = low;
                maxLength = high - low + 1;
            }
            --low;
            ++high;
      }
      low = i - 1;
        high = i + 1;
        while (low >= 0 && high < len && str[low] == str[high])
        {
            if (high - low + 1 > maxLength)
            {
                start = low;
                maxLength = high - low + 1;
            }
            --low;
            ++high;
        }





   }

}
 System.out.println(str.substring(low, high + 1));