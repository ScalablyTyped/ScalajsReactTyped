package typingsJapgolly.random.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNG extends js.Object {
  var name: String
  def clone(seed: Double, opts: js.Object): RNG
  def next(): Double
  def seed(seed: Double, opts: js.Object): Unit
}

object RNG {
  @scala.inline
  def apply(
    clone: (Double, js.Object) => CallbackTo[RNG],
    name: String,
    next: CallbackTo[Double],
    seed: (Double, js.Object) => Callback
  ): RNG = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction2((t0: scala.Double, t1: js.Object) => clone(t0, t1).runNow()))
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("seed")(js.Any.fromFunction2((t0: scala.Double, t1: js.Object) => seed(t0, t1).runNow()))
    __obj.asInstanceOf[RNG]
  }
}

