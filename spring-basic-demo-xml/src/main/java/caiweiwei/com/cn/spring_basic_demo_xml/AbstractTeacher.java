package caiweiwei.com.cn.spring_basic_demo_xml;

import java.util.List;

public abstract class AbstractTeacher {
	private List<Clazz> clazzs;
    public void setClazzs(List<Clazz> clazzs) {
    	this.clazzs = clazzs;
    }
	public List<Clazz> getClazzs() {
		return clazzs;
	}
	abstract void showScores();
}
