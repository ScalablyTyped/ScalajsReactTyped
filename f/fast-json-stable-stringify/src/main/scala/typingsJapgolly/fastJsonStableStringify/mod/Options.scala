package typingsJapgolly.fastJsonStableStringify.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cmp: js.UndefOr[js.Function2[/* a */ CompareDescriptor, /* b */ CompareDescriptor, Double]] = js.undefined
  var cycles: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cmp: (/* a */ CompareDescriptor, /* b */ CompareDescriptor) => CallbackTo[Double] = null,
    cycles: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cmp != null) __obj.updateDynamic("cmp")(js.Any.fromFunction2((t0: /* a */ typingsJapgolly.fastJsonStableStringify.mod.CompareDescriptor, t1: /* b */ typingsJapgolly.fastJsonStableStringify.mod.CompareDescriptor) => cmp(t0, t1).runNow()))
    if (!js.isUndefined(cycles)) __obj.updateDynamic("cycles")(cycles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

