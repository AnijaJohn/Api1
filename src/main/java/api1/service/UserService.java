package api1.service;

import java.util.List;

import api1.model.Api1Response;
import api1.model.Users;
import reactor.core.publisher.Mono;


public interface UserService {
	
	//List<Users> getUsers();

	Api1Response saveUser(Users user);
	
	Api1Response getSingleUser (Long id);
	
	//List<Users> getSingleUser (Long id);
	
	Api1Response deleteUser(Long id);
	
	Api1Response updateUser(Users user);

}
