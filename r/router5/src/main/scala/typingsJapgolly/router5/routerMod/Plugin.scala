package typingsJapgolly.router5.routerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.router5.baseMod.NavigationOptions
import typingsJapgolly.router5.baseMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTransitionCancel: js.UndefOr[
    js.Function2[/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], Unit]
  ] = js.undefined
  var onTransitionError: js.UndefOr[
    js.Function3[
      /* toState */ js.UndefOr[State], 
      /* fromState */ js.UndefOr[State], 
      /* err */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var onTransitionStart: js.UndefOr[
    js.Function2[/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], Unit]
  ] = js.undefined
  var onTransitionSuccess: js.UndefOr[
    js.Function3[
      /* toState */ js.UndefOr[State], 
      /* fromState */ js.UndefOr[State], 
      /* opts */ js.UndefOr[NavigationOptions], 
      Unit
    ]
  ] = js.undefined
  var teardown: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Plugin {
  @scala.inline
  def apply(
    onStart: js.UndefOr[Callback] = js.undefined,
    onStop: js.UndefOr[Callback] = js.undefined,
    onTransitionCancel: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State]) => Callback = null,
    onTransitionError: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], /* err */ js.UndefOr[js.Any]) => Callback = null,
    onTransitionStart: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State]) => Callback = null,
    onTransitionSuccess: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], /* opts */ js.UndefOr[NavigationOptions]) => Callback = null,
    teardown: js.UndefOr[Callback] = js.undefined
  ): Plugin = {
    val __obj = js.Dynamic.literal()
    onStart.foreach(p => __obj.updateDynamic("onStart")(p.toJsFn))
    onStop.foreach(p => __obj.updateDynamic("onStop")(p.toJsFn))
    if (onTransitionCancel != null) __obj.updateDynamic("onTransitionCancel")(js.Any.fromFunction2((t0: /* toState */ js.UndefOr[typingsJapgolly.router5.baseMod.State], t1: /* fromState */ js.UndefOr[typingsJapgolly.router5.baseMod.State]) => onTransitionCancel(t0, t1).runNow()))
    if (onTransitionError != null) __obj.updateDynamic("onTransitionError")(js.Any.fromFunction3((t0: /* toState */ js.UndefOr[typingsJapgolly.router5.baseMod.State], t1: /* fromState */ js.UndefOr[typingsJapgolly.router5.baseMod.State], t2: /* err */ js.UndefOr[js.Any]) => onTransitionError(t0, t1, t2).runNow()))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction2((t0: /* toState */ js.UndefOr[typingsJapgolly.router5.baseMod.State], t1: /* fromState */ js.UndefOr[typingsJapgolly.router5.baseMod.State]) => onTransitionStart(t0, t1).runNow()))
    if (onTransitionSuccess != null) __obj.updateDynamic("onTransitionSuccess")(js.Any.fromFunction3((t0: /* toState */ js.UndefOr[typingsJapgolly.router5.baseMod.State], t1: /* fromState */ js.UndefOr[typingsJapgolly.router5.baseMod.State], t2: /* opts */ js.UndefOr[typingsJapgolly.router5.baseMod.NavigationOptions]) => onTransitionSuccess(t0, t1, t2).runNow()))
    teardown.foreach(p => __obj.updateDynamic("teardown")(p.toJsFn))
    __obj.asInstanceOf[Plugin]
  }
}

