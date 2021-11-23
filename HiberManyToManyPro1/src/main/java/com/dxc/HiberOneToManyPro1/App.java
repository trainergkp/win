package com.dxc.HiberOneToManyPro1;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dxc.HiberOneToManyPro1.persist.Address;
import com.dxc.HiberOneToManyPro1.persist.Employee;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hibernate mapping Many To Many " );
        System.out.println(".......................................");
        Configuration conf=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=conf.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        Employee e1=new Employee();
        e1.setEmpcode(1002);
        e1.setEmpname("Anil");
        e1.setDesignation("Clerk");
        Address a1=new Address();
        a1.setHno(321);
        a1.setColony("Mangolpuri");
        a1.setCity("Delhi");
        Address a2=new Address();
        a2.setHno(7685);
        a2.setColony("Rajiv");
        a2.setCity("Gurugram");
        List<Address> list=new ArrayList<Address>();
        list.add(a1);
        list.add(a2);
        e1.setAddress(list);
        session.save(e1);
        t.commit();
        System.out.println("Done");
    }
}
