package bagbox.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import bagbox.beans.User;

public interface IUserRepository extends Repository<User, String> {

	User findById(String id);
	Page<User> findAll(Pageable pageable);
	List<User> findAll();
}
