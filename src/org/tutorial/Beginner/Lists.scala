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
    methods("takeWhile")
    
  }
  
  
  def methods(trigger: String) 
  {
    trigger match {
      
      /** 
       * 
       */ 
      case "++"  => {
          val k=List("a","b","c").++(List("d"))
          println(k)    
      }
     
      /** 
       * 
       */
      case "++:"  => {
          val k=List("a","b","c").++:(List("d"))
          println(k)    
      }
      
      /** An element is prepended 
       *  to the list. 
       */
      case "+:"  => {
          val k=List("a","b","c").+:("d")
          println(k)    
      }
      
      /** 
       * 
       */
      case "/:"  => {
          val k=List("a","b","c")./
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
      
      case "combinations"  => {
        val k=List('a','b','c').combinations(10)
        println("Combinations " + k)
        }
      
      case "companion"  => {
        val k=List('a','b','c').companion
        println("Companion " + k)
        }
      
      case "companion"  => {
        val k=List('a','b','c').companion
        println("Companion " + k)
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
     
     
     
      
     
     /** Counts the number of 
      *  elements.
      */
      case "count" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.count { x => (x%2)==0 }
        println("Result "+ result)
      } 
      
     /** Computes the multiset 
      *  difference between this
      *  list and another sequence.
      */
      case "diff" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.diff(List(1,2))
        println("Result "+ result)
      } 
     
     /** Builds a new sequence 
      *  from this sequence 
      *  without any duplicates.
      */
      case "distinct" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.distinct
        println("Result "+ result)
      } 
      
     /** Select all the elements 
      *  except the first n ones.
      */
      case "drop" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.drop(2)
        println("Result "+ result)
      } 
     
     /** Tests whether this 
      *  sequence ends with 
      *  the given sequence.
      */
      case "dropRight" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.dropWhile{x => }
        println("Result "+ result)
      } 
      
     /** Tests whether this 
      *  sequence ends with 
      *  the given sequence.
      */
      case "dropWhile" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.dropWhile{x => }
        println("Result "+ result)
      }
      
     /** Tests whether this 
      *  sequence ends with 
      *  the given sequence.
      */
      case "endsWith" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.endsWith(Seq(6))
        println("Result "+ result)
      } 
     
     /** Compares this sequence to 
      *  some other object.
      */
      case "equals" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.equals{ List(1,2,3,4,5,6) }
        println("Result "+ result)
      } 
      
     /** Selects all elements of this 
      *  traversable collection which
      *  satisfy a predicate.
      */
      case "exists" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.exists{ x => (x%2)==0 }
        println("Result "+ result)
      } 
      
     /** Selects all elements of this 
      *  traversable collection which
      *  satisfy a predicate.
      */
      case "filter" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.filter{ x => (x%2)==0 }
        println("Result "+ result)
      } 
      
     /** Selects all elements of this 
      *  traversable collection which
      *  do not satisfy a predicate.
      */
      case "filterNot" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.filterNot{ x => (x%2)==0 }
        println("Result "+ result)
      }
      
     /** Finds the first element of the 
      *  sequence satisfying a predicate.
      */
      case "find" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.find{ x => (x%2)==0 }
        println("Result "+ result)
      }  
      
     /** Builds a new collection by
      *  applying a function to all elements 
      *  of this list.
      */
      case "flatMap" => {
        val k = Map("a" -> List(11,111), "b" -> List(22,222))
        val result = k.flatMap(_._2)
        println("Result "+ result)
      } 
      
     /** A new list resulting from 
      *  concatenating all elements of
      *  lists.
      */
      case "flatten" => {
        val k = List(Set(1,2,3), Set(1,2,3))
        val result = k.flatten
        println("Result "+ result)
      } 
      
     /** Folds the elements of this
      *  traversable or iterator using 
      *  specified associative binary 
      *  operator.
      */
      case "fold" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.fold(Nil)((A,B)=>B)
        println("Result "+ result)
      } 
      
     /** Applies a binary operator 
      *  to a start value and all the
      *  elements in sequence going
      *  from right to left.
      */
      case "foldLeft" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.foldLeft(1)((A,B)=>B*2)
        println("Result "+ result)
      }
     
     /** Applies a binary operator 
      *  to a start value and all the
      *  elements in sequence going
      *  from right to left.
      */
      case "foldRight" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.foldRight(1)((A,B)=>B*2)
        println("Result "+ result)
      } 
      
     /** This returns true if the 
      *  predicate is satisfied 
      *  for all the values of the collection.
      */
      case "forall" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.forall{x => (x%2)==0 }
        println("Result "+ result)
      } 
     
     /** This iterates through all
      *  the values of the list.
      */
      case "foreach" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.foreach{x => x*2}
        println("Result "+ result)
      } 
      
     /** The generic builder that builds 
      *  instances of traversable Partitions elements in
      *  fixed size iterable collection.
      */
      case "genericBuilder" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.genericBuilder
        println("Result "+ result)
      } 
      
     /** Partitions elements in
      *  fixed size iterable collection.
      */
      case "groupBy" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.groupBy { x => (x%2)==0 }
        println("Result "+ result)
      } 
      
     /** Partitions elements in
      *  fixed size iterable collection.
      */
      case "grouped" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.grouped(2)
        println("Result "+ result)
      } 
      
     /** Selects the first element of
      *  this iterable collection.
      */
      case "hasDefiniteSize" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.hasDefiniteSize
        println("Result "+ result)
      } 
      
     /** Selects the first element of
      *  this iterable collection.
      */
      case "hashCode" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.hashCode()
        println("Result "+ result)
      } 
     
     /** Selects the first element of
      *  this iterable collection.
      */
      case "headOption" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.head
        println("Result "+ result)
      } 
      
     /** Finds the first element 
      *  of this traversable list but
      *  if empty then None.
      */
      case "headOption" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.headOption
        println("Result "+ result)
      }
      
     /** Finds the first element 
      *  of this traversable list but
      *  if empty then None.
      */
      case "headOption" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.headOption
        println("Result "+ result)
      } 
      
     /** Finds index of first occurrence
      *  of some value in the list
      *  after or at some start index.
      */
      case "indexOf" => {
        val k = List(1, 2, 3, 4, 5, 6)
        val result = k.indexOf(2, 3)
        println("Result "+ result)
      } 
      
     /** Finds index of first occurrence
      *  of some value in the list.
      */
      case "indexOf" => {
        val k = List(1, 2, 3)
        val result = k.indexOf(2)
        println("Result "+ result)
      } 
      
     /** Finds the first index
      *  after or at start index
      *  where this seq contains a 
      *  given slice.
      */
      case "indexOfSlice" => {
        val k = List(1, 2, 3)
        val result = k.indexOfSlice(Seq(3),1)
        println("Result "+ result)
      } 
      
     /** Finds the first index
      *  after or at start index
      *  where this seq contains a 
      *  given slice.
      */
      case "indexOfSlice" => {
        val k = List(1, 2, 3)
        val result = k.indexOfSlice(Seq(3),1)
        println("Result "+ result)
      } 
      
     /** Finds the first index
      *  where this sequence 
      *  contains a given 
      *  sequence as 
      *  slice.
      */
      case "indexOfSlice" => {
        val k = List(1, 2, 3)
        val result = k.indexOfSlice(Seq(2))
        println("Result "+ result)
      }  
       
     /** Finds the index of
      *  the first element
      *  satisfying some 
      *  predicate after
      *  or at some start
      *  index.
      */
      case "indexWhere" => {
        val k = List(1, 2, 3)
        val result = k.indexWhere(x => (x%2!=0),1 )
        println("Result "+ result)
      } 
      
     /** Finds the index of
      *  the first element
      *  satisfying some 
      *  predicate.
      */
      case "indexWhere" => {
        val k = List(1, 2, 3)
        val result = k.indexWhere(x => (x%2!=0) )
        println("Result "+ result)
      } 
      
     /** Produces the range 
      *  of all indices of
      *  this sequence.
      */
      case "indices" => {
        val k = List(1, 2, 3)
        val result = k.indices
        println("Result "+ result)
      } 
      
     /** Produces the range 
      *  of all indices of
      *  this sequence.
      */
      case "indices" => {
        val k = List(1, 2, 3)
        val result = k.indices
        println("Result "+ result)
      }
     
     /** Selects all the 
      *  elements except the
      *  last one.
      */
      case "init" => {
        val k = List(1, 2, 3)
        val result = k.init
        println("Result "+ result)
      } 
      
     /** Creates a iterator
      *  of the list.
      */
      case "inits" => {
        val k = List(1, 2, 3)
        val result = k.inits
        println("Result "+ result)
      } 
      
     /** Computes a multiset
      *  interaction between 
      *  this list and another 
      *  sequence.
      */
      case "intersect" => {
        val k = List(1, 2, 3, 4, 5, 2, 7, 8, 9)
        val result = k.intersect(Seq(3,100,2))
        println("Result "+ result)
      }
      
     /** Checks whether this
      *  seq contains given
      *  index.
      */
      case "isDefinedAt" => {
        val k = List(1, 2, 3, 4, 5, 2, 7, 8, 9)
        val result = k.isDefinedAt(1)
        println("Result "+ result)
      } 
      
     /** Checks whether this
      *  seq is empty or
      *  not.
      */
      case "isEmpty" => {
        val k = List(1, 2, 3, 4, 5, 2, 7, 8, 9)
        val result = k.isEmpty
        println("Result "+ result)
      }
      
     /** Checks whether this
      *  traversable collection 
      *  can be repeatedly traversed. 
      */
      case "isTraversableAgain" => {
        val k = List(1, 2, 3, 4, 5, 2, 7, 8, 9)
        val result = k.isTraversableAgain
        println("Result "+ result)
      }
      
     /** Creates a new iterator.    
      */  
      case "iterator" => {
        val k = List(1, 2, 3, 4, 5, 2, 7, 8, 9)
        val result = k.iterator
        println("Result "+ result)
      } 
     
     /** Finds the last element.    
      */  
      case "last" => {
        val k = List(1, 2, 3, 4, 5, 2, 7, 8, 9)
        val result = k.last
        println("Result "+ result)
      }
      
     /** Finds the last index
      *  of some value in this
      *  list before some last index.   
      */  
      case "lastIndexOf" => {
        val k = List(1, 2, 3, 4, 5, 2, 7, 8, 9)
        val result = k.lastIndexOf(2, 7)
        println("Result "+ result)
      } 
      
     /** Finds the last index
      *  of some value in this list.   
      */  
      case "lastIndexOf" => {
        val k = List(1, 2, 3, 4, 5, 2, 7, 8, 9)
        val result = k.lastIndexOf(2)
        println("Result "+ result)
      } 
      
     /** Finds the last index
      *  where this sequence contains 
      *  a given sequence before end index
      *  as slice.  
      */  
      case "lastIndexOfSlice" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.lastIndexOfSlice(Seq(1) , 10)
        println("Result "+ result)
      } 
      
     /** Finds the last index
      *  where this sequence contains 
      *  a given sequence as slice.  
      */  
      case "lastIndexOfSlice" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.lastIndexOfSlice(Seq(1))
        println("Result "+ result)
      } 
      
     /** Finds the last index
      *  where this sequence contains 
      *  a given sequence as slice.  
      */  
      case "lastIndexWhere" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.lastIndexWhere( x => (x%2)==0 ,10 )
        println("Result "+ result)
      } 
      
     /** Gets the index of the
      *  last element which 
      *  satisfy this before or 
      *  equal to the last value.  
      */  
      case "lastIndexWhere" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.lastIndexWhere( x => (x%2)==0 ,10 )
        println("Result "+ result)
      }
      
     /** Gets the index of the
      *  last element which 
      *  satisfy this.  
      */  
      case "lastIndexWhere" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.lastIndexWhere { x => (x%2)==0 }
        println("Result "+ result)
      }
     
     /** Gets the index of the
      *  last element which 
      *  satisfy this.  
      */  
      case "lastIndexWhere" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.lastIndexWhere { x => (x%2)==0 }
        println("Result "+ result)
      }
      
     /** Finds the last element 
      *  in case it is empty then
      *  fetches None.  
      */  
      case "lastOption" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.lastOption
        println("Result "+ result)
      }
      
     /** Finds the length 
      *  of this sequence.
      */  
      case "length" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.length
        println("Result "+ result)
      }
      
      //** 
     /** Compares the length 
      *  of this seq to a test
      *  value.
      */  
      case "lengthCompare" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.lengthCompare(15)
        println("Result "+ result)
      }
      
     //** 
     /** Builds a new collection
      *  by applying map to all elements 
      *  of this list.
      */  
      case "lift" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.lift(1)
        println("Result "+ result)
      }
      
     /** Builds a new collection
      *  by applying map to all elements 
      *  of this list.
      */  
      case "map" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.map(m => m*2 )
        println("Result "+ result)
      }
     
      //****
     /** Returns the largest 
      *  element.
      */  
      case "mapConverse" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.mapConserve{x => x}
        println("Result "+ result)
      }
      
     /** Returns the largest 
      *  element.
      */  
      case "max" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.max
        println("Result "+ result)
      }
      
     /** Returns the first element
      *  which yields the largest
      *  value which satisfy the 
      *  function. 
      */  
      case "maxBy" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.minBy { x => (x%2==0) }
        println("Result "+ result)
      }
      
     /** Returns the smallest 
      *  element.
      */  
      case "min" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.min
        println("Result "+ result)
      }
      
     /** Returns the first element
      *  which yields the smallest
      *  value which satisfy the 
      *  function. 
      */  
      case "minBy" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.minBy { x => (x%2==0) }
        println("Result "+ result)
      }
      
     /** Returns all elements of 
      *  this traversable using 
      *  separator string. 
      */  
      case "mkString" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.mkString
        println("Result "+ result)
      }
      
     /** Returns all elements of 
      *  this traversable using 
      *  separator string. 
      */  
      case "mkString" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.mkString("|")
        println("Result "+ result)
      }
      
     /** Returns all elements of 
      *  this traversable or iterator 
      *  in a string using start, end
      *  and separator string. 
      */  
      case "mkString" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.mkString("(", ";", ")")
        println("Result "+ result)
      } 
      
     /** Returns a partial 
      *  function with a fallback
      *  partial function which 
      *  gets applied where this
      *  partial function is not defined.  
      */  
      case "nonEmpty" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.nonEmpty
        println("Result "+ result)
      } 
      
     //Partial Function :- A function which does not return output on every input value.
     // It provides an answer only for a subset of possible data, and defines the data it can handle.
     // In Scala, a partial function can also be queried to determine if it can handle a particular value.
     /** Returns a partial 
      *  function with a fallback
      *  partial function which 
      *  gets applied where this
      *  partial function is not defined.  
      */    
      case "orElse" => {
           // converts 1 to "one", etc., up to 5
           val convert1to5 = new PartialFunction[Int, String] {
             val nums = Array("one", "two", "three", "four", "five")
             def apply(i: Int) = nums(i-1)
             def isDefinedAt(i: Int) = i > 0 && i < 6
            }

           // converts 6 to "six", etc., up to 10
           val convert6to10 = new PartialFunction[Int, String] {
             val nums = Array("six", "seven", "eight", "nine", "ten")
             def apply(i: Int) = nums(i-6)
             def isDefinedAt(i: Int) = i > 5 && i < 11
            }

        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result =  convert1to5 orElse convert6to10
        println("Result "+ result)
      }
      
     /** Returns a copy of 
      *  this list with an 
      *  element value appended
      *  to it.
      */ 
      case "padTo" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.padTo(14, 10)
        println("Result "+ result)
      }
      
      /** Returns a parallel
       *  implementation of this
       *  collection. 
       */ 
      case "par" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.par
        println("Result "+ result)
      }
      
      /** Partitions the collection 
       *  into two traversable 
       *  collections. 
       */ 
      case "partition" => {
        val k = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = k.partition {x => ((x % 2) == 0)}
        println("Result "+ result)
      }    
      
      /** Returns the slice
       *  combinations of the list.
       */ 
      case "patch" => {
        val k=List(1,(1,1,1),3,4, 5, 6, 7, 8, 9)
        val result = k.patch(0, Seq(77,88,99,100), 5)
        println("Result "+ result)
        }
      
      /** Returns the permutation
       *  combinations of the list.
       */ 
      case "permutations" => {
        val k=List(1,(1,1,1),3,4, 5, 6, 7, 8, 9)
        val result = k.permutations
        println("Result "+ result)
        }      
      
      /** Returns the length
       *  of the longest prefix
       *  which satisfy some
       *  predicate. 
       */ 
      case "prefixLength" => {
        val k=List(1,(1,1,1),3,4, 5, 6, 7, 8, 9)
        val result = k.prefixLength { x => true }
        println("Result "+ result)
        }
      
      /** Returns a product 
       *  of all the elements.
       */ 
      case "product" => {
        val k=List(1,2,3,4, 5, 6, 7, 8, 9)
        val result = k.product
        println("Result "+ result)
        }
      
      /** Returns a iterator 
       *  over all the elements.
       */ 
      case "productIterator" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val result = k.productIterator
        println("Result "+ result)
        }
      
      /** Returns a string 
       *  is equivalent to 
       *  toString.
       */ 
      case "productPrefix" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val result = k.productPrefix
        println("Result "+ result)
        }
      
      /** Returns a reduced 
       *  option of the same
       *  with operator applied
       *  to all the elements of same type.
       */ 
      case "reduce" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val result = k.reduce((A,B) =>A)
        println("Result "+ result)
        }
      
      /** Returns a reduced 
       *  option of the same
       *  with operator applied
       *  to all the elements of same type.
       */ 
      case "reduceLeft" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val result = k.reduceOption((A,B) =>A)
        println("Result "+ result)
        }
      
      /** Returns a reduced 
       *  option of the same
       *  with operator applied
       *  to all the elements of same type.
       */ 
      case "reduceLeftOption" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val result = k.reduceLeftOption((A,B) =>A)
        println("Result "+ result)
        }
      
      /** Returns a reduced 
       *  option of the same
       *  with operator applied
       *  to all the elements of same type.
       */ 
      case "reduceRight" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val result = k.reduceOption((A,B) =>A)
        println("Result "+ result)
        }
      
      /** Returns a reduced 
       *  result of the same
       *  with operator applied
       *  to all the elements.
       */ 
      case "reduceRight" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val result = k.reduceRight((A,B) =>A)
        println("Result "+ result)
        }
      
      /** Returns a reduced 
       *  result of the same.
       */ 
      case "reduceRightOption" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val result = k.reduceRightOption((A,B)=> B)
        println("Result "+ result)
        }
      
      /** Returns a traversable 
       *  object of the same.
       */ 
      case "repr" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val result = k.repr
        println("Result "+ result)
        }
      
      /** Returns a reversed
       *  list.
       */ 
      case "reverse" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val result = k.reverse
        println("Result "+ result)
        }
      
      /** Returns a reversed
       *  iterator as a collection.
       */ 
      case "reverseIterator" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val result = k.reverseIterator
        println("Result "+ result)
        }
      
      /** Reverses the list
       *  after applying a 
       *  map to every element. 
       */ 
      case "reverseMap" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val result = k.reverseMap(f => f.length())
        println("Result "+ result)
        }
      
      /** Reverses the list. 
       */ 
      case "reverse" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val result = k.reverse
        println("Result "+ result)
        }
      
      /** Adds the elements to another 
       *  list by reversing them.
       */ 
      case "runWith" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val result = k.sameElements(List("a","b","c","d", "e", "f", "g", "h", "i"))
        println("Result "+ result)
        }
      
      /** Compares the two collections.
       */ 
      case "sameElements" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val result = k.sameElements(List("a","b","c","d", "e", "f", "g", "h", "i"))
        println("Result "+ result)
        }
      
      /** Computes this collections
       *  cumulative result scanning 
       *  from left to right 
       *  segment length.
       */ 
      case "scan" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        println(k.scan("abc")(_+_))
        }
      
      /** Computes this collections
       *  cumulative result scanning 
       *  from left to right 
       *  segment length.
       */ 
      case "scanLeft" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        println(k.scanLeft("x":String)(_+_))
        }
      
      /** Computes this collections
       *  cumulative result scanning 
       *  from right to left 
       *  segment length.
       */ 
      case "scanRight" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        println(k.scanRight("x":String)(_+_))
        }
      
      /** Computes this collections
       *  segment length.
       */ 
      case "segmentLength" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val segmentLength = k.segmentLength(p=> p.length()==1, 2)
        println("Slicing result "+ segmentLength)
        }
      
      /** Converts this collection
       *  to sequence.
       */ 
      case "seq" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val sequenced = k.toSeq
        println("Slicing result "+ sequenced)
        }
      
      /** Gets size of  
       *  sequence
       */ 
      case "size" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val length = k.size
        println("Size result "+ length)
        }
      
      /** Gets Iterator of List
       *  on the bases of window size and
       *  the step size that is 
       *  distance between first element
       *  of each window.  
       */ 
      case "slice" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val groups= k.slice(1, 3)
        println("Slicing result "+ groups)
        }
      
      /** Gets Iterator of List
       *  on the bases of window size and
       *  the step size that is 
       *  distance between first element
       *  of each window.  
       */ 
      case "sliding" => {
        val k=List("a","b","c","d", "e", "f", "g", "h", "i")
        val groups= k.sliding(2, 3)
        println("Sliding result "+ groups)
        }
      
      /** Slides the seq according  
       *  to a condition 
       *  function.   
       */ 
      case "sliding" => {
        val k=List("a","b","c","d", "e")
        val groups= k.sliding(2)
        println("Sliding result "+ groups)
        }
      
      /** Sorts the seq according  
       *  to a condition 
       *  function.   
       */ 
      case "sortBy" => {
        var words="The quick brown fox jumped over the lazy dog".split(" ")
        words.sortBy(x => (x.length(),x.head) )
        println("Sorted by "+words)
        }
      
      /** Sorts the seq according  
       *  to a comparison 
       *  function   
       *  pair on the bases 
       *  of a condition which 
       */
      case "sortWith" => {
        val k=List(1,2,3,4, 5)
        val xs = k.sortWith((a,b) => a.<=(b))
        println("Sort with list "+xs)
        println(List("Steve", "Tom", "John", "Bob").sortWith(_.compareTo(_)<0))
        }
      
      /** Sorts the seq according  
       *  to an ordering  
       *  pair on the bases 
       *  of a condition which 
       *  is based on math.Ordering.
       */
      case "sorted" => {
        val k=List("a","b","c","d", "e")
        val xs = k.sorted
        println("Sorted list "+xs)
        }
      
      /** Splits this list into  
       *  a predicate and suffix  
       *  pair on the bases of
       *  a condition.
       */
      case "span" => {
        val k=List("a","b","c","d", "e")
        val xs = k.span(p => p.length()==1)
        println("Spanned list "+xs)
        }
      
      /** Splits this list into  
       *  a predicate and suffix  
       *  pair on the bases of
       *  a condition.
       */
      case "span" => {
        val k=List("a","b","c","d", "e")
        val xs = k.span(p => p.length()==1)
        println("Spanned list "+xs)
        }
      
      /** Split the list into  
       *  two lists on the bases  
       *  the index.
       */
      case "splitAt" => {
        val k=List("a","b","c")
        val xs = k.splitAt(2)
        println("Split string "+xs)
        }
      
      /** Checks whether a list  
       *  has a particular element 
       *  at particular index.
       */
      case "startsWith" => {
        val k=List("a","b","c")
        val xs = k.startsWith("a")
        println("startsWith "+xs)
        }
      
      /** Checks whether a list  
       *  starts with a particular 
       *  element.
       */
      case "startsWith" => {
        val k=List("a","b","c")
        val xs = k.startsWith("a")
        println("startsWith "+xs)
        }
      
      /** 
       *  */
      case "stringPrefix" => {
        val k=List("a","b","c")
        val xs = k.stringPrefix
        println("stringPrefix "+xs)
        }
      
      /** Sums up the  
       *  elements of this 
       *  collection.
       */
      case "sum" => {
        val k=List(1,2,3)
        val xs = k.sum
        println("Sum "+xs)
        }
      
      /** Returns a List 
       *  of all elements 
       *  except the first.
       */
      case "take" => {
        val k=List("a","b","c")
        val xs = k.tail
        println("Take "+xs)
        }
      
      /** Returns a List 
       *  after taking n first elements.
       */
      case "take" => {
        val k=List("a","b")
        val xs = k.take(1)
        println("Take first one's"+xs)
        }
      
      /** Returns a List 
       *  after taking n right elements.
       */
      case "takeRight" => {
        val k=List("a","b")
        val xs = k.takeRight(1)
        println("Take right "+xs)
        }
      
      /** Returns a List 
       *  after checking the
       *  condition.
       */
      case "takeWhile" => {
        val k=List("a","b")
        val xs = k.takeWhile(p=> p.contains("a"))
        println("To Iterator "+xs)
        }
      
      /** Returns a List 
       *  after checking the
       *  condition.
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
      /*
      case "toMap" => {
        val k=("a","b")
        val xs = k.toMap
        println("To Map "+xs)
        }
      */
      /** Returns a Map 
       *  of the collection.   
       *  
       */
      /*
      case "toMap" => {
        val k=List("a","b","c")
        val xs = k.toMap
        println("To Map "+xs)
        }
        * 
        */
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
}