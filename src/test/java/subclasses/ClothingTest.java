/**
 *   File Name: ClothingTest.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 3, 2015
 *   
 */

package subclasses;

import org.junit.Test;

/**
 * 
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public class ClothingTest {

	@Test
	public void test() {

		AbstractClothe clothes[] = { new WinterJacket(), new WinterAccessory(), new SummerShirt(), new SummerShorts() };

		for (AbstractClothe clothe : clothes) {
			clothe.demoClassActivity();
		}

	}

}
