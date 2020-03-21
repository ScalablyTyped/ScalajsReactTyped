package typingsJapgolly.bootstrap3Dialog.BootstrapDialog

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogButtonInstance extends js.Object {
  /** Equals to $button.toggleEnable(false); */
  def disable(): Unit
  /** Equals to $button.toggleEnable(true); */
  def enable(): Unit
  /** Equals to $button.toggleSpin(true); */
  def spin(): Unit
  /** Equals to $button.toggleSpin(false); */
  def stopSpin(): Unit
  def toggleEnable(enabled: Boolean): Unit
  def toggleSpin(spin: Boolean): Unit
}

object DialogButtonInstance {
  @scala.inline
  def apply(
    disable: Callback,
    enable: Callback,
    spin: Callback,
    stopSpin: Callback,
    toggleEnable: Boolean => Callback,
    toggleSpin: Boolean => Callback
  ): DialogButtonInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.updateDynamic("spin")(spin.toJsFn)
    __obj.updateDynamic("stopSpin")(stopSpin.toJsFn)
    __obj.updateDynamic("toggleEnable")(js.Any.fromFunction1((t0: scala.Boolean) => toggleEnable(t0).runNow()))
    __obj.updateDynamic("toggleSpin")(js.Any.fromFunction1((t0: scala.Boolean) => toggleSpin(t0).runNow()))
    __obj.asInstanceOf[DialogButtonInstance]
  }
}

