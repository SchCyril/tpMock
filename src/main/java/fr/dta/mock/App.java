package fr.dta.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import utils.Main;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args )
    {
        HttpDataService hts = new HttpDataService();
        MyIpService mis = new MyIpService(hts);
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.info(mis.getMyIp());
      
    }
}
