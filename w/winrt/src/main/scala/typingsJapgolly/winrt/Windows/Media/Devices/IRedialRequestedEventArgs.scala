package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRedialRequestedEventArgs extends js.Object {
  def handled(): Unit
}

object IRedialRequestedEventArgs {
  @scala.inline
  def apply(handled: Callback): IRedialRequestedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handled")(handled.toJsFn)
    __obj.asInstanceOf[IRedialRequestedEventArgs]
  }
}

