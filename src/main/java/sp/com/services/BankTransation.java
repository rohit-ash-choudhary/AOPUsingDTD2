package sp.com.services;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class BankTransation {
	
	public void transactionUsingUPI() {
		
		System.out.println("=========Business Logic : UPI Payment==============");
	}
	/*
	public void Demo() {
		NameMatchMethodPointcut ct=new NameMatchMethodPointcut();
		DefaultPointcutAdvisor dp=new DefaultPointcutAdvisor();
		dp.setAdvice(null);
		dp.setPointcut(ct);
		ct.setMappedName(null);
	}
*/
		public void transactionUsingInternBanking() {
				
				System.out.println("==========Business Logic : InternBanking=====");
			}
			
		public void transactionUsiwallnet() {
				
				System.out.println("==========Business Logic : Wallet Transcation========");
			}
}
