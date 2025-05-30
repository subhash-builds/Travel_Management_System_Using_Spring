package com.travel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.travel.model.Flight;
import com.travel.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/travel/files/travelconfig.xml");
    	
    	User user=applicationContext.getBean(User.class);
    	Flight flight=applicationContext.getBean(Flight.class);
    	
    	user.setRedbus(flight);
    	
    	user.reachDestination();//NullPointerException(before adding implementation class , interface bean is empty)
    	//so we need to create object for interface first.
    	
    	
    }
}
