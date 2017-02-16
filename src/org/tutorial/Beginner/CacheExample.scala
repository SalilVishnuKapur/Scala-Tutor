package org.tutorial.Beginner

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

/** This illustrates how we can use
 *  the same data for three operations
 *  using cache memory. Rather than 
 *  picking data from hardisk every time.
 *  This reduces the time by 3 times.  
 */
object CacheExample {
  def main (args :Array[String]): Unit =  {
    val sparkConf = new SparkConf().setAppName("Cache-Example")
    val sc = new SparkContext(sparkConf)
    
    // Only after the first action the data gets into the cache memory
    var file = sc.textFile(args(0)).cache()
   
    //Operation1 
    val op1 = file.map(m => m(0)).collect()
    
    //Operation2 
    val op2 = file.map(m => m.charAt(0)).collect()
    
    //Operation3
    val op3 = file.map(m => m.length).collect()
  }
}