package com.bookstore.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KRConstants {
	
	public final static String KR = "KR";
	
	public final static Map<String, String> mapOfKRStates = new HashMap<String, String>(){
		{
			put("SE", "서울");
			put("IN", "인천");
			put("KY", "경기");
			put("CS", "충청남도");
			put("CN", "충청북도");
			put("KS", "경상도");
			put("BS", "부산");
		}
	};
	
	public final static List<String> listOfKRStatesCode = new ArrayList<>(mapOfKRStates.keySet());
	public final static List<String> listOfKRStatesName = new ArrayList<>(mapOfKRStates.values());
}
