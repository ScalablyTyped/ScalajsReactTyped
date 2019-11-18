package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Autocomplete //////////////////////////////////////////////////
trait AutocompleteOptions extends AutocompleteEvents {
  var appendTo: js.UndefOr[js.Any] = js.undefined
   //Selector;
  var autoFocus: js.UndefOr[Boolean] = js.undefined
   // [], string or ()
  var classes: js.UndefOr[AutocompleteClasses] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[js.Any] = js.undefined
   // object
  var source: js.UndefOr[js.Any] = js.undefined
}

object AutocompleteOptions {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    change: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Callback = null,
    classes: AutocompleteClasses = null,
    close: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Callback = null,
    create: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Callback = null,
    delay: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focus: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Callback = null,
    minLength: Int | Double = null,
    open: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Callback = null,
    position: js.Any = null,
    response: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Callback = null,
    search: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Callback = null,
    select: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Callback = null,
    source: js.Any = null
  ): AutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AutocompleteUIParams) => change(t0, t1).runNow()))
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AutocompleteUIParams) => close(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AutocompleteUIParams) => create(t0, t1).runNow()))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AutocompleteUIParams) => focus(t0, t1).runNow()))
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AutocompleteUIParams) => open(t0, t1).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AutocompleteUIParams) => response(t0, t1).runNow()))
    if (search != null) __obj.updateDynamic("search")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AutocompleteUIParams) => search(t0, t1).runNow()))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AutocompleteUIParams) => select(t0, t1).runNow()))
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteOptions]
  }
}

