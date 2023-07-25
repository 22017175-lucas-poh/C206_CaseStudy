public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int option = 0;

		while (option != 7) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				UserUI();
			} else if (option == 2) {
				SchoolUI();
			} else if (option == 3) {
				MenuUI();
			} else if (option == 4) {
				OrderUI();
			} else if (option == 5) {
				PaymentUI();
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

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	// for people doing the User


	public static void UserUI() {
		Usermenu();
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

	private static void SchoolUI() {

		Schoolmenu();
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
	// for people doing the Menu

	private static void MenuUI() {

		Menumenu();
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
	public static void Menumenu() {
		C206_CaseStudy.setHeader("Menu");
		System.out.println("1. Add a new menu");
		System.out.println("2. View all menu ");
		System.out.println("3. Delete an existing menu");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}
	// for people doing the Order

	private static void OrderUI() {
		Ordermenu();
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
	public static void Ordermenu() {
		C206_CaseStudy.setHeader("Order");
		System.out.println("1. Add a new Order");
		System.out.println("2. View all Order ");
		System.out.println("3. Delete an existing Order");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}	
	// for people doing the payment

	private static void PaymentUI() {
		Paymentmenu();
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
	}	public static void Vendormenu() {
		C206_CaseStudy.setHeader("Vendor");
		System.out.println("1. Add a new Vendor");
		System.out.println("2. View all Vendor ");
		System.out.println("3. Delete an existing Vendor");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}
	
	
	
}
