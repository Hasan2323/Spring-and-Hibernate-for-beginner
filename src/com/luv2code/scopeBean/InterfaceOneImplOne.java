package com.luv2code.scopeBean;

/**
 * @Author Muhammad Saimon
 * @since Oct 10/9/20 5:17 PM
 */

public class InterfaceOneImplOne implements InterfaceOne {

    @Override
    public void interfaceOneMethodOne() {
        System.out.println("I am from interfaceOneImplOne method one");
    }

    @Override
    public void interfaceOneMethodTwo() {
        System.out.println("I am from interfaceOneImplOne method two");
    }
}
