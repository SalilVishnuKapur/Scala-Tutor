package org.tutorial.Beginner

import scala.collection.immutable.List

/** Description:-
 *  List is immutable 
 *  Immutable collections have operations that do not change
 *  the collection in place.
 *  List is optimal for last-in-first-out (LIFO) 
 *
 *  Performance:-

 *  Time: List has O(1) prepend and head/tail access.Most other operations are O(n)
 *  on the number of elements in the list. This includes the index-based lookup of 
 *  elements, length, append and reverse.
 *    
 *  Space: List implements structural sharing of the tail list. 
 *  This means that many operations are either zero- or constant-memory cost.
 */


object Lists {
  def main(Args:Array[String]):Unit =
  {
    // List is traversable
    val k = List(1,2,3)
    println(k.isTraversableAgain)
    
    // Still after applying a map it remains traversable
    val l = k.map(_ + 1)
    println(l.isTraversableAgain)

    // Accessing an element of List
    println(k.apply(0))
    
    week("Start")
    methods("++")
    methods("++:")
    methods("++:")
    methods("+:")
    methods("addString")
    methods("addString2")
    methods("addString3")
  }
  // 9 sunday
  //   monday
  def week(trigger : String)
  {
    // Make a list via the companion object factory
    val days = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    
    // Make a list element-by-element
    val when = "AM" :: "PM" :: List()
    
    // Pattern match
    days match {
    case firstDay :: otherDays =>
    println("The first day of the week is: " + firstDay)
    case List() =>
    println("There don't seem to be any week days.")
    }
  }
  
  def methods(trigger: String) 
  {
    trigger match {
      
      case "++"  => {
          val k=List("a","b","c").++(List("d"))
          println(k)    
      }
      case "++:"  => {
          val k=List("a","b","c").++:(List("d"))
          println(k)    
      }
      case "++:"  => {
          val k=List("a","b","c").++:(List("d"))
          println(k)    
      }
      // An element is prepended to the list
      case "+:"  => {
          val k=List("a","b","c").+:("d")
          println(k)    
      }
      case "/:"  => {
          //val k=List("a","b","c")./:(z)(op)
        //  println(k)    
      }
      case "addString"  => {
        val b= new StringBuilder("Rab Da Sath with ")
          val k=List("a","b","c").addString(b)
          println(k)    
      }
      
      case "addString2"  => {
        val b= new StringBuilder("Rab Da Sath with ")
          val k=List("a","b","c").addString(b, "||")
          println(k)    
      }
      
      case "addString3"  => {
        val b= new StringBuilder("Rab Da Sath with ")
          val k=List("a","b","c").addString(b, "start", "||", "end")
          println(k)    
      }
      
      case "aggregate"  => {
        val b= new StringBuilder("Rab Da Sath with ")
          val k=List("a","b","c").aggregate(z)(seqop, combop)
          println(k)    
      }
      /*
      case "/:"  => {
          val k=List("a","b","c")./:(z)(op)
          println(k)    
      }
      case "/:"  => {
          val k=List("a","b","c")./:(z)(op)
          println(k)    
      }
      * 
      */
    }
    
  }
  
  
}