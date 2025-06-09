package com.travel;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.travel.model.Bus;
import com.travel.model.Flight;
import com.travel.model.Train;
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
    	
    	System.out.println(applicationContext.getBeanDefinitionCount());
    	
    	System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
    	
    	
    	User user=applicationContext.getBean(User.class);
    	
    	Flight flight=applicationContext.getBean(Flight.class);
 
    	
    	Bus bus=applicationContext.getBean(Bus.class);
    	
    	Train train =applicationContext.getBean(Train.class);
    	
    	//user.setRedbus(flight);//here jvm is injection object to interface , but i need to make ioc container to do it.
    	//to i need to use propery tag in xml config, property tag is due to iserting values using setter, if we insert use constructor we use other tags.
    	//**** Note: In Spring configuration, we use the <property> tag inside a <bean> to inject dependencies or initialize properties.

    	//About dependency injection can be finished by ioc container.
    	
    	//So, we dont need user.setRedbus(flight);
    	
    	user.reachDestination();//NullPointerException(before adding implementation class , interface bean is empty)
    	//so we need to create object for interface first.
    	
    	
    }
}
