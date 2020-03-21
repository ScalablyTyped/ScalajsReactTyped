package typingsJapgolly.winrt.Windows.UI.Notifications

import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledToastNotification extends js.Object {
  var content: XmlDocument
  var deliveryTime: js.Date
  var id: String
  var maximumSnoozeCount: Double
  var snoozeInterval: Double
}

object IScheduledToastNotification {
  @scala.inline
  def apply(
    content: XmlDocument,
    deliveryTime: js.Date,
    id: String,
    maximumSnoozeCount: Double,
    snoozeInterval: Double
  ): IScheduledToastNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], deliveryTime = deliveryTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maximumSnoozeCount = maximumSnoozeCount.asInstanceOf[js.Any], snoozeInterval = snoozeInterval.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IScheduledToastNotification]
  }
}

