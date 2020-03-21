package typingsJapgolly.synaptic.mod.Trainer

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ERGOptions extends js.Object {
  var cost: js.UndefOr[CostFunction] = js.undefined
  var error: js.UndefOr[Double] = js.undefined
  var iterations: js.UndefOr[Double] = js.undefined
  var log: js.UndefOr[Double] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
}

object ERGOptions {
  @scala.inline
  def apply(
    cost: (/* targetValues */ js.Array[Double], /* outputValues */ js.Array[Double]) => CallbackTo[Double] = null,
    error: Int | Double = null,
    iterations: Int | Double = null,
    log: Int | Double = null,
    rate: Int | Double = null
  ): ERGOptions = {
    val __obj = js.Dynamic.literal()
    if (cost != null) __obj.updateDynamic("cost")(js.Any.fromFunction2((t0: /* targetValues */ js.Array[scala.Double], t1: /* outputValues */ js.Array[scala.Double]) => cost(t0, t1).runNow()))
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ERGOptions]
  }
}

