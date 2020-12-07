public class myClass
{
  public static void main(String args[])
  {
    String s1 = new String();
    s1 = "Vishal";
    String s2 = new String();
    s2 = "";
    for(int i = (s1.length()-1);i>=0;i--)
    {
      s2 = s2+s1[i];
    }
    s3 = s1.concat(s2);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
  }
}
