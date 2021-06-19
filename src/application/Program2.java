package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("===Test 1: finbyId Department ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);

		System.out.println("===Test 2: findAll Department ===");
		List<Department> list = new ArrayList<>();
		
		list = departmentDao.findAll();
		
		for(Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("===Test 3: insert Department ===");
		dep.setName("Clothes");
		departmentDao.insert(dep);
		System.out.println("Insert Sucess: Id = " + dep.getId());
		
		System.out.println("===Test 3: update Department ===");	
		dep.setName("Entertainament");
		dep.setId(8);
		departmentDao.update(dep);
		System.out.println("Update sucessfully!");
		
		System.out.println("===Test 4: deleteById Department ===");	
		int id = 10;
		departmentDao.deleteById(id);
		System.out.println("Sucessfully removed id" + id);
		
	}

}
