package itschool.okhttp.repository;

import itschool.okhttp.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TestRepo extends JpaRepository<Test, Long> {
}
