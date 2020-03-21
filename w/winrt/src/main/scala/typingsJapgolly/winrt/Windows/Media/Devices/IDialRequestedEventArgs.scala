package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialRequestedEventArgs extends js.Object {
  var contact: js.Any
  def handled(): Unit
}

object IDialRequestedEventArgs {
  @scala.inline
  def apply(contact: js.Any, handled: Callback): IDialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any])
    __obj.updateDynamic("handled")(handled.toJsFn)
    __obj.asInstanceOf[IDialRequestedEventArgs]
  }
}

