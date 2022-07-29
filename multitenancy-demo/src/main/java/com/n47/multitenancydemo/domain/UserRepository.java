package com.n47.multitenancydemo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDomain, Long> {
}
