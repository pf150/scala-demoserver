package com.example.demo

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.{Entity, Id}

import scala.beans.BeanProperty

@Entity
class User {
  @Id
  @JsonProperty("user_id")
  @BeanProperty
  var id: String = _
}

