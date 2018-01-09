package com.bookstore.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KRConstants {
	
	public final static String KR = "KR";
	
	public final static Map<String, String> mapOfKRStates = new HashMap<String, String>(){
		{
			put("서울특별시", "SEO");
			put("인천광역시", "ICC");
			put("경기도", "KKD");
			put("강원도", "KWD");
			put("충청북도", "CCND");
			put("충청남도", "CCSD");
			put("경상북도", "KSND");
			put("경상남도", "KSSD");
			put("경상남도", "KSSD");
			put("제주특별시", "JEJU");
		}
	};
	
	public final static List<String> listOfKRStatesCode = new ArrayList<>(mapOfKRStates.keySet());
	public final static List<String> listOfKRStatesName = new ArrayList<>(mapOfKRStates.values());
}
