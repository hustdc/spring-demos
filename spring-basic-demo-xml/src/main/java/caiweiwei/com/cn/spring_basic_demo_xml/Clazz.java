package caiweiwei.com.cn.spring_basic_demo_xml;

public class Clazz{
    private Integer scoreOfChinese;
    private Integer scoreOfMath;
    private Integer scoreOfEnglish;
    
    public void setScoreOfChinese(Integer scoreOfChinese) {
    	this.scoreOfChinese = scoreOfChinese;
    }
    
    public Integer getScoreOfChinese() {
    	return scoreOfChinese;
    }
    
    public void setScoreOfMath(Integer scoreOfMath) {
    	this.scoreOfMath = scoreOfMath;
    }
    
    public Integer getScoreOfMath() {
    	return scoreOfMath;
    }
    
    public void setScoreOfEnglish(Integer scoreOfEnglish) {
    	this.scoreOfEnglish = scoreOfEnglish;
    }
    
    public Integer getScoreOfEnglish() {
    	return scoreOfEnglish;
    }
	
	public void showScore(String lectureName) {
		// TODO Auto-generated method stub
		if (lectureName.equals("Chinese")) {
			System.out.println("the score of Chinese is" + String.valueOf(scoreOfChinese));
		} else if (lectureName.equals("Math")) {
			System.out.println("the score of Math is" + String.valueOf(scoreOfMath));
		} else if (lectureName.equals("English")) {
			System.out.println("the score of English is" + String.valueOf(scoreOfEnglish));
		}
	}
}
