package com.jobs.persistence;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;

public class EmployeeRepository {

	private static List<AbsStaffMember> members=new ArrayList<>();
	
	public EmployeeRepository(){
		
	}
	
	public List<AbsStaffMember> getAllMembers(){
		return new ArrayList<>(members);
	}
	
	
	public void addMember(AbsStaffMember member) throws Exception{
		if(member==null) throw new Exception("not possible to add empty Employee to repository");
		members.add(member);
	}
	
	
}
