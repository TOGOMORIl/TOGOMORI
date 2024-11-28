package Exe_1_QA_2024_1.Exe_1_QA_2024_1;

public class question4 {
	public static String compare(int a,int b, String mod) {
		switch(mod) {
		case "regular":
		if(a<b)
			return "B";
		else
			return "A";
		
		case "negative":
			
			if(-a<-b)
				return "B";
			else
				return "A";
			//code block
		case "reciprocal":
			//code block
			break;
			default:
		}
		return mod;
	
		
		
		
	}

}
