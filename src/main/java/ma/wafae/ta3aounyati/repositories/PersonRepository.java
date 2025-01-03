package ma.wafae.ta3aounyati.repositories;

import ma.wafae.ta3aounyati.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
    List<Person> findByUserId(Integer userId);
}
