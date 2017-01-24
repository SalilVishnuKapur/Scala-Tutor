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
    methods("combinations")
    methods("zipWithIndex")
    methods("zipAll")
    methods("zip")
    methods("withFilter")
    methods("view")
    methods("unzip3")
    methods("unzip")
    methods("union")
    methods("transpose")
    methods("toVector")
    methods("toTraversable")
    methods("toString")
    methods("toStream")
    methods("toSet")
    methods("toSeq")
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
        }
      
      case "andThen"  => {
        val b= new StringBuilder("Rab Da Sath with ")
        }
      
      case "apply"  => {
        val k=List("a","b","c").apply(0)
        println(k)
        }
    
      case "applyOrElse"  => {
        //val k=List("a","b","c").applyOrElse(x , default)
        //println(k)
        }
      
      case "applyOrElse"  => {
       // val k=List("a","b","c").applyOrElse(x , default)
       // println(k)
        }
      
      case "canEqual"  => {
       // val k=List("a","b","c").applyOrElse(x , default)
       // println(k)
        }
      
      case "collect"  => {
       // val k=List("a","b","c").collect(pf)
       // println(k)
        }
      
      case "collectFirst"  => {
       // val k=List("a","b","c").collectFirst(pf)
       // println(k)
        }
      
      //
      case "combinations"  => {
        val k=List('a','b','c').combinations(10)
        println("Combinations " + k)
        }
      
      
      
        
    
       //   val k=List("a","b","c").aggregate(z)(seqop, combop)
       //   println(k)    
      
     
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
      
      
      
      
      /** Returns a List 
       *  by converting 1 list
       *  to another
       *  of the collection.
       */
      case "takeWhile" => {
        val k=List("a","b")
        val xs = k.takeWhile(p=> p.contains("a"))
        println("To Iterator "+xs)
        }
      
      /** Returns a List 
       *  by converting 1 list
       *  to another
       *  of the collection.
       */
      case "to" => {
        val k=List("a","b")
        val xs = k.to
        println("To Iterator "+xs)
        }
      
      /** Returns an Array 
       *  of the collection.
       */
      case "toArray" => {
        val k=List("a","b")
        val xs = k.toArray
        println("To Iterator "+xs)
        }
      
      /** Returns a mutable Buffer 
       *  of the collection.
       */
      case "toBuffer" => {
        val k=List("a","b")
        val xs = k.toBuffer
        println("To Iterator "+xs)
        }
      
      /** Returns a mutable Buffer 
       *  of the collection.
       */
      case "toBuffer" => {
        val k=List("a","b")
        val xs = k.toBuffer
        println("To Iterator "+xs)
        }
      
      /** Returns a IndexedSeq 
       *  of the collection.
       */
      case "toIndexedSeq" => {
        val k=Iterator("a","b")
        val xs = k.toIndexedSeq
        println("To Iterator "+xs)
        }
      
      /** Returns a Iterable 
       *  of the collection.
       */
      case "toIterable" => {
        val k=List("a","b")
        val xs = k.toIterator
        println("To Iterator "+xs)
        }
      
      /** Returns a Iterable 
       *  of the collection.
       */
      case "toIterable" => {
        val k=List("a","b")
        val xs = k.toIterable
        println("To Iterable "+xs)
        }
      
      /** Returns a Iterator 
       *  of the collection.
       */
      case "toIterator" => {
        val k=List("a","b")
        val xs = k.toIterator
        println("To Iterator "+xs)
        }
      
      /** Returns a list 
       *  of the collection.
       */
      case "toList" => {
        val k=List("a","b")
        val xs = k.toList
        println("To List "+xs)
        }
      
      /** Returns a Map 
       *  of the collection.
       *  But only if the values 
       *  are members of Tuple2.   
       */
      case "toMap" => {
        val k=("a","b")
        val xs = k.toMap
        println("To Map "+xs)
        }
      
      /** Returns a Map 
       *  of the collection.   
       *  
       */
      case "toMap" => {
        val k=List("a","b","c")
        val xs = k.toMap
        println("To Map "+xs)
        }
      ///////
      /** Returns a seq 
       *  of the collection.   
       *  
       */
      case "toParrArray" => {
        val k=List("a","b","c")
        val xs = k.toSeq
        println("To Seq "+xs)
        }
      
      /** Returns a seq 
       *  of the collection.   
       *  
       */
      case "toSeq" => {
        val k=List("a","b","c")
        val xs = k.toSeq
        println("To Seq "+xs)
        }
      
      /** Returns a set 
       *  of the collection.   
       *  
       */
      case "toSet" => {
        val k=List("a","b","c")
        val xs = k.toSet
        println("To Set "+xs)
        }
      
      // ^^^^^^^^
      /** Returns a stream 
       *  of the collection.   
       *  
       */
      case "toStream" => {
        val k="Salil"
        val xs = k.toStream
        println("To Stream"+xs)
        }
      
      /** Returns a string 
       *  of the collection.   
       *  
       */
      case "toString" => {
        val t=12
        val xs = t.toString()
        println("To String"+xs)
        }
      
      // Traversable is a trait(Abstract)  
      /** Returns a traversable 
       *  collection of the traversable 
       *  or iterator.
       */
      case "toTraversable" => {
        val xs = List(
            Set(1,2,3),
            Set(4,5,6)).toTraversable
        println(xs)
        }
      
      /** Returns a vector 
       *  of the traversable 
       *  or iterator.
       */
      case "toVector" => {
        val xs = List(
            Set(1,2,3),
            Set(4,5,6)).toVector
        println(xs)
        }
      
      /** Returns a vector 
       *  of the traversable 
       *  or iterator.
       */
      case "toVector" => {
        val xs = List(
            Set(1,2,3),
            Set(4,5,6)).toVector
        println(xs)
        }
      
      /** Returns a transpose 
       *  of the list of
       *  lists.
       */
      case "transpose" => {
        val xs = List(
            Set(1,2,3),
            Set(4,5,6)).transpose
        println(xs)
        }
      
      /** Returns a list by taking 
       *  union of two
       *  collections.
       */
      case "union" => {
        val z=List(("a","b", "c"), ("1", "2", "3"), ("!", "@", "#"))
        val y=List("abc" ,"def", "ghi")
        val k=z.union(y)
        println(k)
        }
      
      /** Converts the collection 
       *  of pairs into two
       *  collections.
       */
      case "unzip" => {
        val z=List(("a","b", "c"), ("1", "2", "3"), ("!", "@", "#"))
        val k=z.unzip(A=>(A._1,A._2))
        println(k._1)
        println(k._2)
        }
      
      /** Converts the collection 
       *  of triples into three
       *  collections.
       */
      case "unzip3" => {
        val z=List(("a","b", "c"), ("1", "2", "3"), ("!", "@", "#"))
        val k=z.unzip3
        println(k._1)
        println(k._2)
        println(k._3)
      }
      
      /** A copy of this list
       *  with single element
       *  replacement.
       */
      case "updated" => {
        val z=List("I am joker","Love", "hapiness", "joy", "creativity")
        val k=z.updated(1, "Bhaaji")
       k.foreach { println }  
      }
      
      /** Returns a non strict
       *  view of this sequence
       *  collection from start
       *  to ending index(until(not inclusive)). 
       */
      case "viewWithLimits" => {
        val z=List("I am joker","Love", "hapiness", "joy", "creativity")
        val k=z.view(2, 3)
       k.foreach { println }  
      }
      
      /** Returns a non strict
       *  view of this sequence
       *  collection. 
       */
      case "view" => {
        val z=List("I am joker","Love", "hapiness", "joy", "creativity")
        val k=z.view
       k.foreach { println }  
      }
      
      /** Returns a non strict
       *  filter of traversable 
       *  collection. It does not
       *  create a new collection.
       */
      case "withFilter" => {
        val z=List("I am joker","Love", "hapiness", "joy", "creativity")
        val k=z.withFilter { x => x.apply(0) == 'I' }
       k.foreach { println }  
      }
      
      /** Returns a list after combining
       *  the two lists. The length of list
       *  is decided by the shortest list
       *  length
       */
      case "zip" => {
        val z=List("I am joker","Love")
        val k=List("a","b","c", "d", "e", "f").zip(z)
        println(k)  
      }
      
      /** Returns a list after combining
       *  the two lists. The length of list
       *  is decided by the longest list
       *  length.
       */
      case "zipAll" => {
        val z=List("I am joker","Love", "happiness", "joy")
        val k=List("a","b","c").zipAll(z, "Hero" , z.apply(1))
        println(k)  
      }
      
      /** Creates a list with
       *  the index.
       */
      case "zipWithIndex" => {
        val k=List("a","b","c").zipWithIndex
          println(k)  
      }
    }    
  }