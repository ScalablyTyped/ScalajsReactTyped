package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteEvents extends js.Object {
  var change: js.UndefOr[AutocompleteEvent] = js.undefined
  var close: js.UndefOr[AutocompleteEvent] = js.undefined
  var create: js.UndefOr[AutocompleteEvent] = js.undefined
  var focus: js.UndefOr[AutocompleteEvent] = js.undefined
  var open: js.UndefOr[AutocompleteEvent] = js.undefined
  var response: js.UndefOr[AutocompleteEvent] = js.undefined
  var search: js.UndefOr[AutocompleteEvent] = js.undefined
  var select: js.UndefOr[AutocompleteEvent] = js.undefined
}

object AutocompleteEvents {
  @scala.inline
  def apply(
    change: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Callback = null,
    close: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Callback = null,
    create: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Callback = null,
    focus: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Callback = null,
    open: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Callback = null,
    response: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Callback = null,
    search: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Callback = null,
    select: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Callback = null
  ): AutocompleteEvents = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AutocompleteUIParams) => change(t0, t1).runNow()))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AutocompleteUIParams) => close(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AutocompleteUIParams) => create(t0, t1).runNow()))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AutocompleteUIParams) => focus(t0, t1).runNow()))
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AutocompleteUIParams) => open(t0, t1).runNow()))
    if (response != null) __obj.updateDynamic("response")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AutocompleteUIParams) => response(t0, t1).runNow()))
    if (search != null) __obj.updateDynamic("search")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AutocompleteUIParams) => search(t0, t1).runNow()))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AutocompleteUIParams) => select(t0, t1).runNow()))
    __obj.asInstanceOf[AutocompleteEvents]
  }
}

