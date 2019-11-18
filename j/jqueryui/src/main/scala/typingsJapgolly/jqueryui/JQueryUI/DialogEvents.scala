package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogEvents extends js.Object {
  var beforeClose: js.UndefOr[DialogEvent] = js.undefined
  var close: js.UndefOr[DialogEvent] = js.undefined
  var create: js.UndefOr[DialogEvent] = js.undefined
  var drag: js.UndefOr[DialogEvent] = js.undefined
  var dragStart: js.UndefOr[DialogEvent] = js.undefined
  var dragStop: js.UndefOr[DialogEvent] = js.undefined
  var focus: js.UndefOr[DialogEvent] = js.undefined
  var open: js.UndefOr[DialogEvent] = js.undefined
  var resize: js.UndefOr[DialogEvent] = js.undefined
  var resizeStart: js.UndefOr[DialogEvent] = js.undefined
  var resizeStop: js.UndefOr[DialogEvent] = js.undefined
}

object DialogEvents {
  @scala.inline
  def apply(
    beforeClose: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Callback = null,
    close: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Callback = null,
    create: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Callback = null,
    drag: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Callback = null,
    dragStart: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Callback = null,
    dragStop: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Callback = null,
    focus: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Callback = null,
    open: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Callback = null,
    resize: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Callback = null,
    resizeStart: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Callback = null,
    resizeStop: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Callback = null
  ): DialogEvents = {
    val __obj = js.Dynamic.literal()
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DialogUIParams) => beforeClose(t0, t1).runNow()))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DialogUIParams) => close(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DialogUIParams) => create(t0, t1).runNow()))
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DialogUIParams) => drag(t0, t1).runNow()))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DialogUIParams) => dragStart(t0, t1).runNow()))
    if (dragStop != null) __obj.updateDynamic("dragStop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DialogUIParams) => dragStop(t0, t1).runNow()))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DialogUIParams) => focus(t0, t1).runNow()))
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DialogUIParams) => open(t0, t1).runNow()))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DialogUIParams) => resize(t0, t1).runNow()))
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DialogUIParams) => resizeStart(t0, t1).runNow()))
    if (resizeStop != null) __obj.updateDynamic("resizeStop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.DialogUIParams) => resizeStop(t0, t1).runNow()))
    __obj.asInstanceOf[DialogEvents]
  }
}

