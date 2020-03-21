package typingsJapgolly.ranjs.mod._ts

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commons extends js.Object {
  def reset(): Unit
  def update(x: js.Array[Double]): Unit
}

object Commons {
  @scala.inline
  def apply(reset: Callback, update: js.Array[Double] => Callback): Commons = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => update(t0).runNow()))
    __obj.asInstanceOf[Commons]
  }
}

