package learningspringboot;
import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
public interface TeammateRepository extends CrudRepository<Teammate, BigInteger>
{}