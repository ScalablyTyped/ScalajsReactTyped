package typingsJapgolly.winrt.Windows.Networking.PushNotifications

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPushNotificationChannel extends js.Object {
  var expirationTime: js.Date
  var onpushnotificationreceived: js.Any
  var uri: String
  def close(): Unit
}

object IPushNotificationChannel {
  @scala.inline
  def apply(close: Callback, expirationTime: js.Date, onpushnotificationreceived: js.Any, uri: String): IPushNotificationChannel = {
    val __obj = js.Dynamic.literal(expirationTime = expirationTime.asInstanceOf[js.Any], onpushnotificationreceived = onpushnotificationreceived.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[IPushNotificationChannel]
  }
}

