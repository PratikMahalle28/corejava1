class person
{
int uid=0;
char gender=m;
 public void setdata(int a,char g)
 {
  uid=a;
  gender=g
 }
 public void getdata()
 {
  System.out.println(uid);
  System.out.println(gender);
 }
}
public class TestPerson
{
  public static void main(String arg[])
  {
   Person per();
   per=new person();
   per.setdata(11,'M');
   per.getdata();
  }
}
   