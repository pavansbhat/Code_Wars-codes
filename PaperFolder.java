public class PaperFolder {
static double thickness=0.0001;
	static long folds;
	double folding;
 public static Object fold(Double distance) {
		if(distance>thickness) {
		Double folding = (distance/thickness);
		double folds =  (Math.log(folding)/Math.log(2));
		return (long) Math.ceil(folds);
		}
		else if(distance<0){
			return null; 
		} 
    else{
    return (long) 0;
    }
    
  }
 
}
