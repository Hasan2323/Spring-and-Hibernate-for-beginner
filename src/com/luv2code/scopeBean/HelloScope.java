package com.luv2code.scopeBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Muhammad Saimon
 * @since Oct 10/9/20 5:21 PM
 */

public class HelloScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");

        InterfaceOne myInterfaceOne = context.getBean("myScope", InterfaceOne.class);

        InterfaceOne myInterfaceTwo = context.getBean("myScope", InterfaceOne.class);

        // check if they are the same
        boolean objReferenceResult = (myInterfaceOne == myInterfaceTwo);
        System.out.println("Equal result : " + objReferenceResult);

        System.out.println("Memory Location of Obj one : " + myInterfaceOne);
        System.out.println("Memory Location of Obj two : " + myInterfaceTwo);


        context.close();
    }
}
