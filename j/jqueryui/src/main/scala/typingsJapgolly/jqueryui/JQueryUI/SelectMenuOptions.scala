package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// SelectMenu //////////////////////////////////////////////////
trait SelectMenuOptions extends SelectMenuEvents {
  var appendTo: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var position: js.UndefOr[JQueryPositionOptions] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SelectMenuOptions {
  @scala.inline
  def apply(
    appendTo: String = null,
    change: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Callback = null,
    close: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Callback = null,
    create: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Callback = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focus: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Callback = null,
    icons: js.Any = null,
    open: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Callback = null,
    position: JQueryPositionOptions = null,
    select: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Callback = null,
    width: Int | Double = null
  ): SelectMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SelectMenuUIParams) => change(t0, t1).runNow()))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SelectMenuUIParams) => close(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SelectMenuUIParams) => create(t0, t1).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SelectMenuUIParams) => focus(t0, t1).runNow()))
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SelectMenuUIParams) => open(t0, t1).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SelectMenuUIParams) => select(t0, t1).runNow()))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectMenuOptions]
  }
}

