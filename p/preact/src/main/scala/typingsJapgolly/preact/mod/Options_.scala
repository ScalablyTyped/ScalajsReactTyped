package typingsJapgolly.preact.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Event_
import typingsJapgolly.std.FrameRequestCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Preact options
// -----------------------------------
/**
	 * Global options for preact
	 */
trait Options_ extends js.Object {
  var __suspenseDidResolve: js.UndefOr[js.Function2[/* vnode */ VNode[js.Object], /* cb */ js.Function0[Unit], Unit]] = js.undefined
  var debounceRendering: js.UndefOr[js.Function1[/* cb */ js.Function0[Unit], Unit]] = js.undefined
  /** Attach a hook that is invoked after a vnode has rendered. */
  var diffed: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.undefined
  var event: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.undefined
  var requestAnimationFrame: js.UndefOr[js.Function1[/* callback */ FrameRequestCallback, Double]] = js.undefined
  /** Attach a hook that is invoked immediately before a vnode is unmounted. */
  var unmount: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.undefined
  var useDebugValue: js.UndefOr[js.Function1[/* value */ String | Double, Unit]] = js.undefined
  /** Attach a hook that is invoked whenever a VNode is created. */
  var vnode: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.undefined
}

object Options_ {
  @scala.inline
  def apply(
    __suspenseDidResolve: (/* vnode */ VNode[js.Object], /* cb */ js.Function0[Unit]) => Callback = null,
    debounceRendering: /* cb */ js.Function0[Unit] => Callback = null,
    diffed: /* vnode */ VNode[js.Object] => Callback = null,
    event: /* e */ Event_ => Callback = null,
    requestAnimationFrame: /* callback */ FrameRequestCallback => CallbackTo[Double] = null,
    unmount: /* vnode */ VNode[js.Object] => Callback = null,
    useDebugValue: /* value */ String | Double => Callback = null,
    vnode: /* vnode */ VNode[js.Object] => Callback = null
  ): Options_ = {
    val __obj = js.Dynamic.literal()
    if (__suspenseDidResolve != null) __obj.updateDynamic("__suspenseDidResolve")(js.Any.fromFunction2((t0: /* vnode */ typingsJapgolly.preact.mod.VNode[js.Object], t1: /* cb */ js.Function0[scala.Unit]) => __suspenseDidResolve(t0, t1).runNow()))
    if (debounceRendering != null) __obj.updateDynamic("debounceRendering")(js.Any.fromFunction1((t0: /* cb */ js.Function0[scala.Unit]) => debounceRendering(t0).runNow()))
    if (diffed != null) __obj.updateDynamic("diffed")(js.Any.fromFunction1((t0: /* vnode */ typingsJapgolly.preact.mod.VNode[js.Object]) => diffed(t0).runNow()))
    if (event != null) __obj.updateDynamic("event")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => event(t0).runNow()))
    if (requestAnimationFrame != null) __obj.updateDynamic("requestAnimationFrame")(js.Any.fromFunction1((t0: /* callback */ typingsJapgolly.std.FrameRequestCallback) => requestAnimationFrame(t0).runNow()))
    if (unmount != null) __obj.updateDynamic("unmount")(js.Any.fromFunction1((t0: /* vnode */ typingsJapgolly.preact.mod.VNode[js.Object]) => unmount(t0).runNow()))
    if (useDebugValue != null) __obj.updateDynamic("useDebugValue")(js.Any.fromFunction1((t0: /* value */ java.lang.String | scala.Double) => useDebugValue(t0).runNow()))
    if (vnode != null) __obj.updateDynamic("vnode")(js.Any.fromFunction1((t0: /* vnode */ typingsJapgolly.preact.mod.VNode[js.Object]) => vnode(t0).runNow()))
    __obj.asInstanceOf[Options_]
  }
}

