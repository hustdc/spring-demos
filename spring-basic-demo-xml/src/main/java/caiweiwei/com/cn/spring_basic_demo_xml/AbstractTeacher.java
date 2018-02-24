package caiweiwei.com.cn.spring_basic_demo_xml;

import java.util.ArrayList;

public abstract class AbstractTeacher {
	private ArrayList<Clazz> clazzs;
    public void setClazzs(ArrayList<Clazz> clazzs) {
    	this.clazzs = clazzs;
    }
	public ArrayList<Clazz> getClazzs() {
		return clazzs;
	}
	abstract void showScores();
}
