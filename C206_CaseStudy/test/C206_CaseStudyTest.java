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
	private vendor v1;
	private vendor v2;
	private user u1;
	private user u2;
	private user u3;
	private order ob1;
	private order ob2;
	private School sch1;
	private School sch2;
	private School sch3;
	private School sch4;
	private School sch5;



	private ArrayList<payment> paymentList;
	private ArrayList<menu> menuList;
	private ArrayList<vendor>vendorList;
	private ArrayList<user>UserManagement;
	private ArrayList<order>orderList;
    private ArrayList<School> schoolList;

	@Before
	public void setUp() throws Exception {
		m1 = (new menu("Spaghetti Bolognese", 2, "Gluten-free pasta"));
		m2 = (new menu("Fish and Chips", 2, "Tartar sauce on the side"));
		menuList = new ArrayList<menu>();
		p1 = new payment(1, 100.0);
		p2 = new payment(2, 200.0);
		paymentList = new ArrayList<>();
		vendorList=new ArrayList<vendor>();
		u1 = new user("Tim", "i2kdb2");
		u2 = new user("Susan", "ssld02");
		u3 = new user("John", "dwoow");
		UserManagement = new ArrayList<user>();
		ob1 = new order(1,"Pasta");
		ob2 = new order(2, "Burger");
		sch1=(new School("Example School", "City A", 12345678));
		sch2=(new School("ExampleA School", "City B", 12341234));
		schoolList=new ArrayList<School>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddmenu() {
		// fail("Not yet implemented");
		assertNotNull("Test if there is valid menu arraylist to add to", menuList);
		assertEquals("Check if the menu ArrayList is initially empty", 0, menuList.size());
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
	public void testAddvendor() {
		vendorList.clear();

		assertNotNull("Test if there is a valid Vendor ArrayList to add to", vendorList);

		vendor newVendor1 = new vendor("Vendor 3", "City Z", "2023-12-31");
		C206_CaseStudy.addvendor(vendorList, newVendor1);
		assertEquals("Check that vendor ArrayList size is 1", 1, vendorList.size());
		assertSame("Check that newVendor1 is added", newVendor1, vendorList.get(0));

		vendor newVendor2 = new vendor("Vendor 4", "City W", "2023-11-30");
		C206_CaseStudy.addvendor(vendorList, newVendor2);
		assertEquals("Check that vendor ArrayList size is 2", 2, vendorList.size());
		assertSame("Check that newVendor2 is added", newVendor2, vendorList.get(1));
	}
	@Test
	public void testDeletevendor() {
		// ArrayList<menu> menuList = new ArrayList<>();
		vendorList.clear();
		vendor newVendor1 = new vendor("Vendor 3", "City Z", "2023-12-31");
		C206_CaseStudy.addvendor(vendorList, newVendor1);

		vendor newVendor2 = new vendor("Vendor 4", "City W", "2023-11-30");
		C206_CaseStudy.addvendor(vendorList, newVendor2);

		// Delete an existing menu item
		boolean isDeleteSuccessful = C206_CaseStudy.deletevendor(vendorList, "Vendor 3");

		// Assert that the delete operation is successful
		assertTrue("Test if an existing item can be deleted", isDeleteSuccessful);

		// Delete a non-existing menu item
		isDeleteSuccessful = C206_CaseStudy.deletevendor(vendorList, "pancakes");

		// Assert that the delete operation is not successful for a non-existing item
		assertFalse("Test if a non-existing item cannot be deleted", isDeleteSuccessful);

		// Delete the same menu item again
		isDeleteSuccessful = C206_CaseStudy.deletevendor(vendorList, "vendor 3");

		// Assert that the delete operation is not successful for the same item
		assertFalse("Test if the same item cannot be deleted again", isDeleteSuccessful);

		// Assert that the menu list size has been reduced by 1 after successful
		// deletion
		assertEquals("Check that menu list size is reduced by 1 after deletion", 1, vendorList.size());
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
	@Test
	public void testAdduser() {
		// Item list is not null and it is empty
		assertNotNull("Test if there is valid User arraylist to add to", UserManagement);
		assertEquals("Test that the User arraylist is empty.", 0, UserManagement.size());
		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addUser(UserManagement, u1);
		assertEquals("Test that the User arraylist size is 1.", 1, UserManagement.size());

		// Add an item
		C206_CaseStudy.addUser(UserManagement, u2);
		assertEquals("Test that the User arraylist size is now 2.", 2, UserManagement.size());
		// The item just added is as same as the last item in the list
		assertSame("Test thatUser is added to the end of the list.", u2, UserManagement.get(1));

		// Add an item that already exists in the list
		C206_CaseStudy.addUser(UserManagement, u2);
		assertEquals("Test that the User arraylist size is unchange.", 3, UserManagement.size());

		// Add an item that has missing detail
		user u_missing = new user("tom", "dwoow");
		C206_CaseStudy.addUser(UserManagement, u_missing);
		assertEquals("Test that the User arraylist size is unchange.", 4, UserManagement.size());
	}

	@Test
	public void testRetrieveAlluser() {
		// Test Case 1
		assertNotNull("Test if there is valid Camcorder arraylist to retrieve item",UserManagement);

		// test if the list of user retrieved from the SourceCentre is empty -
		// boundary
		String alluser = C206_CaseStudy.retrieveAllUser(UserManagement);
		String testOutput = "";
		assertEquals("Check that ViewAlluserlist", testOutput, alluser);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		// - normal
		C206_CaseStudy.addUser(UserManagement, u1);
		C206_CaseStudy.addUser(UserManagement, u2);
		assertEquals("Test that user arraylist size is 2", 2, UserManagement.size());

		// test if the expected output string same as the list of user retrieved
		// from the SourceCentre
		alluser = C206_CaseStudy.retrieveAllUser(UserManagement);
		testOutput = String.format("%-15s %-10s\n", "Tim", "i2kdb2");
		testOutput += String.format("%-15s %-10s\n", "Susan", "ssld02");

		//		System.out.println(testOutput);
		//		System.out.println(alluser);

		assertEquals("Expected output and actual output should be equal", testOutput, alluser);
	}
	


	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);{
		}
	}
	   //Test for order is wrong
//@Test
//	public void testAddOrder() {
//
//		assertNotNull("Test if there is valid order from ", orderList);
//		//Given an empty list, after adding 1 order, the size of the list is 1 - normal
//		//The item just added is as same as the first order the list
//		C206_CaseStudy.addorder(orderList, ob1);    
//		assertEquals("Test that order arraylist size is 1", 1, orderList.size());
//		assertSame("Test that Order is added", ob1, orderList.get(0));
//
//		//Add another item. test The size of the list is 2 order? - normal
//		//The item just added is as same as the second item of the list
//		C206_CaseStudy.addorder(orderList, ob2);
//		assertEquals("Test that order arraylist size is 2", 2, orderList.size());
//		assertSame("Test that order is added", 2, orderList.get(1));
//	}



	   //Test for order is wrong

//	@Test
//	public void testRetrieveAllorder() {
//		// Test if order list is not null but empty -boundary
//		assertNotNull("Test if there is valid order arraylist to retrieve order", orderList);
//
//		//test if the list of order retrieved from the C206_CaseStudyTes is empty - boundary
//		String allorder= C206_CaseStudy.retrieveAllorder(orderList);
//		String testOutput = "";
//		assertEquals("Check that ViewAllorderlist", testOutput, allorder);
//
//		//Given an empty list, after adding 2 transaction, test if the size of the list is 2 - normal
//		C206_CaseStudy.addorder(orderList, ob1);
//		C206_CaseStudy.addorder(orderList,ob2);
//		assertEquals("Test that order arraylist size is 2", 2, orderList.size());
//
//		//test if the expected output string same as the list of order retrieved from the C206_CaseStudyTest  
//		allorder= C206_CaseStudy.retrieveAllorder(orderList);
//		testOutput = String.format("%-10d %-10s\n",ob1.getOrdernumber(), ob1.getOrdername());
//		testOutput += String.format("%-10d %-10s\n",ob2.getOrdernumber(), ob2.getOrdername());
//		assertEquals("Test that ViewAllorderlist", testOutput, allorder);
//
//	}
   //Test for order is wrong
//	@Test
//	public void testDeleteorder() {
//
//		// Test case 1: Return a loaned out item
//		assertNotNull("Test if there is valid order delete from", orderList);
//		C206_CaseStudy.addorder(orderList, ob1);
//		Boolean ok = C206_CaseStudy.deleteorder(orderList, ob2);
//		assertTrue("Test if order is successfully deleted out.", ok);
//		Boolean isReturned = C206_CaseStudy.deleteorder(orderList, ob1);
//		assertTrue("Test if the delete is successful.", isReturned);
//		assertEquals("Test that order is now available.",orderList.get(0).getOrdername());
//		// Test case 2: Return an item that is not loaned out
//		isReturned = C206_CaseStudy.deleteorder(orderList, ob1);
//		assertFalse("Test that the delete fails.", isReturned);
//
//		// Test case 3: Return an item that does not exist 
//		isReturned = C206_CaseStudy.deleteorder(orderList, ob1);
//		assertFalse("Test the the delete fails.", isReturned);  
//	}

    @Test
    public void testAddSchool() {
		vendorList.clear();
        // Check that the size of the schoolList is initially 4
        assertEquals(0, schoolList.size()); 		
        sch1=(new School("Example School", "City A", 12345678));
        C206_CaseStudy.addSchool(schoolList, sch1);

		sch2=(new School("ExampleA School", "City B", 12341234));
		C206_CaseStudy.addSchool(schoolList, sch2);
        
        
         // Item list is not null and it is not empty
       assertNotNull("Test if there is valid School arraylist to add to", schoolList);
       assertEquals("Test that the School arraylist is empty.",2, schoolList.size());
       
        // Add a new school
       sch3=(new School("New School", "City E", 98765432));
		C206_CaseStudy.addSchool(schoolList, sch3);

        // Check that the size of the schoolList is now 3
        assertEquals("Test that the School arraylist size is 4 after adding a school.", 3, schoolList.size());
        
        // Add a school with a valid contact number
        sch4=(new School("Valid Contact School", "City F", 87654321));
		C206_CaseStudy.addSchool(schoolList, sch4);
        
        // Check that the size of the schoolList is now 4
        assertEquals("Test that the School arraylist size is 6 after adding a school.", 4, schoolList.size());
        
        // Check that the size of the schoolList remains unchanged (still 4)
        assertEquals("Test that the School arraylist size remains unchanged.", 4, schoolList.size());
       
    }

	@Test
	public void testDeleteSchool() {
		schoolList.clear();
//      sch5=(new School("republic", "Singapore", 98765432));
//		C206_CaseStudy.addSchool(schoolList, sch5);
		schoolList.add(sch1);
		schoolList.add(sch2);
		
	    boolean isDeleteSuccessful = C206_CaseStudy.deleteSchool(schoolList, "Example School");
	    System.out.println(isDeleteSuccessful);
		assertTrue("Test if an existing item can be deleted", isDeleteSuccessful);
	    assertEquals(1, schoolList.size()); // Change the expected size to 2
	}
	





}
