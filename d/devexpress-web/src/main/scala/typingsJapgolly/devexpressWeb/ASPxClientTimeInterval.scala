package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the TimeInterval class.
  */
trait ASPxClientTimeInterval extends StObject {
  
  /**
    * Client-side function that determines whether the specified interval is contained within the current one. true if the specified interval is located within the current one; otherwise, false.
    * @param interval An ASPxClientTimeInterval object, representing the time interval to check.
    */
  def Contains(interval: ASPxClientTimeInterval): Boolean
  
  /**
    * Determines whether the specified object is equal to the current ASPxClientTimeInterval instance. true if the specified object is equal to the current ASPxClientTimeInterval instance; otherwise false.
    * @param interval The object to compare with the current object.
    */
  def Equals(interval: ASPxClientTimeInterval): Boolean
  
  /**
    * Gets a value indicating if the time interval is All-Day.
    */
  def GetAllDay(): Boolean
  
  /**
    * Client-side function that returns the duration of the specified time interval.
    */
  def GetDuration(): Double
  
  /**
    * Client-side function that returns the end time of the interval.
    */
  def GetEnd(): js.Date
  
  /**
    * Client-side function that returns the start time of the interval.
    */
  def GetStart(): js.Date
  
  /**
    * Checks if the current time interval intersects with the specified time interval. true, if the two time intervals intersect; otherwise, false.
    * @param interval A ASPxClientTimeInterval object which represents the time interval to be checked.
    */
  def IntersectsWith(interval: ASPxClientTimeInterval): Boolean
  
  /**
    * Checks if the current time interval intersects with the specified time interval. The boundaries of the time intervals are excluded from the check. true, if the two time intervals intersect; otherwise, false.
    * @param interval A ASPxClientTimeInterval object which represents the time interval to be checked.
    */
  def IntersectsWithExcludingBounds(interval: ASPxClientTimeInterval): Boolean
  
  /**
    * Sets a value specifying if the time interval is All-Day.
    * @param allDayValue true, if this is an all-day time interval; otherwise, false.
    */
  def SetAllDay(allDayValue: Boolean): Unit
  
  /**
    * Client-side function that returns the duration of the specified time interval.
    * @param value A TimeSpan  object, representing the duration of the time period.
    */
  def SetDuration(value: Any): Unit
  
  /**
    * Client-side function that sets the end time of the interval.
    * @param value A DateTime value, representing the end of the interval.
    */
  def SetEnd(value: js.Date): Unit
  
  /**
    * Client-side function that sets the start time of the interval.
    * @param value A DateTime value, representing the beginning of the interval.
    */
  def SetStart(value: js.Date): Unit
}
object ASPxClientTimeInterval {
  
  inline def apply(
    Contains: ASPxClientTimeInterval => Boolean,
    Equals: ASPxClientTimeInterval => Boolean,
    GetAllDay: CallbackTo[Boolean],
    GetDuration: CallbackTo[Double],
    GetEnd: CallbackTo[js.Date],
    GetStart: CallbackTo[js.Date],
    IntersectsWith: ASPxClientTimeInterval => Boolean,
    IntersectsWithExcludingBounds: ASPxClientTimeInterval => Boolean,
    SetAllDay: Boolean => Callback,
    SetDuration: Any => Callback,
    SetEnd: js.Date => Callback,
    SetStart: js.Date => Callback
  ): ASPxClientTimeInterval = {
    val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), Equals = js.Any.fromFunction1(Equals), GetAllDay = GetAllDay.toJsFn, GetDuration = GetDuration.toJsFn, GetEnd = GetEnd.toJsFn, GetStart = GetStart.toJsFn, IntersectsWith = js.Any.fromFunction1(IntersectsWith), IntersectsWithExcludingBounds = js.Any.fromFunction1(IntersectsWithExcludingBounds), SetAllDay = js.Any.fromFunction1((t0: Boolean) => SetAllDay(t0).runNow()), SetDuration = js.Any.fromFunction1((t0: Any) => SetDuration(t0).runNow()), SetEnd = js.Any.fromFunction1((t0: js.Date) => SetEnd(t0).runNow()), SetStart = js.Any.fromFunction1((t0: js.Date) => SetStart(t0).runNow()))
    __obj.asInstanceOf[ASPxClientTimeInterval]
  }
  
  extension [Self <: ASPxClientTimeInterval](x: Self) {
    
    inline def setContains(value: ASPxClientTimeInterval => Boolean): Self = StObject.set(x, "Contains", js.Any.fromFunction1(value))
    
    inline def setEquals(value: ASPxClientTimeInterval => Boolean): Self = StObject.set(x, "Equals", js.Any.fromFunction1(value))
    
    inline def setGetAllDay(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetAllDay", value.toJsFn)
    
    inline def setGetDuration(value: CallbackTo[Double]): Self = StObject.set(x, "GetDuration", value.toJsFn)
    
    inline def setGetEnd(value: CallbackTo[js.Date]): Self = StObject.set(x, "GetEnd", value.toJsFn)
    
    inline def setGetStart(value: CallbackTo[js.Date]): Self = StObject.set(x, "GetStart", value.toJsFn)
    
    inline def setIntersectsWith(value: ASPxClientTimeInterval => Boolean): Self = StObject.set(x, "IntersectsWith", js.Any.fromFunction1(value))
    
    inline def setIntersectsWithExcludingBounds(value: ASPxClientTimeInterval => Boolean): Self = StObject.set(x, "IntersectsWithExcludingBounds", js.Any.fromFunction1(value))
    
    inline def setSetAllDay(value: Boolean => Callback): Self = StObject.set(x, "SetAllDay", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetDuration(value: Any => Callback): Self = StObject.set(x, "SetDuration", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetEnd(value: js.Date => Callback): Self = StObject.set(x, "SetEnd", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setSetStart(value: js.Date => Callback): Self = StObject.set(x, "SetStart", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
  }
}
