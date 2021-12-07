




public class Function3 extends Function {

	@Override
	public double fnValue(double x) {
		if (x==0.0) 
			return Double.MAX_VALUE;
		else 
			return Math.sqrt(Math.pow(x,4) - 8*Math.pow(x,2) + 1);
	}
	
	public String toString() {
		return "Find the minimun distance between the function f(x) = x^2 and the point (0,1) This distance is desribed by the function d(x) = sqrt(x^4 - x^2 +1)";
	}

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		// TODO Auto-generated method stub
		return "The minimun distance is " + optVal;
	}

	@Override
	public double getXVal(double x) {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public double getYVal(double x) {
		// TODO Auto-generated method stub
		return Math.pow(x,2);
	}

	@Override
	public double getZVal(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

}