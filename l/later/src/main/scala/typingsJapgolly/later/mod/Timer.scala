package typingsJapgolly.later.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  /**
    * Clear the timer and end execution.
    */
  def clear(): Unit
}

object Timer {
  @scala.inline
  def apply(clear: Callback): Timer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.asInstanceOf[Timer]
  }
}

