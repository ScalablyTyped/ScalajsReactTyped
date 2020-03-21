package typingsJapgolly.limeJs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransportStateListener extends js.Object {
  def onClose(): Unit
  def onError(error: String): Unit
  def onOpen(): Unit
}

object ITransportStateListener {
  @scala.inline
  def apply(onClose: Callback, onError: String => Callback, onOpen: Callback): ITransportStateListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onClose")(onClose.toJsFn)
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: java.lang.String) => onError(t0).runNow()))
    __obj.updateDynamic("onOpen")(onOpen.toJsFn)
    __obj.asInstanceOf[ITransportStateListener]
  }
}

