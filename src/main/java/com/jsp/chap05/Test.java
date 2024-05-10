package com.jsp.chap05;

public class Test {

    public static void main(String[] args) {

        JdbcBasic jdbc = new JdbcBasic();

        System.out.println(jdbc.findAll());
//        jdbc.insert(new Person(99, "고길동", 30));
//        jdbc.insert(new Person(200, "김철수", 45));
//        jdbc.insert(new Person(300, "박희희", 70));
    }
}
