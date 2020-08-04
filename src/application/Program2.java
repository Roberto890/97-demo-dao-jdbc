package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: Department findById ====");
		Department dpId = departmentDao.findById(4);
		System.out.println(dpId);
		
		System.out.println("\n==== TEST 2: Department insert ====");
		Department dp = new Department(null, "Putaria");
		departmentDao.insert(dp);
		
		System.out.println("\n==== TEST 3: Department update ====");
		dpId = departmentDao.findById(7);
		dpId.setName("Ex-putaria");
		departmentDao.update(dpId);
	
		System.out.println("\n==== TEST 4: Department deleteById ====");
		System.out.print("Number of department to be deleted: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		
		System.out.println("\n==== TEST 5: Department findAll ====");
		List<Department> listdep = departmentDao.findAll();
		for (Department obj : listdep) {
			System.out.println(obj);
		}
		
	}

}
