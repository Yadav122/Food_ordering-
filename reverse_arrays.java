class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
      String st = "";
      int n = str.length();
      for (int i=n-1 ; i>=0; i-- ){
          st+=str.charAt(i);
      }
      return st;
     
    }
    
}
