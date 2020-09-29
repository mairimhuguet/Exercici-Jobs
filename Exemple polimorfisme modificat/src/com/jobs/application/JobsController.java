package com.jobs.application;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.IPaymentRate;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();

	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee Bossemployee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(Bossemployee);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee ManagerEmployee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(ManagerEmployee);
		
	}


	public void payAllEmployeers() {
		// TODO Auto-generated method stub
	
	}

	public String getAllEmployees() {
		List<AbsStaffMember> members=new ArrayList<>();
		members = repository.getAllMembers();
		
		String allEmployees = new String();
		
		for (int i = 0; i < members.size(); i++) {
			allEmployees = allEmployees + " \n" + members.get(i).getName();
		}
		
		return allEmployees;
	}

	public void createVolunteer(String name, String address, String phone) throws Exception{
		Volunteer volunteer = new Volunteer (name, address, phone, "unpayed");
		repository.addMember(volunteer);
		// TODO Auto-generated method stub
		
	}
	
	
	
}
