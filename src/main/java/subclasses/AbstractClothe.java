package subclasses;

import java.util.Arrays;

public abstract class AbstractClothe implements DemoClassActivity {
	private String fabricType;
	private String name;
	private double price;
	private String[] resistance;
	private String size;

	public AbstractClothe() {
		super();
		this.fabricType = "Cotton";
		this.name = "No Name";
		this.price = 5.0;
		this.resistance = new String[] { "None" };
		this.size = "medium";
	}

	public AbstractClothe(String fabricType, String name, double price, String[] resistance, String size) {
		super();
		this.fabricType = fabricType;
		this.name = name;
		this.price = price;
		this.resistance = resistance;
		this.size = size;
	}

	public void customizeClothes() {
		System.out.println("The user has decided to customize their " + this.getName() + " which is made of "
				+ this.getFabricType() + " and costs " + (this.getPrice() + 20.00) + " to be customized.");
	}

	/**
	 * @param fabricType
	 * @param name
	 * @param price
	 * @param resistance
	 * @param size
	 */

	public void displayClothes() {
		System.out.println("Clothe " + name + " is being displayed");
		System.out.println("The male puts it on:");
		this.putClothesOnMale();
		System.out.println("The female puts it on:");
		this.putClothesOnFemale();
	}

	/**
	 * @return the fabricType
	 */
	public String getFabricType() {
		return fabricType;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the resistance
	 */
	public String[] getResistance() {
		return resistance;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	public void putClothesOnFemale() {

	}

	public void putClothesOnMale() {

	}

	/**
	 * @param fabricType
	 *            the fabricType to set
	 */
	public void setFabricType(String fabricType) {
		this.fabricType = fabricType;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param resistance
	 *            the resistance to set
	 */
	public void setResistance(String[] resistance) {
		this.resistance = resistance;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Clothe [fabricType=" + fabricType + ", name=" + name + ", price=" + price + ", resistance="
				+ Arrays.toString(resistance) + ", size=" + size + "]";
	}
}
