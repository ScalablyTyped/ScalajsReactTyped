package typingsJapgolly.winrt.Windows.UI.Notifications

import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScheduledToastNotificationFactory extends js.Object {
  def createScheduledToastNotification(content: XmlDocument, deliveryTime: js.Date): ScheduledToastNotification = js.native
  def createScheduledToastNotification(content: XmlDocument, deliveryTime: js.Date, snoozeInterval: Double, maximumSnoozeCount: Double): ScheduledToastNotification = js.native
}

