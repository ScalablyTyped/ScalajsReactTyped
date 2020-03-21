package typingsJapgolly.winrt.Windows.UI.Notifications

import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBadgeNotification extends js.Object {
  var content: XmlDocument
  var expirationTime: js.Date
}

object IBadgeNotification {
  @scala.inline
  def apply(content: XmlDocument, expirationTime: js.Date): IBadgeNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBadgeNotification]
  }
}

