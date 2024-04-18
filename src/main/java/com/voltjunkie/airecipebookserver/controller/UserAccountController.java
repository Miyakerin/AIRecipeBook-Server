package com.voltjunkie.airecipebookserver.controller;

import com.voltjunkie.airecipebookserver.dto.UserAccountDTO;
import com.voltjunkie.airecipebookserver.entity.UserAccount;
import com.voltjunkie.airecipebookserver.service.UserAccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserAccountController {

    private final UserAccountService userAccountService;

    @PostMapping
    public ResponseEntity<UserAccount> create(@RequestBody UserAccountDTO userAccountDTO) {
        return new ResponseEntity<>(userAccountService.create(userAccountDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<UserAccount>> readAll() {
        return new ResponseEntity<>(userAccountService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserAccount> read(@PathVariable Long id) {
        return new ResponseEntity<>(userAccountService.read(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<UserAccount> update(@RequestBody UserAccount userAccount) {
        return new ResponseEntity<>(userAccountService.update(userAccount), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Long id) {
        userAccountService.delete(id);
        return HttpStatus.OK;
    }


}
