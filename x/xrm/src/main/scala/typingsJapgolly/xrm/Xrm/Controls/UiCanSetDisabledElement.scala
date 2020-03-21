package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UI elements which can have the disabled value updated.
  */
trait UiCanSetDisabledElement extends js.Object {
  /**
    * Sets the state of the control to either enabled, or disabled.
    * @param disabled true to disable, false to enable.
    */
  def setDisabled(disabled: Boolean): Unit
}

object UiCanSetDisabledElement {
  @scala.inline
  def apply(setDisabled: Boolean => Callback): UiCanSetDisabledElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setDisabled")(js.Any.fromFunction1((t0: scala.Boolean) => setDisabled(t0).runNow()))
    __obj.asInstanceOf[UiCanSetDisabledElement]
  }
}

