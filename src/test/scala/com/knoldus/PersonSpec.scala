package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class PersonSpec extends AnyFlatSpec {
  val person1 = new Person("Jagdish",24)


  "It" should "be equal for same names and age" in{
    val person2 = new Person("Jagdish",24)
    val res: Int = person1.compare(person2)
    assert(res == 0)
  }

  "person1" should "be greater for larger name irrespective of age" in{
    val person2 = new Person("test",24)
    val res: Int = person1.compare(person2)
    assert(res<0)
  }

  "person1" should "be greater for higher age for same name" in{
    val person2 = new Person("Jagdish",18)
    val res: Int = person1.compare(person2)
    assert(res>0)
  }

  "person2" should "be greater for larger name irrespective of age" in{
    val person2 = new Person("Assignment",24)
    val res: Int = person1.compare(person2)
    assert(res>0)
  }

  "person2" should "be greater for higher age for same name" in{
    val person2 = new Person("Jagdish",30)
    val res: Int = person1.compare(person2)
    assert(res<0)
  }

}