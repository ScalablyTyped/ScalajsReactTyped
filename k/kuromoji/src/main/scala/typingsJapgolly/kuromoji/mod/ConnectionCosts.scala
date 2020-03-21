package typingsJapgolly.kuromoji.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionCosts extends js.Object {
  var buffer: scala.scalajs.js.typedarray.Int16Array
  def get(forward_id: Double, backward_id: Double): Double
  def loadConnectionCosts(connection_costs_buffer: scala.scalajs.js.typedarray.Int16Array): Unit
  def put(forward_id: Double, backward_id: Double, cost: Double): Unit
}

object ConnectionCosts {
  @scala.inline
  def apply(
    buffer: scala.scalajs.js.typedarray.Int16Array,
    get: (Double, Double) => CallbackTo[Double],
    loadConnectionCosts: scala.scalajs.js.typedarray.Int16Array => Callback,
    put: (Double, Double, Double) => Callback
  ): ConnectionCosts = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => get(t0, t1).runNow()))
    __obj.updateDynamic("loadConnectionCosts")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Int16Array) => loadConnectionCosts(t0).runNow()))
    __obj.updateDynamic("put")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => put(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ConnectionCosts]
  }
}

