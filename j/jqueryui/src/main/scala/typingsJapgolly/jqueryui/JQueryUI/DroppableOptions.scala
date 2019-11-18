package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DroppableOptions extends DroppableEvents {
  var accept: js.UndefOr[js.Any] = js.undefined
  var activeClass: js.UndefOr[String] = js.undefined
  var addClasses: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var greedy: js.UndefOr[Boolean] = js.undefined
  var hoverClass: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var tolerance: js.UndefOr[String] = js.undefined
}

object DroppableOptions {
  @scala.inline
  def apply(
    accept: js.Any = null,
    activate: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback = null,
    activeClass: String = null,
    addClasses: js.UndefOr[Boolean] = js.undefined,
    create: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback = null,
    deactivate: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    drop: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback = null,
    greedy: js.UndefOr[Boolean] = js.undefined,
    hoverClass: String = null,
    out: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback = null,
    over: (/* event */ JQueryEventObject, /* ui */ DroppableEventUIParam) => Callback = null,
    scope: String = null,
    tolerance: String = null
  ): DroppableOptions = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DroppableEventUIParam) => activate(t0, t1).runNow()))
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (!js.isUndefined(addClasses)) __obj.updateDynamic("addClasses")(addClasses.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DroppableEventUIParam) => create(t0, t1).runNow()))
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DroppableEventUIParam) => deactivate(t0, t1).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DroppableEventUIParam) => drop(t0, t1).runNow()))
    if (!js.isUndefined(greedy)) __obj.updateDynamic("greedy")(greedy.asInstanceOf[js.Any])
    if (hoverClass != null) __obj.updateDynamic("hoverClass")(hoverClass.asInstanceOf[js.Any])
    if (out != null) __obj.updateDynamic("out")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DroppableEventUIParam) => out(t0, t1).runNow()))
    if (over != null) __obj.updateDynamic("over")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DroppableEventUIParam) => over(t0, t1).runNow()))
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableOptions]
  }
}

