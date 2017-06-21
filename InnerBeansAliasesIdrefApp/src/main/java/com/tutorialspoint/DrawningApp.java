package com.tutorialspoint;

/**
 * Created by Admin on 21.06.2017.
 */
public class DrawningApp {

    public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring");
    Triangle triangle = (Triangle) context.getBean("triangle");
    triangle.draw();
    }

}
