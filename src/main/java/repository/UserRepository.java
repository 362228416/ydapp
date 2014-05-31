package repository;

import model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: john
 * @version: 1.0 2014-05-29 13:38
 */
@Repository
public interface UserRepository extends CrudRepository<User, String>, PagingAndSortingRepository<User, String> {

    List<User> findByLoginnoLike(String name, Pageable pageable);

}
