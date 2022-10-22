package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reminder extends StObject {
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  val Caption: String = js.native
  
  val Class: OlObjectClass = js.native
  
  def Dismiss(): Unit = js.native
  
  val IsVisible: Boolean = js.native
  
  val Item: Any = js.native
  
  val NextReminderDate: VarDate = js.native
  
  val OriginalReminderDate: VarDate = js.native
  
  /* private */ @JSName("Outlook.Reminder_typekey")
  var OutlookDotReminder_typekey: Reminder = js.native
  
  val Parent: Any = js.native
  
  val Session: NameSpace = js.native
  
  def Snooze(): Unit = js.native
  def Snooze(SnoozeTime: Any): Unit = js.native
}
