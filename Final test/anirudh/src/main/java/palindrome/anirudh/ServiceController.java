
package palindrome.anirudh;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.ani.*;


@RestController
public class ServiceController{

	@PostMapping("/labtest")
	public String service(@RequestParam Map<String,String> input){

		String data = (input.get("data"));
		String option = (input.get("option"));
		String action = (input.get("action"));


		App app = new App();

		data = app.labtest(data,option,action);

		return (data);
	}
}



