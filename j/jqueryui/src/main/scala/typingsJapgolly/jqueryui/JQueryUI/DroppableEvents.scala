package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableEvents extends js.Object {
  var activate: js.UndefOr[DroppableEvent] = js.undefined
  var create: js.UndefOr[DroppableEvent] = js.undefined
  var deactivate: js.UndefOr[DroppableEvent] = js.undefined
  var drop: js.UndefOr[DroppableEvent] = js.undefined
  var out: js.UndefOr[DroppableEvent] = js.undefined
  var over: js.UndefOr[DroppableEvent] = js.undefined
}

object DroppableEvents {
  @scala.inline
  def apply(
    activate: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback = null,
    create: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback = null,
    deactivate: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback = null,
    drop: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback = null,
    out: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback = null,
    over: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback = null
  ): DroppableEvents = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DroppableEventUIParam) => activate(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DroppableEventUIParam) => create(t0, t1).runNow()))
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DroppableEventUIParam) => deactivate(t0, t1).runNow()))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DroppableEventUIParam) => drop(t0, t1).runNow()))
    if (out != null) __obj.updateDynamic("out")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DroppableEventUIParam) => out(t0, t1).runNow()))
    if (over != null) __obj.updateDynamic("over")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DroppableEventUIParam) => over(t0, t1).runNow()))
    __obj.asInstanceOf[DroppableEvents]
  }
}

