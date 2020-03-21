package typingsJapgolly.winrt.Windows.UI.Notifications

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBadgeNotificationFactory extends js.Object {
  def createBadgeNotification(content: XmlDocument): BadgeNotification
}

object IBadgeNotificationFactory {
  @scala.inline
  def apply(createBadgeNotification: XmlDocument => CallbackTo[BadgeNotification]): IBadgeNotificationFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createBadgeNotification")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument) => createBadgeNotification(t0).runNow()))
    __obj.asInstanceOf[IBadgeNotificationFactory]
  }
}

