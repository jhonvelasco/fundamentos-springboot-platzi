package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithDependenceImplement implements MyBeanWithDependency {

    @Override
    public void printWithDependency() {
        System.out.println("Hola desde la implemenetación de un bean con Dependencia" );
    }
}
