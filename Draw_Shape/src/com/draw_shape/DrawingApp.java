package com.draw_shape;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by Admin on 19.06.2017.
 */
public class DrawingApp {
    public static void main(String[] args) {

        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring"));
        Shape triangle = (Shape) factory.getBean("triangle");
        triangle.draw();
        Shape circle = (Shape) factory.getBean("circle");
        circle.draw();

    }
}
