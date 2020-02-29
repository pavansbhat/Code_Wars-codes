public class StringToNumber {
	
		  public static int stringToNumber(String str) {
			  int k=Integer.parseInt(str);
			  return k;
			  }
}
class main{
public static void main(String[] args) {
// TODO Auto-generated method stub

	StringToNumber s=new StringToNumber();
	System.out.println(s.stringToNumber("1234"));
	
	}
}
