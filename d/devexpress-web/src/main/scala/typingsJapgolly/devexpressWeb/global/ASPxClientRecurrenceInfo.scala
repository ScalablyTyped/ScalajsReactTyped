package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information defining the occurrences of a recurring client appointment.
  */
@JSGlobal("ASPxClientRecurrenceInfo")
@js.native
/**
  * Initializes a new instance of the ASPxClientRecurrenceInfo class with default settings.
  */
open class ASPxClientRecurrenceInfo ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientRecurrenceInfo {
  
  /**
    * Gets the ordinal number of a day within a defined month.
    */
  /* CompleteClass */
  override def GetDayNumber(): Double = js.native
  
  /**
    * Gets the duration of the recurrence.
    */
  /* CompleteClass */
  override def GetDuration(): Double = js.native
  
  /**
    * Gets the recurrence end date.
    */
  /* CompleteClass */
  override def GetEnd(): js.Date = js.native
  
  /**
    * Gets the month (as a number) on which the corresponding appointment recurs.
    */
  /* CompleteClass */
  override def GetMonth(): Double = js.native
  
  /**
    * Gets how many times the appointment occurs.
    */
  /* CompleteClass */
  override def GetOccurrenceCount(): Double = js.native
  
  /**
    * Gets the frequency with which the corresponding appointment reoccurs (dependent on the recurrence Type).
    */
  /* CompleteClass */
  override def GetPeriodicity(): Double = js.native
  
  /**
    * Gets the type of the recurrence range.
    */
  /* CompleteClass */
  override def GetRange(): typingsJapgolly.devexpressWeb.ASPxClientRecurrenceRange = js.native
  
  /**
    * Gets the time base for the frequency of the corresponding appointment reoccurrence.
    */
  /* CompleteClass */
  override def GetRecurrenceType(): typingsJapgolly.devexpressWeb.ASPxClientRecurrenceType = js.native
  
  /**
    * Gets the recurrence start date.
    */
  /* CompleteClass */
  override def GetStart(): js.Date = js.native
  
  /**
    * Gets the day/days in a week on which the corresponding appointment occurs.
    */
  /* CompleteClass */
  override def GetWeekDays(): typingsJapgolly.devexpressWeb.ASPxClientWeekDays = js.native
  
  /**
    * Gets the occurrence number of the week in a month for the recurrence pattern.
    */
  /* CompleteClass */
  override def GetWeekOfMonth(): typingsJapgolly.devexpressWeb.ASPxClientWeekOfMonth = js.native
  
  /**
    * Sets the ordinal number of a day within a defined month.
    * @param dayNumber A positive integer value that specifies the day number within a month.
    */
  /* CompleteClass */
  override def SetDayNumber(dayNumber: Double): Unit = js.native
  
  /**
    * Sets the duration of the recurrence.
    * @param duration A TimeSpan object representing the duration.
    */
  /* CompleteClass */
  override def SetDuration(duration: Any): Unit = js.native
  
  /**
    * Sets the recurrence end date.
    * @param end A JavaScript Date object that specifies the end date for the recurrence.
    */
  /* CompleteClass */
  override def SetEnd(end: js.Date): Unit = js.native
  
  /**
    * Sets the month (as a number) on which the corresponding appointment occurs.
    * @param month A positive integer value that specifies the month's number.
    */
  /* CompleteClass */
  override def SetMonth(month: Double): Unit = js.native
  
  /**
    * Sets how many times the appointment occurs.
    * @param occurrenceCount An integer value that specifies how many times the appointment occurs.
    */
  /* CompleteClass */
  override def SetOccurrenceCount(occurrenceCount: Double): Unit = js.native
  
  /**
    * Sets the frequency with which the corresponding appointment occurs (dependent on the recurrence Type).
    * @param periodicity An integer value that specifies the frequency with which the corresponding appointment occurs.
    */
  /* CompleteClass */
  override def SetPeriodicity(periodicity: Double): Unit = js.native
  
  /**
    * Sets the type of the recurrence range.
    * @param range An ASPxClientRecurrenceRangeenumeration value that specifies the recurrence range type.
    */
  /* CompleteClass */
  override def SetRange(range: typingsJapgolly.devexpressWeb.ASPxClientRecurrenceRange): Unit = js.native
  
  /**
    * Sets the time base for the frequency of the corresponding appointment occurrences.
    * @param type An ASPxClientRecurrenceType enumeration value that specifies the recurrence's frequency type.
    */
  /* CompleteClass */
  override def SetRecurrenceType(`type`: typingsJapgolly.devexpressWeb.ASPxClientRecurrenceType): Unit = js.native
  
  /**
    * Sets the recurrence start date.
    * @param start A JavaScript date object value that specifies the start date for the recurrence.
    */
  /* CompleteClass */
  override def SetStart(start: js.Date): Unit = js.native
  
  /**
    * Sets the day/days in a week that the corresponding appointment recurs on.
    * @param weekDays The ASPxClientWeekDays enumeration value specifying the day/days in a week.
    */
  /* CompleteClass */
  override def SetWeekDays(weekDays: typingsJapgolly.devexpressWeb.ASPxClientWeekDays): Unit = js.native
  
  /**
    * Sets the occurrence number of the week in a month for the recurrence pattern.
    * @param weekOfMonth A ASPxClientWeekOfMonth enumeration value that specifies a particular week in every month.
    */
  /* CompleteClass */
  override def SetWeekOfMonth(weekOfMonth: typingsJapgolly.devexpressWeb.ASPxClientWeekOfMonth): Unit = js.native
}
