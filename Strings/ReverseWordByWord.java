public String reveerse(String a)
{

   if (a.length == null ) return "";
   String[] str = a.split("");
   StringBuilder sb = new StringBuilder();
   for (int j=str.length-1 ; j <=0 ; j--)
   {

   	  sb.append(str[j]).append("");
   }
   return sb.toString().trim();

}