package typingsJapgolly.reactTimeout.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactTimeoutProps extends js.Object {
  var cancelAnimationFrame: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.undefined
  var clearImmediate: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.undefined
  var clearInterval: js.UndefOr[js.Function1[/* id */ Id, Unit]] = js.undefined
  var clearTimeout: js.UndefOr[js.Function1[/* timer */ Timer, Unit]] = js.undefined
  var requestAnimationFrame: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Id]] = js.undefined
  var setImmediate: js.UndefOr[
    js.Function2[/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any, Id]
  ] = js.undefined
  var setInterval: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
      /* ms */ Double, 
      /* repeated */ js.Any, 
      Id
    ]
  ] = js.undefined
  var setTimeout: js.UndefOr[
    js.Function3[
      /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
      /* ms */ Double, 
      /* repeated */ js.Any, 
      Timer
    ]
  ] = js.undefined
}

object ReactTimeoutProps {
  @scala.inline
  def apply(
    cancelAnimationFrame: /* id */ Id => Callback = null,
    clearImmediate: /* id */ Id => Callback = null,
    clearInterval: /* id */ Id => Callback = null,
    clearTimeout: /* timer */ Timer => Callback = null,
    requestAnimationFrame: /* callback */ js.Function1[/* repeated */ js.Any, Unit] => CallbackTo[Id] = null,
    setImmediate: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any) => CallbackTo[Id] = null,
    setInterval: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* ms */ Double, /* repeated */ js.Any) => CallbackTo[Id] = null,
    setTimeout: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* ms */ Double, /* repeated */ js.Any) => CallbackTo[Timer] = null
  ): ReactTimeoutProps = {
    val __obj = js.Dynamic.literal()
    if (cancelAnimationFrame != null) __obj.updateDynamic("cancelAnimationFrame")(js.Any.fromFunction1((t0: /* id */ typingsJapgolly.reactTimeout.mod.Id) => cancelAnimationFrame(t0).runNow()))
    if (clearImmediate != null) __obj.updateDynamic("clearImmediate")(js.Any.fromFunction1((t0: /* id */ typingsJapgolly.reactTimeout.mod.Id) => clearImmediate(t0).runNow()))
    if (clearInterval != null) __obj.updateDynamic("clearInterval")(js.Any.fromFunction1((t0: /* id */ typingsJapgolly.reactTimeout.mod.Id) => clearInterval(t0).runNow()))
    if (clearTimeout != null) __obj.updateDynamic("clearTimeout")(js.Any.fromFunction1((t0: /* timer */ typingsJapgolly.reactTimeout.mod.Timer) => clearTimeout(t0).runNow()))
    if (requestAnimationFrame != null) __obj.updateDynamic("requestAnimationFrame")(js.Any.fromFunction1((t0: /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit]) => requestAnimationFrame(t0).runNow()))
    if (setImmediate != null) __obj.updateDynamic("setImmediate")(js.Any.fromFunction2((t0: /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], t1: /* repeated */ js.Any) => setImmediate(t0, t1).runNow()))
    if (setInterval != null) __obj.updateDynamic("setInterval")(js.Any.fromFunction3((t0: /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], t1: /* ms */ scala.Double, t2: /* repeated */ js.Any) => setInterval(t0, t1, t2).runNow()))
    if (setTimeout != null) __obj.updateDynamic("setTimeout")(js.Any.fromFunction3((t0: /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], t1: /* ms */ scala.Double, t2: /* repeated */ js.Any) => setTimeout(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ReactTimeoutProps]
  }
}

