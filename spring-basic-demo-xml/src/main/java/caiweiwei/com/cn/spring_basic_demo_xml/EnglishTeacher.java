package caiweiwei.com.cn.spring_basic_demo_xml;

public class EnglishTeacher extends AbstractTeacher {
	
	public void showScores() {
		// TODO Auto-generated method stub
		for (Clazz clazz : getClazzs()) {
			clazz.showScore("English");
		}
	}
}
