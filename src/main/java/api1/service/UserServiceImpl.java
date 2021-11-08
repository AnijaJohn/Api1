package api1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import api1.model.Api1Response;
import api1.model.Users;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	WebClient.Builder webClientBuilder;
	public List<Users> getUsers() {
		
		return webClientBuilder.build().get().uri("http://localhost:8082/users").retrieve().bodyToMono(List.class).block();
	}

	@Override
	public Api1Response saveUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Api1Response getSingleUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Api1Response deleteUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Api1Response updateUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
