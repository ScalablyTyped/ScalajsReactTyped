package typingsJapgolly.synaptic.mod.Trainer

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XOROptions extends js.Object {
  var cost: js.UndefOr[CostFunction] = js.undefined
  var iterations: js.UndefOr[Double] = js.undefined
  var log: js.UndefOr[Double] = js.undefined
  var shuffle: js.UndefOr[Boolean] = js.undefined
}

object XOROptions {
  @scala.inline
  def apply(
    cost: (/* targetValues */ js.Array[Double], /* outputValues */ js.Array[Double]) => CallbackTo[Double] = null,
    iterations: Int | Double = null,
    log: Int | Double = null,
    shuffle: js.UndefOr[Boolean] = js.undefined
  ): XOROptions = {
    val __obj = js.Dynamic.literal()
    if (cost != null) __obj.updateDynamic("cost")(js.Any.fromFunction2((t0: /* targetValues */ js.Array[scala.Double], t1: /* outputValues */ js.Array[scala.Double]) => cost(t0, t1).runNow()))
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (!js.isUndefined(shuffle)) __obj.updateDynamic("shuffle")(shuffle.asInstanceOf[js.Any])
    __obj.asInstanceOf[XOROptions]
  }
}

