

/*Class: CMSC203
 * Instructor: Dr.Alexander
 * Due 12/4/21
 * Platform compiler:
 * I pledge that I have completed the programming assignment independently
 * I have not copied the code from a student or any source
 * I have not given my code to any student
 * David Abili
 */


public class Function1 extends Function {

	@Override
	public double fnValue(double x) {
		if (x==0.0) 
			return Double.MAX_VALUE;
		else 
			return 0.8*3.14*Math.pow(x,2) + (800/x);
	}
	
	public String toString() {
		return "Minimize the cost of a can that will hold 2 liters of liquid";
	}

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		// TODO Auto-generated method stub
		return "Minimum cost is " + optVal + "with a height of "+ y + " and a radius of " + x;
	}

	@Override
	public double getXVal(double x) {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public double getYVal(double x) {
		// TODO Auto-generated method stub
		return 2000/(3.14*Math.pow(x,2));
	}

	@Override
	public double getZVal(double x) {
		// TODO Auto-generated method stub
		return -1.0;
	}

}
