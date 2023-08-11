public class user {
 public String userame;
 public String password;
 
 public user(String userame, String password) {
  this.userame = userame;
  this.password = password;
 }

 public String getUserame() {
  return userame;
 }
//something here
 public String getPassword() {
  return password;
 }
    public String toString() {
        
   return "Username: " + userame + ", Password: " + password;
     }
 }