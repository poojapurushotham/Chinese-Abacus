package bina;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Interface for Abacus
 */
public interface Abacus {
	//placeholders for columns of abacus
	
	public int UNIT_BOT=0;
	public int UNIT_TOP=0;
	public int TENS_BOT=0;
	public int TENS_TOP=0;
	public int HUND_BOT=0;
	public int HUND_TOP=0;
	public int THOU_BOT=0;
	
	//map to store the values in each slot of abacus
	public Map<Character,Integer> map = new LinkedHashMap<>();
	
	public boolean insert(String obj);
	public String retrieve();
}