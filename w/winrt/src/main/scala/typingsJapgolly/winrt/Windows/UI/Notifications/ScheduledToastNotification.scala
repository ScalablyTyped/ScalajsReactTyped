package typingsJapgolly.winrt.Windows.UI.Notifications

import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.ScheduledToastNotification")
@js.native
class ScheduledToastNotification protected () extends IScheduledToastNotification {
  def this(content: XmlDocument, deliveryTime: js.Date) = this()
  def this(content: XmlDocument, deliveryTime: js.Date, snoozeInterval: Double, maximumSnoozeCount: Double) = this()
  /* CompleteClass */
  override var content: XmlDocument = js.native
  /* CompleteClass */
  override var deliveryTime: js.Date = js.native
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var maximumSnoozeCount: Double = js.native
  /* CompleteClass */
  override var snoozeInterval: Double = js.native
}

