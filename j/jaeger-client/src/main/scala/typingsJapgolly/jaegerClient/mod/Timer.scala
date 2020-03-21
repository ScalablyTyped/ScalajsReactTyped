package typingsJapgolly.jaegerClient.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  // Records the time passed in.
  def record(value: Double): Unit
}

object Timer {
  @scala.inline
  def apply(record: Double => Callback): Timer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("record")(js.Any.fromFunction1((t0: scala.Double) => record(t0).runNow()))
    __obj.asInstanceOf[Timer]
  }
}

