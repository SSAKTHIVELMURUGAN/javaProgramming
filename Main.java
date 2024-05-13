public class Main
{
  
    public String recursion(String str, int count)
    {
        if(count == 3)
        {
            return " ";
        }
        count++;
        System.out.println(str);
        return recursion(str,count);
    }
	public static void main(String[] args) {
	  Main main = new Main();
	  String str = "Hello World";
	  int count =0;
     main.recursion(str, count);
	}
}
