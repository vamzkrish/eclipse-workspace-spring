package com.task;

public class Today {
	private static Today tday = null;

	private Today() {

	}

	public static Today run() {
		if (tday == null) {
			tday = new Today();
		}
		return tday;
	}
}
