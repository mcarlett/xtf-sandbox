package org.example;

import cz.xtf.core.openshift.OpenShifts;

public class Downloader {

	public static String downloadOCClient() {
		return OpenShifts.getBinaryPath();
	}
}
