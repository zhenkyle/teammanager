package learningspringboot;
import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
public interface TeamRepository extends CrudRepository<Team, BigInteger> 
{}