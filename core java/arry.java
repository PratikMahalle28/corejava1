class arry
{
 public static void main(String arg[])
 { 
  
  int arr[][]={{1,2,3},{2,4,5}};
  for(int r=0;r<=arr.length-1;r++)
  {
   for(int c=0;c<=arr[0].length-1;c++)
   {
    System.out.println(arr[r][c]);
   } 
  }
 for(int a[]:arr)
 {
  for(int b:a)
  {
   System.out.println(b);
  }
 }
 
 }
}