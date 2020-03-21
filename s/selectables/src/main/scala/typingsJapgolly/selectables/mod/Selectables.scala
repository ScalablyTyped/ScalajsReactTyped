package typingsJapgolly.selectables.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selectables extends js.Object {
  var options: Options
  def disable(): Unit
  def enable(): Unit
}

object Selectables {
  @scala.inline
  def apply(disable: Callback, enable: Callback, options: Options): Selectables = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("enable")(enable.toJsFn)
    __obj.asInstanceOf[Selectables]
  }
}

