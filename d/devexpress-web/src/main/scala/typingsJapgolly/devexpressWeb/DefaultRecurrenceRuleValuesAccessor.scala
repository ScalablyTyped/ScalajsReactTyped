package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object providing access to an ASPxClientRecurrenceControlBase control's editor values.
  */
trait DefaultRecurrenceRuleValuesAccessor extends StObject {
  
  /**
    * Gets the number of the month's day in which the appointment is scheduled.
    */
  def GetDayNumber(): Double
  
  /**
    * Gets or sets the month's number.
    */
  def GetMonth(): Double
  
  /**
    * Get the frequency with which the appointment occurs with respect to the appointment's recurrence type.
    */
  def GetPeriodicity(): Double
  
  /**
    * Gets the days of the week on which a weekly recurrent appointment is scheduled.
    */
  def GetWeekDays(): ASPxClientWeekDays
  
  /**
    * Gets the number of the week in a month when an appointment is scheduled.
    */
  def GetWeekOfMonth(): ASPxClientWeekOfMonth
}
object DefaultRecurrenceRuleValuesAccessor {
  
  inline def apply(
    GetDayNumber: CallbackTo[Double],
    GetMonth: CallbackTo[Double],
    GetPeriodicity: CallbackTo[Double],
    GetWeekDays: CallbackTo[ASPxClientWeekDays],
    GetWeekOfMonth: CallbackTo[ASPxClientWeekOfMonth]
  ): DefaultRecurrenceRuleValuesAccessor = {
    val __obj = js.Dynamic.literal(GetDayNumber = GetDayNumber.toJsFn, GetMonth = GetMonth.toJsFn, GetPeriodicity = GetPeriodicity.toJsFn, GetWeekDays = GetWeekDays.toJsFn, GetWeekOfMonth = GetWeekOfMonth.toJsFn)
    __obj.asInstanceOf[DefaultRecurrenceRuleValuesAccessor]
  }
  
  extension [Self <: DefaultRecurrenceRuleValuesAccessor](x: Self) {
    
    inline def setGetDayNumber(value: CallbackTo[Double]): Self = StObject.set(x, "GetDayNumber", value.toJsFn)
    
    inline def setGetMonth(value: CallbackTo[Double]): Self = StObject.set(x, "GetMonth", value.toJsFn)
    
    inline def setGetPeriodicity(value: CallbackTo[Double]): Self = StObject.set(x, "GetPeriodicity", value.toJsFn)
    
    inline def setGetWeekDays(value: CallbackTo[ASPxClientWeekDays]): Self = StObject.set(x, "GetWeekDays", value.toJsFn)
    
    inline def setGetWeekOfMonth(value: CallbackTo[ASPxClientWeekOfMonth]): Self = StObject.set(x, "GetWeekOfMonth", value.toJsFn)
  }
}
