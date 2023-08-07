import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private payment p1;
	private payment p2;
	private menu m1;
	private menu m2;

	private ArrayList<payment> paymentList;
	private ArrayList<menu> menuList;

	@Before
	public void setUp() throws Exception {
		m1 = (new menu("Spaghetti Bolognese", 2, "Gluten-free pasta"));
		m2 = (new menu("Fish and Chips", 2, "Tartar sauce on the side"));
		menuList = new ArrayList<menu>();
		p1 = new payment(1, 100.0);
		p2 = new payment(2, 200.0);
		paymentList = new ArrayList<>();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddmenu() {
		// fail("Not yet implemented");
		assertNotNull("Test if there is valid menu arraylist to add to", menuList);
		C206_CaseStudy.addmenu(menuList, m1);	
		assertEquals("Check that menu arraylist size is 1", 1, menuList.size());
		assertSame("Check that menu1 is added", m1, menuList.get(0));

		C206_CaseStudy.addmenu(menuList, m2);
		assertEquals("Check that Camcorder arraylist size is 2", 2, menuList.size());
		assertSame("Check that Camcorder is added", m2, menuList.get(1));

	}

	@Test
	public void testDeletemenu() {
		// ArrayList<menu> menuList = new ArrayList<>();
		menuList.add(m1);
		menuList.add(m2);

		// Delete an existing menu item
		boolean isDeleteSuccessful = C206_CaseStudy.deleteMenu(menuList, "Spaghetti Bolognese");

		// Assert that the delete operation is successful
		assertTrue("Test if an existing item can be deleted", isDeleteSuccessful);

		// Delete a non-existing menu item
		isDeleteSuccessful = C206_CaseStudy.deleteMenu(menuList, "pancakes");

		// Assert that the delete operation is not successful for a non-existing item
		assertFalse("Test if a non-existing item cannot be deleted", isDeleteSuccessful);

		// Delete the same menu item again
		isDeleteSuccessful = C206_CaseStudy.deleteMenu(menuList, "Spaghetti Bolognese");

		// Assert that the delete operation is not successful for the same item
		assertFalse("Test if the same item cannot be deleted again", isDeleteSuccessful);

		// Assert that the menu list size has been reduced by 1 after successful
		// deletion
		assertEquals("Check that menu list size is reduced by 1 after deletion", 1, menuList.size());
	}
	

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
		{
		}
	}

	public static void addpayment(ArrayList<payment> paymentList, payment p) {
		paymentList.add(p);
	}

	public static String retrieveAllpayment(ArrayList<payment> paymentList) {

		String allpayment = "";

		for (payment p : paymentList) {

			allpayment += String.format("%-10d %-10.2f\n", p.getpaymentid(), p.getamount());
		}

		return allpayment;
	}

	public static boolean doDeletepayment(ArrayList<payment> paymentList, int paymentId) {

		for (int i = 0; i < paymentList.size(); i++) {

			if (paymentList.get(i).getpaymentid() == paymentId) {

				paymentList.remove(i);

				return true;
			}
		}
		return false;
	}

	@Test
	public void testAddPayment() {

		assertNotNull("Test if there is valid payement from ", paymentList);
		// Given an empty list, after adding 1 payment transaction, the size of the list
		// is 1 - normal
		// The item just added is as same as the first payment transaciton of the list
		C206_CaseStudyTest.addpayment(paymentList, p1);
		assertEquals("Test that Payment arraylist size is 1", 1, paymentList.size());
		assertSame("Test that Payment is added", p1, paymentList.get(0));

		// Add another item. test The size of the list is 2 transaction? - normal
		// The item just added is as same as the second item of the list
		C206_CaseStudyTest.addpayment(paymentList, p2);
		assertEquals("Test that payment arraylist size is 2", 2, paymentList.size());
	}

	@Test
	public void testRetrieveAllpayment() {
		// Test if payment list is not null but empty -boundary
		assertNotNull("Test if there is valid payment arraylist to retrieve item", paymentList);

		// test if the list of payment retrieved from the C206_CaseStudyTes is empty -
		// boundary
		String allpayment = C206_CaseStudyTest.retrieveAllpayment(paymentList);
		String testOutput = "";
		assertEquals("Check that ViewAllpaymentlist", testOutput, allpayment);

		// Given an empty list, after adding 2 transaction, test if the size of the list
		// is 2 - normal
		C206_CaseStudyTest.addpayment(paymentList, p1);
		C206_CaseStudyTest.addpayment(paymentList, p2);
		assertEquals("Test that payment arraylist size is 2", 2, paymentList.size());

		// test if the expected output string same as the list of payments retrieved
		// from the C206_CaseStudyTest
		allpayment = C206_CaseStudyTest.retrieveAllpayment(paymentList);
		testOutput = String.format("%-10d %-10.2f\n", p1.getpaymentid(), p1.getamount());
		testOutput += String.format("%-10d %-10.2f\n", p2.getpaymentid(), p2.getamount());
		assertEquals("Test that ViewAllpaymentlist", testOutput, allpayment);

	}

	@Test
	public void testDeletepayment() {
		// check
		assertNotNull("test if there is valid payment arraylist to pay ", paymentList);
		// delete
		C206_CaseStudyTest.addpayment(paymentList, p1);
		Boolean delete = C206_CaseStudyTest.doDeletepayment(paymentList, 1);
		assertTrue("Test if an payment transaction is ok to delete", delete);
		assertEquals(0, paymentList.size());

		// Test Case 2 - Item not found
		boolean allpayment = C206_CaseStudyTest.doDeletepayment(paymentList, 3);
		assertFalse("Test that the payment is not found and delete fails", allpayment);

	}
	
}
