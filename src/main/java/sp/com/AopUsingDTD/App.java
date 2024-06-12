package sp.com.AopUsingDTD;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sp.com.services.BankTransation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
		ApplicationContext context=new ClassPathXmlApplicationContext("/sp/com/resource/ApplicationContext.xml");
		BankTransation std=(BankTransation) context.getBean("ProxyID");
		std.transactionUsingUPI();
		
	
		std.transactionUsiwallnet();
		std.transactionUsingInternBanking();
    }
}
