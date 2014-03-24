@RestController
class WebApplication {

	@RequestMapping('/')
	String home(Map<String,Object> model) {		
		model['color'] = 'blue'
		template 'index.html', model
	}
}