package fr.dta.mock;

import java.io.IOException;

import org.apache.http.client.fluent.Request;

public class HttpDataService {
	private static String url = "http://jsonip.com";

	public String getJsonIp() {
		try {
			return Request.Get(url).execute().returnContent().toString();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
