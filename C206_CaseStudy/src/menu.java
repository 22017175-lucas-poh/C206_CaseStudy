/*
		 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name:lucas
 * Student ID: {22017175}
 * Class: {W65E}
 * Date/Time created: Tuesday 25-07-2023 15:11
 */

/**
 * @author lucas
 *
 */
public class menu {
	private String itemname;
	private int quantity;
	private String specification;
	public menu(String itemname, int quantity, String specification) {
		this.itemname = itemname;
		this.quantity = quantity;
		this.specification = specification;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	
	
		
}	
