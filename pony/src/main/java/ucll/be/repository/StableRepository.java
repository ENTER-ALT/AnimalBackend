package ucll.be.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ucll.be.model.Stable;

@Repository
public interface StableRepository extends JpaRepository<Stable, Long>{
    Stable findByName(String name);
}
