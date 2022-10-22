package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Video
// Non-entity
trait ExtensionSchedule extends StObject {
  
  def getDayOfWeek(): DayOfWeekString
  
  def getEndHour(): Double
  
  def getEndMinute(): Double
  
  def getStartHour(): Double
  
  def getStartMinute(): Double
}
object ExtensionSchedule {
  
  inline def apply(
    getDayOfWeek: CallbackTo[DayOfWeekString],
    getEndHour: CallbackTo[Double],
    getEndMinute: CallbackTo[Double],
    getStartHour: CallbackTo[Double],
    getStartMinute: CallbackTo[Double]
  ): ExtensionSchedule = {
    val __obj = js.Dynamic.literal(getDayOfWeek = getDayOfWeek.toJsFn, getEndHour = getEndHour.toJsFn, getEndMinute = getEndMinute.toJsFn, getStartHour = getStartHour.toJsFn, getStartMinute = getStartMinute.toJsFn)
    __obj.asInstanceOf[ExtensionSchedule]
  }
  
  extension [Self <: ExtensionSchedule](x: Self) {
    
    inline def setGetDayOfWeek(value: CallbackTo[DayOfWeekString]): Self = StObject.set(x, "getDayOfWeek", value.toJsFn)
    
    inline def setGetEndHour(value: CallbackTo[Double]): Self = StObject.set(x, "getEndHour", value.toJsFn)
    
    inline def setGetEndMinute(value: CallbackTo[Double]): Self = StObject.set(x, "getEndMinute", value.toJsFn)
    
    inline def setGetStartHour(value: CallbackTo[Double]): Self = StObject.set(x, "getStartHour", value.toJsFn)
    
    inline def setGetStartMinute(value: CallbackTo[Double]): Self = StObject.set(x, "getStartMinute", value.toJsFn)
  }
}
