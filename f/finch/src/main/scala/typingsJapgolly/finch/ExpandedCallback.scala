package typingsJapgolly.finch

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandedCallback extends js.Object {
  var load: js.UndefOr[FinchCallback] = js.undefined
  var setup: js.UndefOr[FinchCallback] = js.undefined
  var teardown: js.UndefOr[FinchCallback] = js.undefined
  var unload: js.UndefOr[FinchCallback] = js.undefined
}

object ExpandedCallback {
  @scala.inline
  def apply(
    load: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => CallbackTo[js.Any] = null,
    setup: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => CallbackTo[js.Any] = null,
    teardown: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => CallbackTo[js.Any] = null,
    unload: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => CallbackTo[js.Any] = null
  ): ExpandedCallback = {
    val __obj = js.Dynamic.literal()
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction2((t0: /* bindings */ js.UndefOr[js.Any], t1: /* childCallback */ js.UndefOr[js.Function0[scala.Unit]]) => load(t0, t1).runNow()))
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction2((t0: /* bindings */ js.UndefOr[js.Any], t1: /* childCallback */ js.UndefOr[js.Function0[scala.Unit]]) => setup(t0, t1).runNow()))
    if (teardown != null) __obj.updateDynamic("teardown")(js.Any.fromFunction2((t0: /* bindings */ js.UndefOr[js.Any], t1: /* childCallback */ js.UndefOr[js.Function0[scala.Unit]]) => teardown(t0, t1).runNow()))
    if (unload != null) __obj.updateDynamic("unload")(js.Any.fromFunction2((t0: /* bindings */ js.UndefOr[js.Any], t1: /* childCallback */ js.UndefOr[js.Function0[scala.Unit]]) => unload(t0, t1).runNow()))
    __obj.asInstanceOf[ExpandedCallback]
  }
}

