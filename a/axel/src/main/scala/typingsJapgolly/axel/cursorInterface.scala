package typingsJapgolly.axel

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cursorInterface extends js.Object {
  def off(): Unit
  def on(): Unit
  def reset(): Unit
  def restore(): Unit
}

object cursorInterface {
  @scala.inline
  def apply(off: Callback, on: Callback, reset: Callback, restore: Callback): cursorInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("off")(off.toJsFn)
    __obj.updateDynamic("on")(on.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("restore")(restore.toJsFn)
    __obj.asInstanceOf[cursorInterface]
  }
}

