package com.alonsoruibal.chess;

public class WinningChessSacrificesAndCombinations extends EpdTest {

	public void testMyEpd() {
		long time = processEpdFile(this.getClass().getResourceAsStream("/wcsac.epd"), 5000);
		double timeSeconds = time / 1000;
		System.out.println("time in seconds = " + timeSeconds);
	}
}