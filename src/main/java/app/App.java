package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.SpringConfig;
import output.OutputHelper;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		OutputHelper output = (OutputHelper) appContext.getBean(OutputHelper.class);
    	output.generateOutput();
    	((AbstractApplicationContext) appContext).close();
	}
}