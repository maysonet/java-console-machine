/** 
 * Contains methods get real solutions count and to
 * 	initialize actions to compute real solutions
 *	of a quadratic equation
 * 	@author Christopher Maysonet
 *
 */

public class QuadraticEquation { 
	private float a;  //coefficient of degree 2 term
    private float b;  //coefficient of degree 1 term
    private float c;  //coefficient of degree 0 term (constant term)
    
    /** 
     * Constructs a QuadraticEquation with the three coefficients
     *
     * 	@param a Grade 2 coefficient of quadratic equation in standard form
     * 	@param b Grade 1 coefficient of quadratic equation in standard form
     * 	@param c Grade 0 coefficient of quadratic equation in standard form
     */
    public QuadraticEquation(float a, float b, float c) { 
          this.a = a; 
          this.b = b; 
          this.c = c; 
    } 
    
    /** 
     * Returns the value of grade 2 coefficient 
     * 	@return value of a*/
  
    public float getA() {
		return a;
	}
 
    /** 
     * Returns the value of grade 1 coefficient
     * 	@return value of b*/
	public float getB() {
		return b;
	}
	/** 
	 * Returns the value of grade 0 coefficient
	 * 	@return value of c */
	public float getC() {
		return c;
	}

    /** 
     * Counts number of different real solutions the equation
        has. 
        @return An integer value in range 0..2 (0, 1, or 2)
                corresponding to the number of different real 
                solutions that the equation has. 
    */
    public int realSolutionsCount() {
    	int realSolutions = 0;
    	float discriminant = b * b - (4 * a * c);
    	if(discriminant < 0){
    		realSolutions = 0;
    	}
    	else if(discriminant > 0){
    		realSolutions = 2;
    	}
    	else{
    		realSolutions = 1;
    	}
    	return realSolutions;
    }
    
    
    /** 
     * Returns the real solutions of the equation, if any. 
    	@return String containing real solution if the equation has at least one real
            solution. In the case of only one real solution, 
            the string contains the only real solution. 
            If it has two real solutions, the string contains both real solutions
*/
    public String getRealSolutions() { 
    	String x="";
    	FLOATPair roots = new FLOATPair(getA(),getB(),getC());
    	int realSolutions = realSolutionsCount();
    	if(realSolutions == 1){
    		x = roots.getOneSolution();
		}
    	else if(realSolutions == 2){
    		x = roots.getTwoSolutions();
    	}
    	return x;
    	
    } 

    
}