package com.heapdump.analysis;

import java.util.ArrayList;
import java.util.Random;

public class StaticObjectReference {

	public static final ArrayList<Double> list = new ArrayList<Double>(1000000);

	public static void main(String[] args) throws InterruptedException {

		Random random = new Random();
		for (int i = 0; i < 1000000; i++) {
			list.add(random.nextDouble());
		}
		System.gc();
		Thread.sleep(10000); // to allow GC do its job
	}

}
