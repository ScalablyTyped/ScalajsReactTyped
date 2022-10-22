package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlDaysOfWeek
import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import typingsJapgolly.activexOutlook.Outlook.OlRecurrenceType
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.RecurrencePattern")
@js.native
/* private */ open class RecurrencePattern ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.RecurrencePattern {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  var DayOfMonth: Double = js.native
  
  /* CompleteClass */
  var DayOfWeekMask: OlDaysOfWeek = js.native
  
  /* CompleteClass */
  var Duration: Double = js.native
  
  /* CompleteClass */
  var EndTime: VarDate = js.native
  
  /* CompleteClass */
  override val Exceptions: typingsJapgolly.activexOutlook.Outlook.Exceptions = js.native
  
  /* CompleteClass */
  override def GetOccurrence(StartDate: VarDate): typingsJapgolly.activexOutlook.Outlook.AppointmentItem = js.native
  
  /* CompleteClass */
  var Instance: Double = js.native
  
  /* CompleteClass */
  var Interval: Double = js.native
  
  /* CompleteClass */
  var MonthOfYear: Double = js.native
  
  /* CompleteClass */
  var NoEndDate: Boolean = js.native
  
  /* CompleteClass */
  var Occurrences: Double = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.RecurrencePattern_typekey")
  var OutlookDotRecurrencePattern_typekey: typingsJapgolly.activexOutlook.Outlook.RecurrencePattern = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var PatternEndDate: VarDate = js.native
  
  /* CompleteClass */
  var PatternStartDate: VarDate = js.native
  
  /* CompleteClass */
  var RecurrenceType: OlRecurrenceType = js.native
  
  /* CompleteClass */
  var Regenerate: Boolean = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  var StartTime: VarDate = js.native
}
