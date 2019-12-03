package com.codeclan.example.FilesHomework;

import com.codeclan.example.FilesHomework.models.Folder;
import com.codeclan.example.FilesHomework.models.User;
import com.codeclan.example.FilesHomework.repositories.FileRepository;
import com.codeclan.example.FilesHomework.repositories.FolderRepository;
import com.codeclan.example.FilesHomework.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesHomeworkApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createUser(){

		User cameron = new User("cameron");
		userRepository.save(cameron);

		Folder pictures = new Folder("pictures", cameron);
		folderRepository.save(pictures);
	}

//	@Test
//	public void addEmployeesAndProjects(){
//		Department department = new Department("sales");
//		departmentRepository.save(department);
//
//		Employee employee1 = new Employee("steve", "jobs", 1, department);
//		employeeRepository.save(employee1);
//
//		Project project1 = new Project("iphone", 2);
//		projectRepository.save(project1);
//
//		project1.addEmployee(employee1);
//		projectRepository.save(project1);
//	}


}
