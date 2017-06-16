package output;
import org.springframework.stereotype.Component;
@Component
public class CsvOutputGenerator implements IOutputGenerator{
	public void generateOutput(){
			System.out.println("This is Csv Output Generator");
		}
	
}
