package typingsJapgolly.seedrandom.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait seedRandomOptions extends js.Object {
  var entropy: js.UndefOr[Boolean] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var pass: js.UndefOr[seedrandomCallback] = js.undefined
  var state: js.UndefOr[Boolean | State] = js.undefined
}

object seedRandomOptions {
  @scala.inline
  def apply(
    entropy: js.UndefOr[Boolean] = js.undefined,
    global: js.UndefOr[Boolean] = js.undefined,
    pass: (/* prng */ js.UndefOr[prng], /* shortseed */ js.UndefOr[String], /* global */ js.UndefOr[Boolean], /* state */ js.UndefOr[State]) => CallbackTo[prng] = null,
    state: Boolean | State = null
  ): seedRandomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entropy)) __obj.updateDynamic("entropy")(entropy.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (pass != null) __obj.updateDynamic("pass")(js.Any.fromFunction4((t0: /* prng */ js.UndefOr[typingsJapgolly.seedrandom.mod.prng], t1: /* shortseed */ js.UndefOr[java.lang.String], t2: /* global */ js.UndefOr[scala.Boolean], t3: /* state */ js.UndefOr[typingsJapgolly.seedrandom.mod.State]) => pass(t0, t1, t2, t3).runNow()))
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[seedRandomOptions]
  }
}

