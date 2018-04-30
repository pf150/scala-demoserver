package com.example.demo


import org.slf4j.{Logger, LoggerFactory}
import org.springframework.web.bind.annotation._

@RestController
class StatController(repo: StatRepository) {
  lazy val log: Logger = LoggerFactory getLogger getClass.getName

  @PostMapping(value = Array("user"), consumes = Array("application/json"))
  def user(@RequestBody user: User): Unit = {
    log.info(s"Got user ${user.id}")
    if (user.id == null) {
      log.error("User id is null")
      throw new RuntimeException("User id must not be null")
    }
    repo.save(user)
  }

  @GetMapping(Array("stat"))
  def stat(): Long = {
    log.info("Got stat request")
    val count = repo.count
    log.info(s"Unique count is $count")
    count
  }

}
