package output;

import org.springframework.stereotype.Component;

@Component
public class JsonOutputGenerator implements IOutputGenerator
{
	public void generateOutput(){
		System.out.println("This is Json Output Generator");
	}
}