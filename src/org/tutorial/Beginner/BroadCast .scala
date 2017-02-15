package org.tutorial.Beginner

import scala.util.Try
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import scala.util.Failure
import scala.util.Success

/**
 * Broadcast variables allow the programmer to keep a read-only
 * deserialized variable cached on each machine rather than shipping
 * a copy of it with tasks. They can be used, for example, to give every node
 * a copy of a large input dataset in an efficient manner.
 * Spark also attempts to distribute broadcast variables using
 * efficient broadcast algorithms to reduce communication cost.
 * When an action executes the variable is broadcasted to nodes 
 * in serialized form and when it is required for usage it is 
 * deserialized.
 */
object BroadCast  {
def main(args :Array[String]) :Unit =
{
    val sparkConf = new SparkConf().setAppName("Clf-Processing").set("spark.executor.extraJavaOptions", "-XX:+UseG1GC")
    var sc = new SparkContext(sparkConf)
    var cachedVariable =  sc.broadcast(Array(1,2,3))
      
    val pairs1 = sc.parallelize(0 until 10, 10).flatMap { p =>
      cachedVariable.value  
     }
    pairs1.foreach(println)
}
}