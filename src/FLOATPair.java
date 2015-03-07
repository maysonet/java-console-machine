/**	Contains methods to compute real solutions
 	of a quadratic equation
 	@author Christopher Maysonet*/

public class FLOATPair { 
	private Float first; 
	private Float second;
	
	/**Construct FLOATPair with all coefficients of
	 * the quadratic equation in its standard form
	 * 
	 * @param a Grade 2 coefficient of quadratic equation in standard form.
	 * @param b Grade 1 coefficient of quadratic equation in standard form.
	 * @param c Grade 0 coefficient of quadratic equation in standard form.
	 */
	public FLOATPair(float a, float b, float c){
		this.first = (float) ((-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
		this.second = (float) ((-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
	}
	
	/** Returns a String containing the two real solutions of 
	 * a quadratic equation
	 * @return first and second real solutions of quadratic equation
	 */
	public String getTwoSolutions() {
		return "The function given have two real solutions. \nThe solutions are " + first + " and " + second + ".";
	}
	
	/** Returns a String containing one real solution of 
	 * a quadratic equation
	 * @return first real solution of quadratic equation
	 */
	public String getOneSolution(){
		return "The function given have exactly one real solution.\nThe solution is " + first+ ".";
	}
	
	/** Get first real solution of the quadratic equation 
	 * @return the first real solution of the quadratic equation*/
	public Float getFirst() {
	return first;
	}

	/** Set first real solution of the quadratic equation 
	 */
	public void setFirst(Float first) {
		this.first = first;
	}

	/** Get second real solution of the quadratic equation 
	 * @return the second real solution of the quadratic equation*/
	public Float getSecond() {
		return second;
	}
	
	
	/** Set second real solution of the quadratic equation 
	 */
	public void setSecond(Float second) {
		this.second = second;
	}

			} 

