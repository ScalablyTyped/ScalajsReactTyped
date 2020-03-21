package typingsJapgolly.materialRadio.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialSelectionControl.mod.MDCSelectionControlState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCRadioAdapter extends js.Object {
  def addClass(className: String): Unit
  def getNativeControl(): MDCSelectionControlState
  def removeClass(className: String): Unit
}

object MDCRadioAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    getNativeControl: CallbackTo[MDCSelectionControlState],
    removeClass: String => Callback
  ): MDCRadioAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("getNativeControl")(getNativeControl.toJsFn)
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.asInstanceOf[MDCRadioAdapter]
  }
}

