import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<menu> menuList = new ArrayList<menu>();
		ArrayList<School> schoolList = new ArrayList<School>();
		ArrayList<order> orderList = new ArrayList<order>();
		ArrayList<user> userList = new ArrayList<user>();
		ArrayList<payment> paymentList = new ArrayList<payment>();

		paymentList.add(new payment(1,100.0));
		paymentList.add(new payment(2,200.0));

		
		userList.add(new user("Tim", "i2kdb2"));
		userList.add(new user("Susan", "ssld02"));

		menuList.add(new menu("Spaghetti Bolognese", 2, "Gluten-free pasta"));
		menuList.add(new menu("Fish and Chips", 2, "Tartar sauce on the side"));

		schoolList.add(new School("Changkat changi secondary school", "simei", 67859790));
		schoolList.add(new School("Ngee Ann secondary school", "Tampines", 67844583));

		orderList.add(new order(1, "Spaghetti Bolognese"));
		orderList.add(new order(2, "Fish and Chips"));

		int option = 0;

		while (option != 7) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				UserUI(userList);
			} else if (option == 2) {
				SchoolUI(schoolList);
			} else if (option == 3) {
				MenuUI(menuList);
			} else if (option == 4) {
				OrderUI(orderList);
			} else if (option == 5) {
				PaymentUI(paymentList);
			} else if (option == 6) {
				VendorUI();
			} else if (option == 7) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}
	}

	public static void menu() {
		C206_CaseStudy.setHeader("ENTER SOMETHING HERE");
		System.out.println("1. Enter for user");
		System.out.println("2. Enter for school");
		System.out.println("3. Enter for menu");
		System.out.println("4. Enter for order");
		System.out.println("5. Enter for payment");
		System.out.println("6. Enter for vendor");
		System.out.println("7. Quit");
		Helper.line(80, "-");
	}

	// for people doing the User

	public static void UserUI(ArrayList<user> userList) {
		Usermenu();
		int option = 0;
		while (option != 4) {

			option = Helper.readInt("Enter an option > ");
			if (option == 1) {
				user u = inputuser();
				addUser(userList, u);
				System.out.println("user added");

			} else if (option == 2) {
				viewAllUser(userList);

			} else if (option == 3) {
				user u = inputuser();
				removeUser(userList, u);
				System.out.println("user removed");

			} else if (option == 4) {
			} else {
				System.out.println("Invalid option");
			}

		}
	}

	public static void Usermenu() {
		C206_CaseStudy.setHeader("User");
		System.out.println("1. Add a new user");
		System.out.println("2. View all users ");
		System.out.println("3. Delete an existing user");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}
	// for people doing the School

	public static void Schoolmenu() {
		C206_CaseStudy.setHeader("School");
		System.out.println("1. Add a new school");
		System.out.println("2. View all school ");
		System.out.println("3. Delete an existing school");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	private static void SchoolUI(ArrayList<School> schoolList) {

		int option = 0;
		while (option != 4) {
			Schoolmenu();

			option = Helper.readInt("Enter an option > ");
			if (option == 1) {
				School school = inputSchool();
				schoolList.add(school);
				System.out.println("School added");
			} else if (option == 2) {
				viewAllSchools(schoolList);

			} else if (option == 3) {
			} else if (option == 4) {
			} else {
				System.out.println("Invalid option");
			}

		}

	}
	// for people doing the Menu

	private static void MenuUI(ArrayList<menu> menuList) {

		int option = 0;
		while (option != 4) {
			Menumenu();

			option = Helper.readInt("Enter an option > ");
			if (option == 1) {
				menu mc = inputmenu();
				addmenu(menuList, mc);
				System.out.println("menu added");
			} else if (option == 2) {
				viewAllMenus(menuList);
			} else if (option == 3) {
				String menuNameToDelete = Helper.readString("Enter menu item that is to be deleted > ");
				deleteMenu(menuList, menuNameToDelete);

			} else if (option == 4) {
			} else {
				System.out.println("Invalid option");
			}

		}
	}

	public static void Menumenu() {
		C206_CaseStudy.setHeader("Menu");
		System.out.println("1. Add a new menu");
		System.out.println("2. View all menu ");
		System.out.println("3. Delete an existing menu");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}
	// for people doing the Order

	private static void OrderUI(ArrayList<order> orderList) {
		int option = 0;
		while (option != 4) {
			Ordermenu();

			option = Helper.readInt("Enter an option > ");
			if (option == 1) {
				order ob = inputorder();
				addorder(orderList, ob);
				System.out.println("Order added");
			} else if (option == 2) {
				viewAllOrder(orderList);

			} else if (option == 3) {
				order ob = inputorder();
				deleteorder(orderList, ob);
			} else if (option == 4) {
			} else {
				System.out.println("Invalid option");
			}

		}
	}

	public static void Ordermenu() {
		C206_CaseStudy.setHeader("Order");
		System.out.println("1. Add a new Order");
		System.out.println("2. View all Order ");
		System.out.println("3. Delete an existing Order");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}
	// for people doing the payment

	private static void PaymentUI(ArrayList<payment> paymentList) {
		int option = 0;
		while (option != 4) {
			Paymentmenu();

			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				payment pc = inputPayment();
				addPayment(paymentList, pc);
			  } else if (option == 2) {
				  viewAllpayment(paymentList);
			} else if (option == 3) {
				int paymentIdToDelete=Helper.readInt("Enter the ID to be deleted > ");
				deletepayment(paymentList, paymentIdToDelete);
			} else if (option == 4) {
			} else {
				System.out.println("Invalid option");
			}

		}
	}

	public static void Paymentmenu() {
		C206_CaseStudy.setHeader("Payment");
		System.out.println("1. Add a new payment");
		System.out.println("2. View all payment ");
		System.out.println("3. Delete an existing payment");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	// for people doing the vendor
	private static void VendorUI() {
		Vendormenu();
		int option = 0;
		while (option != 4) {

			option = Helper.readInt("Enter an option > ");
			if (option == 1) {

			} else if (option == 2) {

			} else if (option == 3) {
			} else if (option == 4) {
			} else {
				System.out.println("Invalid option");
			}

		}
	}

	public static void Vendormenu() {
		C206_CaseStudy.setHeader("Vendor");
		System.out.println("1. Add a new Vendor");
		System.out.println("2. View all Vendor ");
		System.out.println("3. Delete an existing Vendor");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	public static menu inputmenu() {
		String tag = Helper.readString("Enter an menu name > ");
		int description = Helper.readInt("Enter quantity > ");
		String zoom = Helper.readString("Enter Enter the description > ");

		return new menu(tag, description, zoom);

	}

	public static void addmenu(ArrayList<menu> menuList, menu mc) {
		// TODO Auto-generated method stub
		menu item;
		for (int i = 0; i < menuList.size(); i++) {
			item = menuList.get(i);
			if (item.getItemname().equalsIgnoreCase(mc.getItemname()))
				return;
		}
		if ((mc.getItemname().isEmpty()) || (mc.getSpecification().isEmpty())) {
			return;
		}
		menuList.add(mc);

	}

	private static void viewAllMenus(ArrayList<menu> menuList) {
		System.out.println("--- All Menus ---");
		for (menu mc : menuList) {
			String menuDetails = String.format("Item: %-20s Quantity: %-5d Specification: %s", mc.getItemname(),
					mc.getQuantity(), mc.getSpecification());
			System.out.println(menuDetails);
		}
	}

	public static boolean deleteMenu(ArrayList<menu> menuList, String menuNameToDelete) {
		boolean isDeleted = false;
		for (int i = 0; i < menuList.size(); i++) {
			if (menuList.get(i).getItemname().equalsIgnoreCase(menuNameToDelete)) {
				menuList.remove(i);
				System.out.println("Menu with name '" + menuNameToDelete + "' has been deleted.");
				isDeleted = true;
				break;
			}
		}
		if (!isDeleted) {
			System.out.println("Menu with name '" + menuNameToDelete + "' was not found.");
		}
		return isDeleted;
	}

	public static School inputSchool() {
		String name = Helper.readString("Enter school name: ");
		String location = Helper.readString("Enter school location: ");
		int contactNumber = 0;
		boolean validContact = false;

		while (!validContact) {
			contactNumber = Helper.readInt("Enter contact number (8 digits): ");
			if (String.valueOf(contactNumber).length() == 8) {
				validContact = true;
			} else {
				System.out.println("Contact number must have exactly 8 digits.");
			}
		}

		return new School(name, location, contactNumber);
	}

	public static boolean deleteSchool(ArrayList<School> schoolList, String schoolName) {
		for (School school : schoolList) {
			if (school.getName().equalsIgnoreCase(schoolName)) {
				schoolList.remove(school);
				return true;
			}
		}
		return false;
	}

	public static void viewAllSchools(ArrayList<School> schoolList) {
		System.out.println("All Schools:");
		for (School sc : schoolList) {
			String schooldetails = String.format("Name: %-20s 	Location: %-20s 	Contact Number: %-10d",
					sc.getName(), sc.getLocation(), sc.getContactNumber());
			System.out.println(schooldetails);
		}
	}

	public static String retrieveAllorder(ArrayList<order> orderList) {
		String output = "";
		String name = "";

		for (int i = 0; i < orderList.size(); i++) {
			name = orderList.get(i).getOrdername();
			int number = orderList.get(i).getOrdernumber();
			output += String.format("%-80s %-20d \n", name, number);
		}
		return output;
	}

	public static order inputorder() {
		int number = Helper.readInt("Enter number > ");
		String name = Helper.readString("Enter name > ");

		order ob = new order(number, name);
		return ob;

	}

	public static void addorder(ArrayList<order> orderList, order ob) {
		order item;
		for (int i = 0; i < orderList.size(); i++) {
			item = orderList.get(i);
			if (item.getOrdername().equalsIgnoreCase(ob.getOrdername()) || ob.getOrdername().isEmpty()) {
				return;
			}
		}
		orderList.add(ob);
	}

	private static void viewAllOrder(ArrayList<order> orderList) {
		System.out.println("--- All Order ---");
		for (order ob : orderList) {
			String orderDetails = String.format("Order Number: %-20d Order Name: %-5s ", ob.getOrdernumber(),
					ob.getOrdername());
			System.out.println(orderDetails);
		}
	}

	public static boolean deleteorder(ArrayList<order> orderList, order ob) {
		int number = Helper.readInt("Enter number > ");
		String name = Helper.readString("Enter name > ");

		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getOrdername() == name || orderList.get(i).getOrdernumber() == number) {

				orderList.remove(i);
				return true;
			}
		}
		return false;

	}

	public static String retrieveAllUser(ArrayList<user> userList) {
		String output = "";

		for (int i = 0; i < userList.size(); i++) {

			output += String.format("%-15s %-15s\n ", userList.get(i).getUserame(), userList.get(i).getPassword());
		}
		return output;
	}

	public static void viewAllUser(ArrayList<user> userList) {
		C206_CaseStudy.setHeader("USER LIST");
		String output = String.format("%-15s %-15s\n ", "USERNAME", "PASSWORD");
		output += retrieveAllUser(userList);
		System.out.println(output);
	}

	private static void setHeader(String header) {
		// TODO Auto-generated method stub
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}


	public static user inputuser() {
		String username = Helper.readString("Enter username > ");
		String password = Helper.readString("Enter  password > ");

		user u = new user(username, password);
		return u;

	}

	public static void addUser(ArrayList<user> userList, user u) {
		user item;
		for (int i = 0; i < userList.size(); i++) {
			item = userList.get(i);
			if (item.getUserame().equalsIgnoreCase(u.getPassword()))
				return;
		}
		if ((u.getUserame().isEmpty()) || (u.getPassword().isEmpty())) {
			return;
		}
		userList.add(u);
	}

	public static void removeUser(ArrayList<user> userList, user u) {
		user item;
		for (int i = 0; i < userList.size(); i++) {
			item = userList.get(i);
			if (item.getUserame().equalsIgnoreCase(u.getPassword())) {

				return;
			}
			if ((u.getUserame().isEmpty()) || (u.getPassword().isEmpty())) {
				return;
			}
			userList.remove(i);
		}

	}

	public static payment inputPayment() {
	    int paymentId = Helper.readInt("Enter ID > ");
	    double amount = Helper.readDouble("Enter amount of money > ");

	    return new payment(paymentId, amount);
	}

	public static void addPayment(ArrayList<payment> paymentList, payment pc) {
	    for (payment item : paymentList) {
	        if (item.getpaymentid() == pc.getpaymentid()) {
	            return;
	        }
	    }
	    paymentList.add(pc);
	}

	private static void viewAllpayment(ArrayList<payment> paymentList) {
	    System.out.println("--- All Payments ---");
	    for (payment pc : paymentList) {
	        String paymentDetails = String.format("Payment ID: %-10d Amount: %.2f", pc.getpaymentid(), pc.getamount());
	        System.out.println(paymentDetails);
	    }
	}
	public static boolean deletepayment(ArrayList<payment> paymentList, int paymentIdToDelete) {
	    boolean isDeleted = false;
	    for (int i = 0; i < paymentList.size(); i++) {
	        if (paymentList.get(i).getpaymentid() == paymentIdToDelete) {
	            paymentList.remove(i);
	            System.out.println("Payment with ID '" + paymentIdToDelete + "' has been deleted.");
	            isDeleted = true;
	            break;
	        }
	    }
	    if (!isDeleted) {
	        System.out.println("Payment with ID '" + paymentIdToDelete + "' was not found.");
	    }
	    return isDeleted;
	}
	
	
	
	
	
}
