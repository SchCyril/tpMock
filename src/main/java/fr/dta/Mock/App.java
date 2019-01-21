package fr.dta.Mock;

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
        System.out.println(mis.getMyIp());
    }
}
