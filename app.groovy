@Grab('org.thymeleaf:thymeleaf-spring4:2.1.2.RELEASE')

@Controller
class WebApplication {

	@RequestMapping('/')
	String home(Map<String,Object> model) {		
		model['color'] = 'blue'
		return 'index'
	}
}