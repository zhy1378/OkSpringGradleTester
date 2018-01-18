package ok.test.OkSpringGradleTester;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Hans ZHANG, OoKai Tech.
 * @version 1.0.0
 * @since 2017-12-22 09:38
 */
@RestController
public class HomeController {

	/**
	 * Login detection.
	 *
	 * @return
	 */
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView view = new ModelAndView("index");

		return view;
	}

}
