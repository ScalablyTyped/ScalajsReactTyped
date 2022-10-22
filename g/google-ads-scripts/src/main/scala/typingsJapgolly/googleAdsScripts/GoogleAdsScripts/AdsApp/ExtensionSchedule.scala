package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents one period of a Google Ads ad extension schedule. For instance, if an ad extension were set up to only show on ads on weekdays
  * from 09:00 to 18:00, it would have five ExtensionSchedules: one for Monday 09:00 - 18:00, one for Tuesday 09:00 - 18:00, and so on.
  */
trait ExtensionSchedule extends StObject {
  
  /** Returns the day of week this schedule applies to. */
  def getDayOfWeek(): ExtensionScheduleDayOfWeekType
  
  /** Returns the ending hour of this schedule. */
  def getEndHour(): Double
  
  /** Returns the ending minute of this schedule. */
  def getEndMinute(): Double
  
  /** Returns the type of this entity as a String, in this case, "ExtensionSchedule". */
  def getEntityType(): String
  
  /** Returns the starting hour of this schedule. */
  def getStartHour(): Double
  
  /** Returns the starting minute of this schedule. */
  def getStartMinute(): Double
}
object ExtensionSchedule {
  
  inline def apply(
    getDayOfWeek: CallbackTo[ExtensionScheduleDayOfWeekType],
    getEndHour: CallbackTo[Double],
    getEndMinute: CallbackTo[Double],
    getEntityType: CallbackTo[String],
    getStartHour: CallbackTo[Double],
    getStartMinute: CallbackTo[Double]
  ): ExtensionSchedule = {
    val __obj = js.Dynamic.literal(getDayOfWeek = getDayOfWeek.toJsFn, getEndHour = getEndHour.toJsFn, getEndMinute = getEndMinute.toJsFn, getEntityType = getEntityType.toJsFn, getStartHour = getStartHour.toJsFn, getStartMinute = getStartMinute.toJsFn)
    __obj.asInstanceOf[ExtensionSchedule]
  }
  
  extension [Self <: ExtensionSchedule](x: Self) {
    
    inline def setGetDayOfWeek(value: CallbackTo[ExtensionScheduleDayOfWeekType]): Self = StObject.set(x, "getDayOfWeek", value.toJsFn)
    
    inline def setGetEndHour(value: CallbackTo[Double]): Self = StObject.set(x, "getEndHour", value.toJsFn)
    
    inline def setGetEndMinute(value: CallbackTo[Double]): Self = StObject.set(x, "getEndMinute", value.toJsFn)
    
    inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
    
    inline def setGetStartHour(value: CallbackTo[Double]): Self = StObject.set(x, "getStartHour", value.toJsFn)
    
    inline def setGetStartMinute(value: CallbackTo[Double]): Self = StObject.set(x, "getStartMinute", value.toJsFn)
  }
}
