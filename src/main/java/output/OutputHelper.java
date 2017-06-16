package output;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import output.IOutputGenerator;

@Component
public class OutputHelper {

	IOutputGenerator outputGenerator;

	public void generateOutput() {
		outputGenerator.generateOutput();
	}

	@PostConstruct
	public void postConstructHelper() {
		//post construct logic
		System.out.println("Helper::postConstructOperation called" + outputGenerator);
	}
	
	@PreDestroy
	public void preDestroyHelper() {
		//post construct logic
		System.out.println("Helper::preDestroyOperation called");
	}
	
	@Autowired
	public OutputHelper(@Qualifier("csvOutputGenerator") IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}

}