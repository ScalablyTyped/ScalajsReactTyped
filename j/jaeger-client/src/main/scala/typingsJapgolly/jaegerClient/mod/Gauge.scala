package typingsJapgolly.jaegerClient.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gauge extends js.Object {
  // Update the gauge to the value passed in.
  def update(value: Double): Unit
}

object Gauge {
  @scala.inline
  def apply(update: Double => Callback): Gauge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: scala.Double) => update(t0).runNow()))
    __obj.asInstanceOf[Gauge]
  }
}

