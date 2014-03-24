@Grab('spring-boot-starter-thymeleaf')

@Controller
class WebApplication {

	@RequestMapping('/')
	String home(Map<String,Object> model) {		
		model['color'] = 'blue'
		return 'index'
	}
}
