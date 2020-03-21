package typingsJapgolly.reactCountup

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStart extends js.Object {
  def reset(): Unit
  def start(): Unit
  def update(): Unit
}

object AnonStart {
  @scala.inline
  def apply(reset: Callback, start: Callback, update: Callback): AnonStart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[AnonStart]
  }
}

