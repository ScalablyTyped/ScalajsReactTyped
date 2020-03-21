package typingsJapgolly.navigo.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigoHooks extends js.Object {
  var after: js.UndefOr[js.Function1[/* params */ js.UndefOr[Params], Unit]] = js.undefined
  var already: js.UndefOr[js.Function1[/* params */ js.UndefOr[Params], Unit]] = js.undefined
  var before: js.UndefOr[
    js.Function2[
      /* done */ js.Function1[/* suppress */ js.UndefOr[Boolean], Unit], 
      /* params */ js.UndefOr[Params], 
      Unit
    ]
  ] = js.undefined
  var leave: js.UndefOr[js.Function1[/* params */ js.UndefOr[Params], Unit]] = js.undefined
}

object NavigoHooks {
  @scala.inline
  def apply(
    after: /* params */ js.UndefOr[Params] => Callback = null,
    already: /* params */ js.UndefOr[Params] => Callback = null,
    before: (/* done */ js.Function1[/* suppress */ js.UndefOr[Boolean], Unit], /* params */ js.UndefOr[Params]) => Callback = null,
    leave: /* params */ js.UndefOr[Params] => Callback = null
  ): NavigoHooks = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[typingsJapgolly.navigo.mod.Params]) => after(t0).runNow()))
    if (already != null) __obj.updateDynamic("already")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[typingsJapgolly.navigo.mod.Params]) => already(t0).runNow()))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2((t0: /* done */ js.Function1[/* suppress */ js.UndefOr[scala.Boolean], scala.Unit], t1: /* params */ js.UndefOr[typingsJapgolly.navigo.mod.Params]) => before(t0, t1).runNow()))
    if (leave != null) __obj.updateDynamic("leave")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[typingsJapgolly.navigo.mod.Params]) => leave(t0).runNow()))
    __obj.asInstanceOf[NavigoHooks]
  }
}

