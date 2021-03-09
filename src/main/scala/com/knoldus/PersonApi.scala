package com.knoldus

object PersonApi extends App {
  val personOne = new Person("Test",24)
  val personTwo = new Person("Test",26)

  if(personOne.compare(personTwo)<0)
    println(s"${personOne}<${personTwo}: true")
  else if(personOne.compare(personTwo)>0 )
    println(s"${personOne}>${personTwo}: true")
  else
    println("personOne==personTwo")

}