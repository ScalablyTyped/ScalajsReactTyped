package typingsJapgolly.winrt.Windows.System.Threading.Core

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignalNotifier extends js.Object {
  def enable(): Unit
  def terminate(): Unit
}

object ISignalNotifier {
  @scala.inline
  def apply(enable: Callback, terminate: Callback): ISignalNotifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.updateDynamic("terminate")(terminate.toJsFn)
    __obj.asInstanceOf[ISignalNotifier]
  }
}

