package com.rays.User1;

import java.text.SimpleDateFormat;

import com.rays.User.UserBean;

public class TestUser {
	
	public static void main(String[] args) throws Exception {
		//testAdd();
			testUpdate();
			testsearch();

	}
	 private static void testsearch() {
		
		
	}
	private static void testUpdate()  throws Exception{
		 
		 
		 
		 SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd")	;
		 UserModel model = new UserModel();
		UserBean bean = model.findById(9);
		bean.setFirstName("gopal");
		bean.setLastName("malviya");
		bean.setLoginId("gopal@gmail.com");

		model.update(bean);

		 
	}
	
	
	 private static void testAdd() throws Exception {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			UserBean bean = new UserBean();

			bean.setFirstName("Hritika");
			bean.setLastName("Sahu");
			bean.setLoginId("hritik@gmail.com");
			bean.setPassword("123");
			bean.setDob(sdf.parse("1998-09-01"));
			bean.setAddress("indore");

			UserModel model = new UserModel();
			model.add(bean);

		}
}
