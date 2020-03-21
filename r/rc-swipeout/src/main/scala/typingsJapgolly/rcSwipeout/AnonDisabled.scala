package typingsJapgolly.rcSwipeout

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled extends js.Object {
  var autoClose: Boolean
  var disabled: Boolean
  def onClose(): Unit
  def onOpen(): Unit
}

object AnonDisabled {
  @scala.inline
  def apply(autoClose: Boolean, disabled: Boolean, onClose: Callback, onOpen: Callback): AnonDisabled = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any])
    __obj.updateDynamic("onClose")(onClose.toJsFn)
    __obj.updateDynamic("onOpen")(onOpen.toJsFn)
    __obj.asInstanceOf[AnonDisabled]
  }
}

