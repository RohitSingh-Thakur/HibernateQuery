package root;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure().addAnnotatedClass(EmployeeData.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		try {

//			EmployeeData e1 = new EmployeeData(1, "Rohit", "90000", "IT");
//			EmployeeData e2 = new EmployeeData(2, "Sanjana", "85000", "Finance");
//			EmployeeData e3 = new EmployeeData(3, "Ankit", "78000", "HR");
//			EmployeeData e4 = new EmployeeData(4, "Priya", "95000", "IT");
//			EmployeeData e5 = new EmployeeData(5, "Amit", "72000", "Sales");
//			EmployeeData e6 = new EmployeeData(6, "Neha", "80000", "Marketing");
//			EmployeeData e7 = new EmployeeData(7, "Raj", "87000", "Finance");
//			EmployeeData e8 = new EmployeeData(8, "Meena", "76000", "HR");
//			EmployeeData e9 = new EmployeeData(9, "Vikram", "91000", "IT");
//			EmployeeData e10 = new EmployeeData(10, "Kiran", "83000", "Sales");
//
//			List<EmployeeData> list = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
//			for (EmployeeData employeeData : list) {
//				session.save(employeeData);
//			}
//
//			session.beginTransaction().commit();
//
//			// Get All Records
//
//			Query query1 = session.createQuery("FROM EmployeeData");
//			List<EmployeeData> list1 = query1.list();
//			for (EmployeeData employeeData : list1) {
//				System.out.println(employeeData);
//			}
//
//			// Fetching Single Column using Query
//
//			Query query2 = session.createQuery("SELECT name FROM EmployeeData");
//			List<String> list2 = query2.list();
//			for (String name : list2) {
//				System.out.println(name);
//			}
//
//			// Fetching Multiple Column
//			Query query3 = session.createQuery("SELECT name, department FROM EmployeeData");
//			List<Object[]> list3 = query3.list();
//			for (Object[] objects : list3) {
//				System.out.println(objects[0] + " " + objects[1]);
//			}

//			ProjectionList pl = Projections.projectionList();
//			pl.add(Projections.property("name"));
//			pl.add(Projections.property("salary"));
//
//			Criteria criteria = session.createCriteria(EmployeeData.class);
//			List<Object[]> list = criteria.setProjection(pl).list();
//
//			for (Object[] s : list) {
//				System.out.println(s[0] + " " + s[1]);
//			}
//
//			session.close();

			Query query = session.createQuery("FROM EmployeeData WHERE id= :empId");
			query.setParameter("empId", 2);
			query.list().forEach(s -> System.out.println(s));

			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			session.close();
			sessionFactory.close();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
}
