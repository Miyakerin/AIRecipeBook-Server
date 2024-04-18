package com.voltjunkie.airecipebookserver.repository;

import com.voltjunkie.airecipebookserver.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
