package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		List<Department> list = new ArrayList<>();
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findById ===");
		Department department = departmentDao.findById(4);
		System.out.println(department);
		
		
		System.out.println("\n=== TEST 2: Department findAll ===");
		
		list = departmentDao.findAll();
		for (Department lst : list) {
			System.out.println(lst);
		}	
	}
}
