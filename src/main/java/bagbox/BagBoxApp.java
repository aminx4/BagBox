package bagbox;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bagbox.beans.User;
import bagbox.repository.IUserRepository;

@RestController
@SpringBootApplication
public class BagBoxApp {

	@Autowired
	IUserRepository userRepository;
	
	
	@RequestMapping("/authentication")
	public Map<String,Object> home() {
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "Hello World");
		return model;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<User> getUsers(){
		return userRepository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(BagBoxApp.class, args);
	}

}