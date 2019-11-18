package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizableEvents extends js.Object {
  var create: js.UndefOr[ResizableEvent] = js.undefined
  var resize: js.UndefOr[ResizableEvent] = js.undefined
  var start: js.UndefOr[ResizableEvent] = js.undefined
  var stop: js.UndefOr[ResizableEvent] = js.undefined
}

object ResizableEvents {
  @scala.inline
  def apply(
    create: (/* event */ JQueryEventObject, /* ui */ ResizableUIParams) => Callback = null,
    resize: (/* event */ JQueryEventObject, /* ui */ ResizableUIParams) => Callback = null,
    start: (/* event */ JQueryEventObject, /* ui */ ResizableUIParams) => Callback = null,
    stop: (/* event */ JQueryEventObject, /* ui */ ResizableUIParams) => Callback = null
  ): ResizableEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.ResizableUIParams) => create(t0, t1).runNow()))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.ResizableUIParams) => resize(t0, t1).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.ResizableUIParams) => start(t0, t1).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.ResizableUIParams) => stop(t0, t1).runNow()))
    __obj.asInstanceOf[ResizableEvents]
  }
}

