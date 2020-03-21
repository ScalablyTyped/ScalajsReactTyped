package typingsJapgolly.officeUiFabricReact.spinButtonTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinButton extends js.Object {
  /**
    * The value of the SpinButton. Use this if you intend to pass in a new value as a result of onChange events.
    * This value is mutually exclusive to defaultValue. Use one or the other.
    */
  var value: js.UndefOr[String] = js.undefined
  /**
    * Sets focus to the spin button.
    */
  def focus(): Unit
}

object ISpinButton {
  @scala.inline
  def apply(focus: Callback, value: String = null): ISpinButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinButton]
  }
}

