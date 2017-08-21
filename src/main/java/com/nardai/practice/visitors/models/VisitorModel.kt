package com.nardai.practice.visitors.models

import java.net.InetAddress
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Visitor(@Id
                   @GeneratedValue(strategy = GenerationType.AUTO)
                   val id: Long,
                   val name: String = "Rick",
                   val ip: InetAddress = InetAddress.getByName("127.0.0.1"))