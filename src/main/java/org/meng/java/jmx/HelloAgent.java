package org.meng.java.jmx;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

public class HelloAgent {

	public static void main(String[] args) throws Exception {
		MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
		ObjectName oname = new ObjectName("org.meng.java.jmx:type=Hello");
		Hello mbean = new Hello();
		mbs.registerMBean(mbean, oname);
		System.out.println("waiting forever");
		Thread.sleep(Long.MAX_VALUE);
	}

}
