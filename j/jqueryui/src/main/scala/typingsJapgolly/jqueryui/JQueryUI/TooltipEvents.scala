package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipEvents extends js.Object {
  var close: js.UndefOr[TooltipEvent] = js.undefined
  var open: js.UndefOr[TooltipEvent] = js.undefined
}

object TooltipEvents {
  @scala.inline
  def apply(
    close: (/* event */ JQueryEventObject, /* ui */ TooltipUIParams) => Callback = null,
    open: (/* event */ JQueryEventObject, /* ui */ TooltipUIParams) => Callback = null
  ): TooltipEvents = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.TooltipUIParams) => close(t0, t1).runNow()))
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.TooltipUIParams) => open(t0, t1).runNow()))
    __obj.asInstanceOf[TooltipEvents]
  }
}

