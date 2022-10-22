package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information defining the occurrences of a recurring client appointment.
  */
trait ASPxClientRecurrenceInfo extends StObject {
  
  /**
    * Gets the ordinal number of a day within a defined month.
    */
  def GetDayNumber(): Double
  
  /**
    * Gets the duration of the recurrence.
    */
  def GetDuration(): Double
  
  /**
    * Gets the recurrence end date.
    */
  def GetEnd(): js.Date
  
  /**
    * Gets the month (as a number) on which the corresponding appointment recurs.
    */
  def GetMonth(): Double
  
  /**
    * Gets how many times the appointment occurs.
    */
  def GetOccurrenceCount(): Double
  
  /**
    * Gets the frequency with which the corresponding appointment reoccurs (dependent on the recurrence Type).
    */
  def GetPeriodicity(): Double
  
  /**
    * Gets the type of the recurrence range.
    */
  def GetRange(): ASPxClientRecurrenceRange
  
  /**
    * Gets the time base for the frequency of the corresponding appointment reoccurrence.
    */
  def GetRecurrenceType(): ASPxClientRecurrenceType
  
  /**
    * Gets the recurrence start date.
    */
  def GetStart(): js.Date
  
  /**
    * Gets the day/days in a week on which the corresponding appointment occurs.
    */
  def GetWeekDays(): ASPxClientWeekDays
  
  /**
    * Gets the occurrence number of the week in a month for the recurrence pattern.
    */
  def GetWeekOfMonth(): ASPxClientWeekOfMonth
  
  /**
    * Sets the ordinal number of a day within a defined month.
    * @param dayNumber A positive integer value that specifies the day number within a month.
    */
  def SetDayNumber(dayNumber: Double): Unit
  
  /**
    * Sets the duration of the recurrence.
    * @param duration A TimeSpan object representing the duration.
    */
  def SetDuration(duration: Any): Unit
  
  /**
    * Sets the recurrence end date.
    * @param end A JavaScript Date object that specifies the end date for the recurrence.
    */
  def SetEnd(end: js.Date): Unit
  
  /**
    * Sets the month (as a number) on which the corresponding appointment occurs.
    * @param month A positive integer value that specifies the month's number.
    */
  def SetMonth(month: Double): Unit
  
  /**
    * Sets how many times the appointment occurs.
    * @param occurrenceCount An integer value that specifies how many times the appointment occurs.
    */
  def SetOccurrenceCount(occurrenceCount: Double): Unit
  
  /**
    * Sets the frequency with which the corresponding appointment occurs (dependent on the recurrence Type).
    * @param periodicity An integer value that specifies the frequency with which the corresponding appointment occurs.
    */
  def SetPeriodicity(periodicity: Double): Unit
  
  /**
    * Sets the type of the recurrence range.
    * @param range An ASPxClientRecurrenceRangeenumeration value that specifies the recurrence range type.
    */
  def SetRange(range: ASPxClientRecurrenceRange): Unit
  
  /**
    * Sets the time base for the frequency of the corresponding appointment occurrences.
    * @param type An ASPxClientRecurrenceType enumeration value that specifies the recurrence's frequency type.
    */
  def SetRecurrenceType(`type`: ASPxClientRecurrenceType): Unit
  
  /**
    * Sets the recurrence start date.
    * @param start A JavaScript date object value that specifies the start date for the recurrence.
    */
  def SetStart(start: js.Date): Unit
  
  /**
    * Sets the day/days in a week that the corresponding appointment recurs on.
    * @param weekDays The ASPxClientWeekDays enumeration value specifying the day/days in a week.
    */
  def SetWeekDays(weekDays: ASPxClientWeekDays): Unit
  
  /**
    * Sets the occurrence number of the week in a month for the recurrence pattern.
    * @param weekOfMonth A ASPxClientWeekOfMonth enumeration value that specifies a particular week in every month.
    */
  def SetWeekOfMonth(weekOfMonth: ASPxClientWeekOfMonth): Unit
}
object ASPxClientRecurrenceInfo {
  
  inline def apply(
    GetDayNumber: CallbackTo[Double],
    GetDuration: CallbackTo[Double],
    GetEnd: CallbackTo[js.Date],
    GetMonth: CallbackTo[Double],
    GetOccurrenceCount: CallbackTo[Double],
    GetPeriodicity: CallbackTo[Double],
    GetRange: CallbackTo[ASPxClientRecurrenceRange],
    GetRecurrenceType: CallbackTo[ASPxClientRecurrenceType],
    GetStart: CallbackTo[js.Date],
    GetWeekDays: CallbackTo[ASPxClientWeekDays],
    GetWeekOfMonth: CallbackTo[ASPxClientWeekOfMonth],
    SetDayNumber: Double => Callback,
    SetDuration: Any => Callback,
    SetEnd: js.Date => Callback,
    SetMonth: Double => Callback,
    SetOccurrenceCount: Double => Callback,
    SetPeriodicity: Double => Callback,
    SetRange: ASPxClientRecurrenceRange => Callback,
    SetRecurrenceType: ASPxClientRecurrenceType => Callback,
    SetStart: js.Date => Callback,
    SetWeekDays: ASPxClientWeekDays => Callback,
    SetWeekOfMonth: ASPxClientWeekOfMonth => Callback
  ): ASPxClientRecurrenceInfo = {
    val __obj = js.Dynamic.literal(GetDayNumber = GetDayNumber.toJsFn, GetDuration = GetDuration.toJsFn, GetEnd = GetEnd.toJsFn, GetMonth = GetMonth.toJsFn, GetOccurrenceCount = GetOccurrenceCount.toJsFn, GetPeriodicity = GetPeriodicity.toJsFn, GetRange = GetRange.toJsFn, GetRecurrenceType = GetRecurrenceType.toJsFn, GetStart = GetStart.toJsFn, GetWeekDays = GetWeekDays.toJsFn, GetWeekOfMonth = GetWeekOfMonth.toJsFn, SetDayNumber = js.Any.fromFunction1((t0: Double) => SetDayNumber(t0).runNow()), SetDuration = js.Any.fromFunction1((t0: Any) => SetDuration(t0).runNow()), SetEnd = js.Any.fromFunction1((t0: js.Date) => SetEnd(t0).runNow()), SetMonth = js.Any.fromFunction1((t0: Double) => SetMonth(t0).runNow()), SetOccurrenceCount = js.Any.fromFunction1((t0: Double) => SetOccurrenceCount(t0).runNow()), SetPeriodicity = js.Any.fromFunction1((t0: Double) => SetPeriodicity(t0).runNow()), SetRange = js.Any.fromFunction1((t0: ASPxClientRecurrenceRange) => SetRange(t0).runNow()), SetRecurrenceType = js.Any.fromFunction1((t0: ASPxClientRecurrenceType) => SetRecurrenceType(t0).runNow()), SetStart = js.Any.fromFunction1((t0: js.Date) => SetStart(t0).runNow()), SetWeekDays = js.Any.fromFunction1((t0: ASPxClientWeekDays) => SetWeekDays(t0).runNow()), SetWeekOfMonth = js.Any.fromFunction1((t0: ASPxClientWeekOfMonth) => SetWeekOfMonth(t0).runNow()))
    __obj.asInstanceOf[ASPxClientRecurrenceInfo]
  }
  
  extension [Self <: ASPxClientRecurrenceInfo](x: Self) {
    
    inline def setGetDayNumber(value: CallbackTo[Double]): Self = StObject.set(x, "GetDayNumber", value.toJsFn)
    
    inline def setGetDuration(value: CallbackTo[Double]): Self = StObject.set(x, "GetDuration", value.toJsFn)
    
    inline def setGetEnd(value: CallbackTo[js.Date]): Self = StObject.set(x, "GetEnd", value.toJsFn)
    
    inline def setGetMonth(value: CallbackTo[Double]): Self = StObject.set(x, "GetMonth", value.toJsFn)
    
    inline def setGetOccurrenceCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetOccurrenceCount", value.toJsFn)
    
    inline def setGetPeriodicity(value: CallbackTo[Double]): Self = StObject.set(x, "GetPeriodicity", value.toJsFn)
    
    inline def setGetRange(value: CallbackTo[ASPxClientRecurrenceRange]): Self = StObject.set(x, "GetRange", value.toJsFn)
    
    inline def setGetRecurrenceType(value: CallbackTo[ASPxClientRecurrenceType]): Self = StObject.set(x, "GetRecurrenceType", value.toJsFn)
    
    inline def setGetStart(value: CallbackTo[js.Date]): Self = StObject.set(x, "GetStart", value.toJsFn)
    
    inline def setGetWeekDays(value: CallbackTo[ASPxClientWeekDays]): Self = StObject.set(x, "GetWeekDays", value.toJsFn)
    
    inline def setGetWeekOfMonth(value: CallbackTo[ASPxClientWeekOfMonth]): Self = StObject.set(x, "GetWeekOfMonth", value.toJsFn)
    
    inline def setSetDayNumber(value: Double => Callback): Self = StObject.set(x, "SetDayNumber", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetDuration(value: Any => Callback): Self = StObject.set(x, "SetDuration", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetEnd(value: js.Date => Callback): Self = StObject.set(x, "SetEnd", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setSetMonth(value: Double => Callback): Self = StObject.set(x, "SetMonth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetOccurrenceCount(value: Double => Callback): Self = StObject.set(x, "SetOccurrenceCount", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetPeriodicity(value: Double => Callback): Self = StObject.set(x, "SetPeriodicity", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetRange(value: ASPxClientRecurrenceRange => Callback): Self = StObject.set(x, "SetRange", js.Any.fromFunction1((t0: ASPxClientRecurrenceRange) => value(t0).runNow()))
    
    inline def setSetRecurrenceType(value: ASPxClientRecurrenceType => Callback): Self = StObject.set(x, "SetRecurrenceType", js.Any.fromFunction1((t0: ASPxClientRecurrenceType) => value(t0).runNow()))
    
    inline def setSetStart(value: js.Date => Callback): Self = StObject.set(x, "SetStart", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    
    inline def setSetWeekDays(value: ASPxClientWeekDays => Callback): Self = StObject.set(x, "SetWeekDays", js.Any.fromFunction1((t0: ASPxClientWeekDays) => value(t0).runNow()))
    
    inline def setSetWeekOfMonth(value: ASPxClientWeekOfMonth => Callback): Self = StObject.set(x, "SetWeekOfMonth", js.Any.fromFunction1((t0: ASPxClientWeekOfMonth) => value(t0).runNow()))
  }
}
