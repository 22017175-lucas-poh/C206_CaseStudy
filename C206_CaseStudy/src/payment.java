public class payment {
  private int paymentid;
  private double amount;
  
public payment(int paymentid, double amount ) {
  this.amount = amount;
  this.paymentid = paymentid;

  
}
/**
 * 
 */

	// TODO Auto-generated constructor stub

public String toString(){
  String output = "";
  // Write your codes here
  
  return output;
}
public int getpaymentid() {
  return paymentid;
}
public void setpaymentid(int paymentid) {
  this.paymentid = paymentid;
}
public double getamount() {
  return amount;
}
public void setamount(double amount) {
  this.amount = amount;
}
}