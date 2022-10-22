package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlCalendarDetail
import typingsJapgolly.activexOutlook.Outlook.OlCalendarMailFormat
import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.CalendarSharing")
@js.native
/* private */ open class CalendarSharing ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.CalendarSharing {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  var CalendarDetail: OlCalendarDetail = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  var EndDate: VarDate = js.native
  
  /* CompleteClass */
  override val Folder: typingsJapgolly.activexOutlook.Outlook.Folder = js.native
  
  /* CompleteClass */
  override def ForwardAsICal(MailFormat: OlCalendarMailFormat): typingsJapgolly.activexOutlook.Outlook.MailItem = js.native
  
  /* CompleteClass */
  var IncludeAttachments: Boolean = js.native
  
  /* CompleteClass */
  var IncludePrivateDetails: Boolean = js.native
  
  /* CompleteClass */
  var IncludeWholeCalendar: Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.CalendarSharing_typekey")
  var OutlookDotCalendarSharing_typekey: typingsJapgolly.activexOutlook.Outlook.CalendarSharing = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var RestrictToWorkingHours: Boolean = js.native
  
  /* CompleteClass */
  override def SaveAsICal(Path: String): Unit = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  var StartDate: VarDate = js.native
}
