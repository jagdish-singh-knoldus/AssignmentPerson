package com.knoldus

class Person(val name: String, val age: Int) extends Ordered[Person] {

  def compare(that: Person) = {
    if((this.name compare that.name)== 0 )
    {
      this.age compare that.age
    }
    else
      this.name compare that.name
  }

  override def toString = s"Person($name, $age)"
}

