class abc1
{
 public static void main(String arg[])
 {
  int a=144;
  if(a>=1 && a<=120)
  {
    if(a>=1 && a<=17)
    {
     System.out.println("child"); 
    }
    else if(a>=18 && a<=24)
    {
     System.out.println("Teen");
    }
    else if(a>=25 && a<=60) 
    {
     System.out.println("young");
    }
    else if(a>=61 && a<=120)
    {
     System.out.println("old");
    }
  
  else
  {
   System.out.println("default age");
  }
  }
 }
}