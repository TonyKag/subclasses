/**
 *   File Name: WinterJacket.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 3, 2015
 *   
 */

package subclasses;

/**
 * 
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public class WinterAccessory extends AbstractWinterClothe {

	private String accType;

	/**
	 * @see subclasses.DemoClassActivity#demoClassActivity()
	 */
	@Override
	public void demoClassActivity() {
		System.out.println("Winter Jacket secection");
		this.displayClothes();
		this.customizeClothes();

	}

	/**
	 * @return the accType
	 */
	public String getAccType() {
		return accType;
	}

	@Override
	public void putClothesOnFemale() {
		System.out.println("The female put on the " + getName() + " very gently");
	}

	@Override
	public void putClothesOnMale() {
		System.out.println("The male put on the " + getName() + " very agressively");

	}

	/**
	 * @param accType
	 *            the accType to set
	 */
	public void setAccType(String accType) {
		this.accType = accType;
	}

}
