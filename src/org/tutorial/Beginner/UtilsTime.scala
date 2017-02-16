package org.tutorial.Beginner

import org.joda.time.DateTime
import org.joda.time.Interval

/** Here we have start time and
 *  time interval calculating 
 *  functionality. 
 */
object UtilsTime {
    val startTime: DateTime = new DateTime()
    def totalTime(start: DateTime) = new Interval(start, new DateTime()).toPeriod
}