package caiweiwei.com.cn.spring_basic_demo_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Deng {
	@Autowired
	private Pig pig;
	    
	public Pig getPig() {
	    return pig;
	}
	public void setPig(Pig pig) {
	    this.pig = pig;
	}
	    
	public String post(){
	    return "Deng bought a " + pig.toString();
	}
}
