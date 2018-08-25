package com.heapdump.analysis;

import java.util.ArrayList;
import java.util.List;

public class OutOFMemoryHeapDump {

	public static void main(String[] args) {
		List<ObjectForLeak> leak = new ArrayList<>();
		
		while(true) {
			leak.add(new ObjectForLeak());
		}
	}

}
