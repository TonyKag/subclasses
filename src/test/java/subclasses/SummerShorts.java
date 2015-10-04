/**
 *   File Name: SummerShirt.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 3, 2015
 *   
 */

package subclasses;

/**
 * SummerShirt //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class SummerShorts extends AbstractSummerClothe {

	private int shortLengthSize;

	public SummerShorts() {
		super("Summer Shorts", "small", 34.59, new String[] { "water" }, 42, "Beach Style");
		this.shortLengthSize = shortLengthSize;
	}

	public SummerShorts(String fabricType, String name, double price, String[] resistance, String size,
			String summerStyleType, int shortLengthSize) {
		super(fabricType, name, price, resistance, size, summerStyleType);
		this.shortLengthSize = shortLengthSize;
	}

	/**
	 * @see subclasses.IDemoClassActivity#demoClassActivity()
	 */
	@Override
	public void demoClassActivity() {
		System.out.println("Summer Shirt Selection");
		this.displayClothes();
		this.customizeClothes();
	}

	/**
	 * @return the shortLength
	 */
	public int getShortLengthSize() {
		return shortLengthSize;
	}

	/**
	 * @see subclasses.AbstractClothe#putClothesOnFemale()
	 */
	@Override
	public void putClothesOnFemale() {
		System.out.println("The female put on the " + getName() + " very gently.");
		System.out.println("The female thinks " + this.getShortLengthSize() + " is not right she should change sizes.");
	}

	/**
	 * @see subclasses.AbstractClothe#putClothesOnMale()
	 */
	@Override
	public void putClothesOnMale() {
		System.out.println("The male put on the " + getName() + " very agreesivly.");
		System.out.println("The male thinks " + this.getShortLengthSize() + " is just the right size.");
	}

}