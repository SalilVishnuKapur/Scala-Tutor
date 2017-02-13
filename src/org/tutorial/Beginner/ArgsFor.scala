package org.tutorial.Beginner


/** Here we explain arguments 
 *  and for loop. In specific 
 *  how to use until and
 *  to in for loops.
 */
object ArgsFor {
  def main(args : Array[String] ) :Unit =
  {
    val arg1=args(0) 
    val arg2=args(1)
    val arg3=args(2)
    
    
    /**Using until we can
     * iterate through all
     * elements except the
     * last one.
     */
    for(i <- 0 until 10)
    {
      println("Index using Untill = "+i)
    }
    
    /**Using to we can
     * iterate through all
     * elements including the
     * last one.
     */
    for(i <- 0 to 10)
    {
      println("Indexof using To = "+i)
    }
    
    
    
    println("Arguments passed are as follows "+arg1+" "+arg2+" "+arg3)
  }
}