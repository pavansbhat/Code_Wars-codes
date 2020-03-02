public class Kata{
    public static String alphabetWar(String fight){
		int sumR=0;
		int sumL=0;
		char arr[]=fight.toCharArray();
		for(char c:arr) {
			switch(c) {
			case 'w':
				sumL +=4;
				break;
			case 'p':
				sumL+=3;
				break;
			case 'b':
				sumL+=2;
				break;
			case 's':
				sumL+=1;
				break;
			case 'm':
				sumR+=4;
				break;
			case 'q':
				sumR +=3;
				break;
			case 'd':
				sumR+=2;
				break;
			case 'z':
				sumR+=1;
				break;
			}
		}
		if(sumL==sumR) {
			return "Let's fight again!";
		}
		else if(sumL>sumR) {
			return "Left side wins!";
		}
		else {
			return "Right side wins!";
		
    }}
}
