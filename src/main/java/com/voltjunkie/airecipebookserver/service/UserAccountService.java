package com.voltjunkie.airecipebookserver.service;

import com.voltjunkie.airecipebookserver.dto.UserAccountDTO;
import com.voltjunkie.airecipebookserver.entity.UserAccount;
import com.voltjunkie.airecipebookserver.repository.UserAccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserAccountService {
    private final UserAccountRepository userAccountRepository;

    public UserAccount create(UserAccountDTO userAccountDTO) {
        UserAccount userAccount = UserAccount.builder()
                .username(userAccountDTO.getUsername())
                .build();
        return userAccountRepository.save(userAccount);
    }

    public UserAccount read(Long id) {
        return userAccountRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<UserAccount> readAll() {
        return userAccountRepository.findAll();
    }

    public UserAccount update(UserAccount userAccount) {
        return userAccountRepository.save(userAccount);
    }

    public void delete(Long id) {
        userAccountRepository.deleteById(id);
    }
}
