package data;

public class simpon8 {
	 // Given function to be integrated
    static float func( float x)
    {
        return (float) ((Math.sqrt(x))*Math.pow(Math.E, x));
    }
      
    // Function to perform calculations
    static float calculate(float lower_limit, 
                           float upper_limit, int interval_limit )
    {
        float value;
        float interval_size = (upper_limit - lower_limit)
                               / interval_limit;
 
        float sum = func(lower_limit) + func(upper_limit);
      
        // Calculates value till integral limit
        for (int i = 1 ; i < interval_limit ; i++)
        {
            if (i % 3 == 0)
                sum = sum + 2 * func(lower_limit 
                                     + i * interval_size);
            else
                sum = sum + 3 * func(lower_limit + i 
                                     * interval_size);
        }
        return ( 3 * interval_size / 8 ) * sum ;
    }
     
    // Driver program to test above function
    public static void main(String[] args)
    {
        int interval_limit = 100;
        float lower_limit = 0;
        float upper_limit = (float) Math.PI;
        float integral_res = calculate(lower_limit, upper_limit,
                                       interval_limit);  
        System.out.println(integral_res);
        }
    
}
