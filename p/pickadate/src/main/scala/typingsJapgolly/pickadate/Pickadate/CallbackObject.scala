package typingsJapgolly.pickadate.Pickadate

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackObject extends js.Object {
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  var open: js.UndefOr[js.Function0[Unit]] = js.undefined
  var render: js.UndefOr[js.Function0[Unit]] = js.undefined
  var set: js.UndefOr[js.Function1[/* thingSet */ js.Any, Unit]] = js.undefined
  var start: js.UndefOr[js.Function0[Unit]] = js.undefined
  var stop: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object CallbackObject {
  @scala.inline
  def apply(
    close: js.UndefOr[Callback] = js.undefined,
    open: js.UndefOr[Callback] = js.undefined,
    render: js.UndefOr[Callback] = js.undefined,
    set: /* thingSet */ js.Any => Callback = null,
    start: js.UndefOr[Callback] = js.undefined,
    stop: js.UndefOr[Callback] = js.undefined
  ): CallbackObject = {
    val __obj = js.Dynamic.literal()
    close.foreach(p => __obj.updateDynamic("close")(p.toJsFn))
    open.foreach(p => __obj.updateDynamic("open")(p.toJsFn))
    render.foreach(p => __obj.updateDynamic("render")(p.toJsFn))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1((t0: /* thingSet */ js.Any) => set(t0).runNow()))
    start.foreach(p => __obj.updateDynamic("start")(p.toJsFn))
    stop.foreach(p => __obj.updateDynamic("stop")(p.toJsFn))
    __obj.asInstanceOf[CallbackObject]
  }
}

