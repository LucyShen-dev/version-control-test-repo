public class Leetcode extends ConsoleProgram
{
   public void run()
   {
      int[] arr = {4,5,6,7};
      System.out.println(binarySearch(arr,6));

   }
   
  public boolean linearSearch(int[] arr, int num)
  {
     for (int i=0; i<arr.length; i++)
     {
         if (arr[i]==num)
         {
             return true;
         }
     }
     return false;
  }
  
  public int binarySearch (int[] arr, int target)
  {
    int startIndex = 0;
    int length = arr.length;
    while(true){
    int midIndex = (length+startIndex)/2;
    if(arr[midIndex]==target)
    {
        return midIndex;
    }
    if(target<arr[midIndex])
    {
        length/=2;
        if(midIndex==0||target>arr[midIndex-1])
        {
            return -1;
        }
    }
    if(target>arr[midIndex])
    {
        startIndex = midIndex+1;
        if(midIndex==length-1||target<arr[midIndex+1])
        {
            return -1;
        }
    }
    
  }
  }
}

