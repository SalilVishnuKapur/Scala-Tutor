package org.tutorial.Beginner

class VectorAccumulatorParam[B] extends AccumulatorParam[Vector] {
   
  override def zero(initialValue: Vector): Vector = {
      Vector.zeros(initialValue.size)
    }
    
  override def addInPlace(v1: Vector, v2: Vector): Vector = {
      v1 += v2
    }
  
}

class SeqAccumulatorParam[B] extends AccumulatorParam[Vector] {
    override def zero(initialValue: Seq[B]): Seq[B] = Seq[B]()
    override def addInPlace(s1: Seq[B], s2: Seq[B]): Seq[B] = s1 ++ s2
}

object AdvancedAccumulator {
  def main(args: Array[String]) : Unit ={
   
   // For Int
   val seqAccum = sc.accumulator(Seq[Int]())(new SeqAccumulatorParam[Int]())  
   val lists = (1 to 5).map(x => (0 to x).toList)
   sc.parallelize(lists).foreach(x => seqAccum += x)
   seqAccum.value
   // Seq[Int] = List(0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 0, 1, 2, 0, 1)
   // result can be in different order.
   
   // For Doubles.
   val seqAccumD = sc.accumulator(Seq[Double]())(new SeqAccumulatorParam[Double]())
   sc.parallelize(lists.map(x => x.map(_.toDouble))).foreach(x => seqAccumD += x)
   seqAccumD.value
   // Seq[Double] = List(0.0, 1.0, 0.0, 1.0, 2.0, 0.0, 1.0, 2.0, 3.0, 0.0, 1.0, 2.0, 3.0, 4.0, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0)
    
   // For Vector
   val vecAccum = sc.accumulator(new Vector())(VectorAccumulatorParam[Vector])
   sc.parallelize(Array(1,2,3,4)).foreach(x => vecAccum += x)
   vecAccum.value
   
  }
}