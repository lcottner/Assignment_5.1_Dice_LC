/**
*The RecDieRoll1000 program simulates rolling a 6 sided die
*1000 times and seeing how many rolls on average it will take to get a 2. 
*
* @author  Lacey Cottner
* @version 1.0
* @since   2021-09-30
*/
public class RecDieRoll1000 {
		
	public static void main(String[]args) {
		RecDieRoller d6=new RecDieRoller();
		int count=0;
		
		for (int i=0; i<1000; i++) {
			d6.roll();
		}
		System.out.println("Sum is:" + d6.sumGet());
		System.out.println("Therefore the mean number of rolls is: "+ (d6.sumGet()/1000.0));
	}
}

