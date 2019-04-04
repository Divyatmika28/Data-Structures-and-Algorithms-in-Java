public Soultion (int n)
{
	if (n==0) return "";
	if (n == 1) return "1";
	string prev = "1";
	string curr = prev; 

	for (i= 2; i<=n ; i++)
	{
       current.clear();
       for (int j = 0; j<prev.length(); j++)
       {

       	  int count = 1;
       	  while ((j+1 < prev.length()) && (prev[i] == prev[i+1]))
       	  	{count++ ; j++; }
       }
       current.append(to_string(count) + prev[i]);

     prev = current;


	}
}