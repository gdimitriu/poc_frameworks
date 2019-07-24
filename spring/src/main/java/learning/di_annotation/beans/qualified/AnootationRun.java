package learning.di_annotation.beans.qualified;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnootationRun {
    public static void main(String...args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("di_annotation_beans_qualified.xml");
        Subject subject = (Subject)context.getBean("subject");
        subject.taughtBy();
    }
}
