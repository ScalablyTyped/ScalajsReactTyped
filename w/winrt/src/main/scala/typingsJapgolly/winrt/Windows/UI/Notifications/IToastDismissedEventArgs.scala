package typingsJapgolly.winrt.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastDismissedEventArgs extends js.Object {
  var reason: ToastDismissalReason
}

object IToastDismissedEventArgs {
  @scala.inline
  def apply(reason: ToastDismissalReason): IToastDismissedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IToastDismissedEventArgs]
  }
}

