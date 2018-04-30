package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository

trait StatRepository extends JpaRepository[User, String] {}
