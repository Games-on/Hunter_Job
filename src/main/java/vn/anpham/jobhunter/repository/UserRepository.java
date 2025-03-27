package vn.anpham.jobhunter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import vn.anpham.jobhunter.domain.Company;
import vn.anpham.jobhunter.domain.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
    User findByEmail(String email);
    boolean existsByEmail(String email);
    User findByRefreshTokenAndEmail(String token, String email);
    List<User> findByCompany(Company company);
}