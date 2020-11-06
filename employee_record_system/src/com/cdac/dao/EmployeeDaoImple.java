package com.cdac.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Employee;

@Repository
public class EmployeeDaoImple implements EmployeeDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void insertEmployee(Employee employee) {
		
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(employee);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public void deleteEmployee(int employeeId) {
		
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new Employee(employeeId));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

	@Override
	public Employee selectEmployee(int employeeId) {
		Employee employee = hibernateTemplate.execute(new HibernateCallback<Employee>() {

			@Override
			public Employee doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Employee em = (Employee)session.get(Employee.class, employeeId);
				tr.commit();
				session.flush();
				session.close();
				return em;
			}
		});
		return employee;
	}

	@Override
	public void updateEmployee(Employee employee) {
		
		
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.update(employee);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

	@Override
	public List<Employee> selectAll(int userId) {
		List<Employee> empList = hibernateTemplate.execute(new HibernateCallback<List<Employee>>() {

			@Override
			public List<Employee> doInHibernate(Session session) throws HibernateException {
				
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Employee where userId = ?"); 
				q.setInteger(0, userId);
				List<Employee> li = q.list();
				System.out.println(li);
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
		});
		return empList;
	}

}
