package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Reminder")
@js.native
class Reminder protected () extends js.Object {
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  val Caption: String = js.native
  val Class: OlObjectClass = js.native
  val IsVisible: Boolean = js.native
  val Item: js.Any = js.native
  val NextReminderDate: VarDate = js.native
  val OriginalReminderDate: VarDate = js.native
  @JSName("Outlook.Reminder_typekey")
  var OutlookDotReminder_typekey: Reminder = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Dismiss(): Unit = js.native
  def Snooze(): Unit = js.native
  def Snooze(SnoozeTime: js.Any): Unit = js.native
}

