package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object providing access to an ASPxClientMonthlyRecurrenceControl's editor values.
  */
@JSGlobal("MonthlyRecurrenceValuesAccessor")
@js.native
open class MonthlyRecurrenceValuesAccessor protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.MonthlyRecurrenceValuesAccessor {
  /**
    * Initializes a new instance of the MonthlyRecurrenceValuesAccessor object. For internal use only.
    * @param recurrenceControl A ASPxClientRecurrenceControlBase object specifying the required recurrence control.
    */
  def this(recurrenceControl: typingsJapgolly.devexpressWeb.ASPxClientRecurrenceControlBase) = this()
  
  /**
    * Gets the number of the month's day in which the appointment is scheduled.
    */
  /* CompleteClass */
  override def GetDayNumber(): Double = js.native
  
  /**
    * Gets or sets the month's number.
    */
  /* CompleteClass */
  override def GetMonth(): Double = js.native
  
  /**
    * Get the frequency with which the appointment occurs with respect to the appointment's recurrence type.
    */
  /* CompleteClass */
  override def GetPeriodicity(): Double = js.native
  
  /**
    * Gets the days of the week on which a weekly recurrent appointment is scheduled.
    */
  /* CompleteClass */
  override def GetWeekDays(): typingsJapgolly.devexpressWeb.ASPxClientWeekDays = js.native
  
  /**
    * Gets the number of the week in a month when an appointment is scheduled.
    */
  /* CompleteClass */
  override def GetWeekOfMonth(): typingsJapgolly.devexpressWeb.ASPxClientWeekOfMonth = js.native
}
