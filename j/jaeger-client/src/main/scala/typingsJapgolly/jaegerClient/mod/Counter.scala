package typingsJapgolly.jaegerClient.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Counter extends js.Object {
  // Adds the given value to the counter.
  def increment(delta: Double): Unit
}

object Counter {
  @scala.inline
  def apply(increment: Double => Callback): Counter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("increment")(js.Any.fromFunction1((t0: scala.Double) => increment(t0).runNow()))
    __obj.asInstanceOf[Counter]
  }
}

