package com.spring.Spring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Impl.JavaTrainer;
import com.spring.Impl.SqlTrainer;

public class App {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("beans.xml");
    JavaTrainer jt = (JavaTrainer)cx.getBean("jt");
    SqlTrainer st = (SqlTrainer)cx.getBean("st");
    
    jt.giveMessage();
    st.giveMessage();

  }
}
