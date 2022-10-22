package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlCalendarViewMode
import typingsJapgolly.activexOutlook.Outlook.OlDayWeekTimeScale
import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import typingsJapgolly.activexOutlook.Outlook.OlViewSaveOption
import typingsJapgolly.activexOutlook.Outlook.OlViewType
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.CalendarView")
@js.native
/* private */ open class CalendarView ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.CalendarView {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override def Apply(): Unit = js.native
  
  /* CompleteClass */
  override val AutoFormatRules: typingsJapgolly.activexOutlook.Outlook.AutoFormatRules = js.native
  
  /* CompleteClass */
  var BoldDatesWithItems: Boolean = js.native
  
  /* CompleteClass */
  var BoldSubjects: Boolean = js.native
  
  /* CompleteClass */
  var CalendarViewMode: OlCalendarViewMode = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def Copy(Name: String, SaveOption: OlViewSaveOption): typingsJapgolly.activexOutlook.Outlook.View = js.native
  
  /* CompleteClass */
  override val DayWeekFont: typingsJapgolly.activexOutlook.Outlook.ViewFont = js.native
  
  /* CompleteClass */
  override val DayWeekTimeFont: typingsJapgolly.activexOutlook.Outlook.ViewFont = js.native
  
  /* CompleteClass */
  var DayWeekTimeScale: OlDayWeekTimeScale = js.native
  
  /* CompleteClass */
  var DaysInMultiDayMode: Double = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val DisplayedDates: Any = js.native
  
  /* CompleteClass */
  var EndField: String = js.native
  
  /* CompleteClass */
  var Filter: String = js.native
  
  /* CompleteClass */
  override def GoToDate(Date: VarDate): Unit = js.native
  
  /* CompleteClass */
  var Language: String = js.native
  
  /* CompleteClass */
  var LockUserChanges: Boolean = js.native
  
  /* CompleteClass */
  override val MonthFont: typingsJapgolly.activexOutlook.Outlook.ViewFont = js.native
  
  /* CompleteClass */
  var MonthShowEndTime: Boolean = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.CalendarView_typekey")
  var OutlookDotCalendarView_typekey: typingsJapgolly.activexOutlook.Outlook.CalendarView = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Reset(): Unit = js.native
  
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /* CompleteClass */
  override val SaveOption: OlViewSaveOption = js.native
  
  /* CompleteClass */
  override val SelectedEndTime: VarDate = js.native
  
  /* CompleteClass */
  override val SelectedStartTime: VarDate = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override val Standard: Boolean = js.native
  
  /* CompleteClass */
  var StartField: String = js.native
  
  /* CompleteClass */
  override val ViewType: OlViewType = js.native
  
  /* CompleteClass */
  var XML: String = js.native
}
