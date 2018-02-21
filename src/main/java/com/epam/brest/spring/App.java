package com.epam.brest.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");


        Human citizen = applicationContext.getBean("citizen", Citizen.class);
        citizen.speak();

        Human superMan = applicationContext.getBean("superMan", SuperMan.class);
        superMan.speak();

        Developer javaDev = applicationContext.getBean("javaDev", Developer.class);
        System.out.println(javaDev);
        javaDev.setWorkPlace("Minsk");
        System.out.println(javaDev);
        Developer javaDev1 = applicationContext.getBean("javaDev1", Developer.class);
        System.out.println(javaDev1);

        Progect progect = applicationContext.getBean("progect", Progect.class);
        System.out.println(progect);

        Manager manager2 = applicationContext.getBean("manager2", Manager.class);
        System.out.println(manager2);

        Singelton singelton = applicationContext.getBean("singelton", Singelton.class);
        System.out.println(singelton.toString());
    }
}
