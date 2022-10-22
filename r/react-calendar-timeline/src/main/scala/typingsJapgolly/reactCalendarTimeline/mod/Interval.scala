package typingsJapgolly.reactCalendarTimeline.mod

import typingsJapgolly.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interval extends StObject {
  
  var endTime: Moment
  
  var startTime: Moment
}
object Interval {
  
  inline def apply(endTime: Moment, startTime: Moment): Interval = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
  
  extension [Self <: Interval](x: Self) {
    
    inline def setEndTime(value: Moment): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Moment): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
