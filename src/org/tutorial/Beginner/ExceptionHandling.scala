package org.tutorial.Beginner

import java.util.Calendar
import java.time.DateTimeException
import java.time.LocalTime

object ExceptionHandling {

  /** Here we use try catch
   *  to raise exception
   *  in case an issue comes
   *  up.
   */
	def main(args: Array[String]) {
	  try {
		 	val now = Calendar.getInstance()
     val currentMinute = now.get(Calendar.MINUTE)
		} catch {
		
		case ex: DateTimeException  => {
			println("Incorrect time exception")
		}
	
		} finally {
			println("Exiting finally...")
		}
	}
}