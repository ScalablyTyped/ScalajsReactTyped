package typingsJapgolly.winrt.Windows.Networking.PushNotifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRawNotification extends js.Object {
  var content: String
}

object IRawNotification {
  @scala.inline
  def apply(content: String): IRawNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRawNotification]
  }
}

