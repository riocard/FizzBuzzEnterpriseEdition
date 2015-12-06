package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.loop;

import org.springframework.stereotype.Service;

@Service
public class LoopInitializer {

	private static final int LOOP_INIT_VALUE = 1;

	/**
	 * @return int
     */
	public int getLoopInitializationPoint() {
		return LoopInitializer.LOOP_INIT_VALUE;
	}
}
