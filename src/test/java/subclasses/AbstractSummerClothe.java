/**
 *   File Name: AbstractWinterClothe.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 3, 2015
 *   
 */

package subclasses;

/**
 * AbstractWinterClothe //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public abstract class AbstractSummerClothe extends AbstractClothe {

	private String summerStyleType;

	public AbstractSummerClothe(String fabricType, String name, double price, String[] resistance, String size,
			String summerStyleType) {
		super(fabricType, name, price, resistance, size);
		this.summerStyleType = summerStyleType;
	}

	@Override
	public void displayClothes() {
		super.displayClothes();
		System.out.println("I'm feeling the heat...");
	}

	public void displaySummerStyleType() {
		super.displayClothes();
		System.out.println("The summer style type " + this.getSummerStyleType());
	}

	/**
	 * @return the summerStyleType
	 */
	public String getSummerStyleType() {
		return summerStyleType;
	}

	/**
	 * @param summerStyleType
	 *            the summerStyleType to set
	 */
	public void setSummerStyleType(String summerStyleType) {
		this.summerStyleType = summerStyleType;
	}
}
