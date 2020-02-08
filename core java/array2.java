//declare and intitialize array without new operator with any size
//then print sum of all even number and odd number from array
class array
{
  public static void main(String arg[])
  {
   double num={2,14,3,2,1,4,5,6};
   int evenSum=0;
   int oddSum=0;
   for(int i=0;i<=num.length-1;i++){
    if(num[i]%2==0)
    {
      evenSum+=num[i];
    }
    else
    {
     oddSum+=num[i];
    }
   }
   System.out.println(evenSum);
   System.out.println(oddSum);
  }
}