package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectMenuEvents extends js.Object {
  var change: js.UndefOr[SelectMenuEvent] = js.undefined
  var close: js.UndefOr[SelectMenuEvent] = js.undefined
  var create: js.UndefOr[SelectMenuEvent] = js.undefined
  var focus: js.UndefOr[SelectMenuEvent] = js.undefined
  var open: js.UndefOr[SelectMenuEvent] = js.undefined
  var select: js.UndefOr[SelectMenuEvent] = js.undefined
}

object SelectMenuEvents {
  @scala.inline
  def apply(
    change: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Callback = null,
    close: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Callback = null,
    create: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Callback = null,
    focus: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Callback = null,
    open: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Callback = null,
    select: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Callback = null
  ): SelectMenuEvents = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SelectMenuUIParams) => change(t0, t1).runNow()))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SelectMenuUIParams) => close(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SelectMenuUIParams) => create(t0, t1).runNow()))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SelectMenuUIParams) => focus(t0, t1).runNow()))
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SelectMenuUIParams) => open(t0, t1).runNow()))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SelectMenuUIParams) => select(t0, t1).runNow()))
    __obj.asInstanceOf[SelectMenuEvents]
  }
}

