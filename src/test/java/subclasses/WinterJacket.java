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
public class WinterJacket extends AbstractWinterClothe {

	boolean hasHood;

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
	 * @return the hasHood
	 */
	public boolean isHasHood() {
		return hasHood;
	}

	@Override
	public void putClothesOnFemale() {
		System.out.println("The female put on the " + getName() + " very gently");
		System.out.println("He does not care if having a hood is " + this.isHasHood() + " or " + this.isHasHood());

	}

	@Override
	public void putClothesOnMale() {
		System.out.println("The male put on the " + getName() + " very agressively");
		System.out.println("She likes " + this.isHasHood() + " or " + this.isHasHood());

	}

	/**
	 * @param hasHood
	 *            the hasHood to set
	 */
	public void setHasHood(boolean hasHood) {
		this.hasHood = hasHood;
	}

}
