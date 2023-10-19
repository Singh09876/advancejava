package com.rays.User;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import com.rays.marksheet1.MarksheetBean;
import com.rays.marksheet1.MarksheetModel;

public class TestUser {
	
	
	
	public static void main(String[] args) throws Exception {
		
	//testAdd();
	testSearch();
		}

	
	
	
	private static void testAdd() throws Exception{
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		
		UserBean bean = new UserBean();
		 bean.setFirstName("virat");
		bean.setLastName("koholi");
		bean.setLoginId("virat77747@gmail.com");
		bean.setPassword("5959");
		bean.setDob(sdf.parse("1992-09-15"));
		bean.setAddress("indore");
		
		UserModel model= new UserModel();
		model.add(bean);
	}
	
	

	private static void testSearch() throws Exception {
		UserBean bean = new UserBean();
		

		bean.setFirstName("a");
	
		UserModel model = new UserModel();
		List list = model.search(null, 2, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (UserBean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.println("\t" + bean.getDob());
			System.out.println("\t" + bean.getAddress());
			
			
			


		}}
	
	
	
	
	
	
	
	
	
}
