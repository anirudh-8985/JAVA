
package palindrome.anirudh;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.ani.*;


@RestController
public class ServiceController{

	@PostMapping("/palindrome")
	public String service(@RequestParam Map<String,String> input){

		String lsp = (input.get("string"));
		App app = new App();

		lsp = app.palindrome(lsp);

		return (lsp);
	}
}



