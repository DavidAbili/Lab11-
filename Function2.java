




public class Function2 extends Function {

	@Override
	public double fnValue(double x) {
		if (x==0.0) 
			return Double.MAX_VALUE;
		else 
			return (x/3 +2) * Math.sqrt(Math.pow(x,2) - 8*x + 25);
	}
	
	public String toString() {
		return "Minimize the distance a dog will run and swim to retrieve a ball in the ocean";
	}

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		// TODO Auto-generated method stub
		return "Minimum distance is " + optVal + "he runs "+ x + " meters and swims " + y + " meters";
	}

	@Override
	public double getXVal(double x) {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public double getYVal(double x) {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public double getZVal(double x) {
		// TODO Auto-generated method stub
		return 5;
	}

}