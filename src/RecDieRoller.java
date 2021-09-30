/**
*The RecDieRoller program holds the
*algorithms of rolling a six sided die
*
* @author  Lacey Cottner
* @version 1.0
* @since   2021-09-30
*/
public class RecDieRoller {
	int ran=0;
	int count=1;
	int sum=0;
	
	/**
	   * This method uses recursion until
	   * a Math.random result is 2
	   * 
	   * @param args unused.
	   * @return int
	   */
	public int roll() {
		ran=(int) (Math.random()*6)+1;
	//	System.out.println(ran);
		if (ran==2) {
			System.out.println(ran);
			System.out.println( "Count is: " + count);
			sumSet(count);
			count=1;
			return 2;
		}
			
		else {
			count++;
			System.out.println(ran);
			roll();
		}
		return 0;
		
	}
	
	/**
	   *The setter for the sum variable
	   * 
	   * @param int a
	   * @return nothing
	   */
	public void sumSet (int a) {
		sum=sum+a;
	}
	
	/**
	   *The getter for the sum variable
	   * 
	   * @param nothing
	   * @return int
	   */
	public int sumGet () {
		return sum;
	}
	
}