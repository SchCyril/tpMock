package fr.dta.mock;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		HttpDataService hts = new HttpDataService();
		MyIpService mis = new MyIpService(hts);

		LOGGER.info(mis.getMyIp());
		System.out.println();
	}
}
