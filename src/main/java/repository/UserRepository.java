package repository;

import model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: john
 * @version: 1.0 2014-05-29 13:38
 */
@Repository
public interface UserRepository extends CrudRepository<User, String>, PagingAndSortingRepository<User, String> {

    Page<User> findByLoginnoContainingOrNameContainingOrTelephoneContainingOrEmailContaining(String loginno, String name, String telephone, String email, Pageable pageable);

}
