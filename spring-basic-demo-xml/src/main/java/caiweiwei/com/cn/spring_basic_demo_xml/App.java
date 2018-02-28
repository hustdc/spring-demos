package caiweiwei.com.cn.spring_basic_demo_xml;

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
        
        ApplicationContext cx = new ClassPathXmlApplicationContext("beans01.xml");
        ChineseTeacher teacherOfChinese = (ChineseTeacher) cx.getBean("teacherOfChinese");
        EnglishTeacher teacherOfEnglish = (EnglishTeacher) cx.getBean("teacherOfEnglish");
        
        teacherOfChinese.showScores();
        teacherOfEnglish.showScores();
    }
}
