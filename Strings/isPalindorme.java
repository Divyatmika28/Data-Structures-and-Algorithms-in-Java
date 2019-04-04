public int isPalindrome (String a)
{
	int n = a.length();
	int start = 0;
	int end = n-1;

	while (start < end)
	{
	  char head = a.charAt(start);
	  head = Character.toLowerCase(head);
	   if (!Character.isLetterOrDigit(head))
	   {
	      start++;
	   }
	   else 
	   {
	     char tail = a.charAt(end);
	     tail = Character.toLowerCase(tail);
	     if (!Charachter.isLetterOrDigit(tail))
	     {
	        end--;
	     }
	       else
	        {
                  if (head!=tail)
                  {return 0;}
	        }
	        start++;
	        end--;
	   }
	}
return 1; 

}