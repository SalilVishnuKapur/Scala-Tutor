package org.tutorial.Beginner

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object Accumulators {
  def main(args :Array[String]) : Unit =
  {
    val sparkConf = new SparkConf()
    .setAppName("Accumulators")
    .set("spark.executor.extraJavaOptions", "-XX:+UseG1GC")
    var sc = new SparkContext(sparkConf)
    var accum = sc.Accumulator(0 , "My Accumulator")
    sc.parallelize(0 until 10, 10).foreach(x => accum += 1)
    accum.value
  }
}