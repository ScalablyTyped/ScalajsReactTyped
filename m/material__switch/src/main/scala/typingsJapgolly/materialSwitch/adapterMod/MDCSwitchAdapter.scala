package typingsJapgolly.materialSwitch.adapterMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCSwitchAdapter extends js.Object {
  /**
    * Adds a CSS class to the root element.
    */
  def addClass(className: String): Unit
  /**
    * Removes a CSS class from the root element.
    */
  def removeClass(className: String): Unit
  /**
    * Sets checked state of the native HTML control underlying the switch.
    */
  def setNativeControlChecked(checked: Boolean): Unit
  /**
    * Sets the disabled state of the native HTML control underlying the switch.
    */
  def setNativeControlDisabled(disabled: Boolean): Unit
}

object MDCSwitchAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    removeClass: String => Callback,
    setNativeControlChecked: Boolean => Callback,
    setNativeControlDisabled: Boolean => Callback
  ): MDCSwitchAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("setNativeControlChecked")(js.Any.fromFunction1((t0: scala.Boolean) => setNativeControlChecked(t0).runNow()))
    __obj.updateDynamic("setNativeControlDisabled")(js.Any.fromFunction1((t0: scala.Boolean) => setNativeControlDisabled(t0).runNow()))
    __obj.asInstanceOf[MDCSwitchAdapter]
  }
}

