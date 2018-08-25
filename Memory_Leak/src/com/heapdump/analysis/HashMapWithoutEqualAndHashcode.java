package com.heapdump.analysis;

import java.util.Map;

public class HashMapWithoutEqualAndHashcode {
	static int count = 0;
	
	public static void main(String[] args) throws InterruptedException {
		
		Map<Object, Object> map = System.getProperties();
		while (true) {
			map.put(new Key("key"), "value");
			count++;
			if(count > 100)
				Thread.sleep(1000000); // to allow GC do its job
		}
	}
}
