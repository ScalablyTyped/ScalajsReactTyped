package typingsJapgolly.useDarkMode.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DarkMode extends js.Object {
  val value: Boolean
  def disable(): Unit
  def enable(): Unit
  def toggle(): Unit
}

object DarkMode {
  @scala.inline
  def apply(disable: Callback, enable: Callback, toggle: Callback, value: Boolean): DarkMode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.asInstanceOf[DarkMode]
  }
}

