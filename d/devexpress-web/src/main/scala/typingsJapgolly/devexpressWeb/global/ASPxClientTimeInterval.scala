package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the TimeInterval class.
  */
@JSGlobal("ASPxClientTimeInterval")
@js.native
open class ASPxClientTimeInterval protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientTimeInterval {
  /**
    * Initializes a new instance of the ASPxClientTimeInterval class with the specified start time and duration.
    * @param start A DateTime object, representing the beginning of the period.
    * @param duration A TimeSpan structure, representing a time interval.
    */
  def this(start: js.Date, duration: Any) = this()
  
  /**
    * Client-side function that determines whether the specified interval is contained within the current one. true if the specified interval is located within the current one; otherwise, false.
    * @param interval An ASPxClientTimeInterval object, representing the time interval to check.
    */
  /* CompleteClass */
  override def Contains(interval: typingsJapgolly.devexpressWeb.ASPxClientTimeInterval): Boolean = js.native
  
  /**
    * Determines whether the specified object is equal to the current ASPxClientTimeInterval instance. true if the specified object is equal to the current ASPxClientTimeInterval instance; otherwise false.
    * @param interval The object to compare with the current object.
    */
  /* CompleteClass */
  override def Equals(interval: typingsJapgolly.devexpressWeb.ASPxClientTimeInterval): Boolean = js.native
  
  /**
    * Gets a value indicating if the time interval is All-Day.
    */
  /* CompleteClass */
  override def GetAllDay(): Boolean = js.native
  
  /**
    * Client-side function that returns the duration of the specified time interval.
    */
  /* CompleteClass */
  override def GetDuration(): Double = js.native
  
  /**
    * Client-side function that returns the end time of the interval.
    */
  /* CompleteClass */
  override def GetEnd(): js.Date = js.native
  
  /**
    * Client-side function that returns the start time of the interval.
    */
  /* CompleteClass */
  override def GetStart(): js.Date = js.native
  
  /**
    * Checks if the current time interval intersects with the specified time interval. true, if the two time intervals intersect; otherwise, false.
    * @param interval A ASPxClientTimeInterval object which represents the time interval to be checked.
    */
  /* CompleteClass */
  override def IntersectsWith(interval: typingsJapgolly.devexpressWeb.ASPxClientTimeInterval): Boolean = js.native
  
  /**
    * Checks if the current time interval intersects with the specified time interval. The boundaries of the time intervals are excluded from the check. true, if the two time intervals intersect; otherwise, false.
    * @param interval A ASPxClientTimeInterval object which represents the time interval to be checked.
    */
  /* CompleteClass */
  override def IntersectsWithExcludingBounds(interval: typingsJapgolly.devexpressWeb.ASPxClientTimeInterval): Boolean = js.native
  
  /**
    * Sets a value specifying if the time interval is All-Day.
    * @param allDayValue true, if this is an all-day time interval; otherwise, false.
    */
  /* CompleteClass */
  override def SetAllDay(allDayValue: Boolean): Unit = js.native
  
  /**
    * Client-side function that returns the duration of the specified time interval.
    * @param value A TimeSpan  object, representing the duration of the time period.
    */
  /* CompleteClass */
  override def SetDuration(value: Any): Unit = js.native
  
  /**
    * Client-side function that sets the end time of the interval.
    * @param value A DateTime value, representing the end of the interval.
    */
  /* CompleteClass */
  override def SetEnd(value: js.Date): Unit = js.native
  
  /**
    * Client-side function that sets the start time of the interval.
    * @param value A DateTime value, representing the beginning of the interval.
    */
  /* CompleteClass */
  override def SetStart(value: js.Date): Unit = js.native
}
object ASPxClientTimeInterval {
  
  @JSGlobal("ASPxClientTimeInterval")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Calculates the time interval duration. An integer value specifying the interval duration in milliseconds.
    * @param start A DateTime value that specifies the start date time value.
    * @param end A DateTime value that specifies the end date time value.
    */
  /* static member */
  inline def CalculateDuration(start: js.Date, end: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("CalculateDuration")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
}
