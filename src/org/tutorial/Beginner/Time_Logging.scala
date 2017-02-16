package org.tutorial.Beginner

import org.apache.log4j.Level
import org.apache.log4j.Logger

/** Widely used levels of debugging are as follows
 *  ALL   = The ALL has the lowest possible rank and is intended to turn on all logging.
 *  DEBUG = Logs the most fine grained information which is required the most for debugging 
 *  FATAL = Logs the most severe error events that will presuamably lead application to abort 
 *  INFO  = Logs the information at coarse grained level
 *  OFF   = Turns off the logging
 *  WARN  = Logs the poetntially harmful situations
 *  
 *  Default Logging  = INFO 
 *  Level of logging => which tag of logger will run
 *  Ex :-
 *  If (loglevel = DEBUG) => Debug information will only be printed(logger.debug("*****DEBUG******"))   
 */

object Time_Logging {
   val startTime = UtilsTime.startTime
   lazy val logger = Logger.getLogger("Tutor Log")
   logger.setLevel(Level.DEBUG)
   logger.debug("******DEBUG STARTS******")
   
   def main(args :Array[String]):Unit =
  {
  logger.debug("Time taken " + UtilsTime.totalTime(startTime))
  logger.debug("******GOT THE TIME OF PROCESSING THIS APPLICATION SUCCESSFULLY******")
  }
   }