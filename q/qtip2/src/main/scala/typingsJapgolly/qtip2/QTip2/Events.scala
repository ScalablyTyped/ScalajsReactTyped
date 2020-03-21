package typingsJapgolly.qtip2.QTip2

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Events property
	 */
trait Events extends js.Object {
  var blur: js.UndefOr[EventApiFunc] = js.undefined
  var focus: js.UndefOr[EventApiFunc] = js.undefined
  var hidden: js.UndefOr[EventApiFunc] = js.undefined
  var hide: js.UndefOr[EventApiFunc] = js.undefined
  var move: js.UndefOr[EventApiFunc] = js.undefined
  var render: js.UndefOr[EventApiFunc] = js.undefined
  var show: js.UndefOr[EventApiFunc] = js.undefined
  var toggle: js.UndefOr[EventApiFunc] = js.undefined
  var visible: js.UndefOr[EventApiFunc] = js.undefined
}

object Events {
  @scala.inline
  def apply(
    blur: (/* event */ Event_, /* api */ Api) => Callback = null,
    focus: (/* event */ Event_, /* api */ Api) => Callback = null,
    hidden: (/* event */ Event_, /* api */ Api) => Callback = null,
    hide: (/* event */ Event_, /* api */ Api) => Callback = null,
    move: (/* event */ Event_, /* api */ Api) => Callback = null,
    render: (/* event */ Event_, /* api */ Api) => Callback = null,
    show: (/* event */ Event_, /* api */ Api) => Callback = null,
    toggle: (/* event */ Event_, /* api */ Api) => Callback = null,
    visible: (/* event */ Event_, /* api */ Api) => Callback = null
  ): Events = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* api */ typingsJapgolly.qtip2.QTip2.Api) => blur(t0, t1).runNow()))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* api */ typingsJapgolly.qtip2.QTip2.Api) => focus(t0, t1).runNow()))
    if (hidden != null) __obj.updateDynamic("hidden")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* api */ typingsJapgolly.qtip2.QTip2.Api) => hidden(t0, t1).runNow()))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* api */ typingsJapgolly.qtip2.QTip2.Api) => hide(t0, t1).runNow()))
    if (move != null) __obj.updateDynamic("move")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* api */ typingsJapgolly.qtip2.QTip2.Api) => move(t0, t1).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* api */ typingsJapgolly.qtip2.QTip2.Api) => render(t0, t1).runNow()))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* api */ typingsJapgolly.qtip2.QTip2.Api) => show(t0, t1).runNow()))
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* api */ typingsJapgolly.qtip2.QTip2.Api) => toggle(t0, t1).runNow()))
    if (visible != null) __obj.updateDynamic("visible")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* api */ typingsJapgolly.qtip2.QTip2.Api) => visible(t0, t1).runNow()))
    __obj.asInstanceOf[Events]
  }
}

