package com.rays.marksheet1;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {
		
		
		
		// testAdd();
		// testUpdate();
		// testDelete();
		// testFindById();
         //  testSearch();

		
	}
	
	private static void testSearch() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		

		bean.setName("a");
		bean.setRollNo(101);
		MarksheetModel model = new MarksheetModel();
		List list = model.search(null, 1, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (MarksheetBean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());

		}}
	
	
	private static void testAdd() throws Exception {

		MarksheetBean bean = new MarksheetBean();
        
		bean.setName("piyush");
		 bean.setRollNo(106);
		bean.setPhysics(93);
		bean.setChemistry(35);
		bean.setMaths(71);

		MarksheetModel model = new MarksheetModel();

		model.add(bean);

	}
	
	
	
	
	private static void testFindById() throws Exception {

		MarksheetModel model = new MarksheetModel();

		MarksheetBean bean = model.findById(4);

		if (bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRollNo());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemistry());
			System.out.println("\t" + bean.getMaths());

		} else {

			System.out.println("ID does not exist...!!!");

		}

	}

	private static void testDelete() throws Exception {

		MarksheetModel model = new MarksheetModel();

		model.delete(6);

	}

	private static void testUpdate() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		bean.setId(5);
		bean.setName("gabbar");
		bean.setRollNo(114);
		bean.setPhysics(23);
		bean.setChemistry(45);
		bean.setMaths(10);

		MarksheetModel model = new MarksheetModel();

		model.update(bean);
	}


	
	
	
}
