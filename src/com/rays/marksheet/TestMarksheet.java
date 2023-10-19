package com.rays.marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {

	
	public static void main(String[] args) throws Exception {

		 //testAdd();
//        testUpdate();
		// testDelete();
		// testFindById();
		//testSearch();

	}
	private static void testSearch() throws Exception {

		MarksheetModel model = new MarksheetModel();

		List list = model.search();

		Iterator it = list.iterator();

		while (it.hasNext()) {

			MarksheetBean bean = (MarksheetBean) it.next();

			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemestry());
			System.out.println("\t" + bean.getMaths());
			System.out.print("\t" + bean.getRollNo());


		}

	}

	private static void testFindById() throws Exception {

		MarksheetModel model = new MarksheetModel();

		MarksheetBean bean = model.findById(14);

		if (bean != null) {
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemestry());
			System.out.println("\t" + bean.getMaths());
			System.out.print("\t" + bean.getRollNo());


		} else {

			System.out.println("ID does not exist...!!!");

		}

	}

	private static void testDelete() throws Exception {

		MarksheetModel model = new MarksheetModel();

		model.delete(14);

	}

	private static void testUpdate() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		
		bean.setId(23);
		bean.setName("aryan");
		bean.setPhysics(53);
		bean.setChemestry(45);
		bean.setMaths(60);
		bean.setRollNo(101);
		



		MarksheetModel model = new MarksheetModel();

		model.update(bean);
	}

	private static void testAdd() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		bean.setId(20);
		bean.setName("akul");
		bean.setPhysics(73);
		bean.setChemestry(55);
		bean.setMaths(34);
		bean.setRollNo(119);
		
		MarksheetModel model = new MarksheetModel();

		model.add(bean);

	}


	
}
