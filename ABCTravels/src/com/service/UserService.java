package com.service;
//Manages user-related operations including new admin registration and user login. It also handles the tracking of invalid login attempts and locks the account after 5 failed attempts.
	import com.abctravels.User;
	import java.util.List;
	import java.util.Map;
	import java.util.Scanner;

	public class UserService {
		private List<User>users;
		private Map<String,Integer> userInvalidLoginAttempt;
		
		public UserService(List<User>users,Map<String,Integer> userInvalidLoginAttempt) {
			this.users=users;
			this.userInvalidLoginAttempt=userInvalidLoginAttempt;
			
		}
		public void registerNewAdmin() {
			Scanner sc =new Scanner(System.in);
			System.out.println("\nNew Admin User Registration");
			
			System.out.println("Enter first name: ");
			String firstname=sc.nextLine();
			
			System.out.println("Enter last name: ");
			String lastname=sc.nextLine();
			
			System.out.println("Enter mobile number: ");
			String mobilenumber=sc.nextLine();
			
			System.out.println("Enter gender: ");
			String gender=sc.nextLine();
			
			System.out.println("Enter ur email id: ");
			String email=sc.nextLine();
			
			System.out.println("Enter password: ");
			String password=sc.nextLine();
			
			if(isUserExists(email)) {
				System.out.println("User with this email:"+email+"already exists");
			}
			
			User newuser =new User(firstname,lastname,mobilenumber,gender,email,password,0,"Active");
			users.add(newuser);
			System.out.println("Registration Successfull");
		
		}
		private boolean isUserExists(String email) {
			for (User user:users) {
				if (user.getemail().equals(email)) {
					return true;
				}
			}
			return false;
		}
		
		public User login() {
			Scanner sc =new Scanner(System.in);
			System.out.println("\n User Login");
			
			System.out.println("Enter email: ");
			String email=sc.nextLine();
			
			System.out.println("Enter password: ");
			String password=sc.nextLine();
			
			for(User user: users) {
				if(user.getemail().equals(email)) {
					Integer existingcount=userInvalidLoginAttempt.getOrDefault(email, null);
					if(existingcount>=5) {
						System.out.println("User account is locked due to multiple attempts");
						return null;
					}
				if (user.getpassword().equals(password)) {
					System.out.println("\n login successfull");
					userInvalidLoginAttempt.put(email, 0);
					return user;
				}else {
					userInvalidLoginAttempt.put(email,existingcount+1);
					System.out.println("\n Invalid credentials,Attempt"+(existingcount+1)+"for email:"+email);
				}
				}
			}
			System.out.println("No User found with email: "+email);
			return null;
		}
		
}
