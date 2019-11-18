package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionEvents extends js.Object {
  var activate: js.UndefOr[AccordionEvent] = js.undefined
  var beforeActivate: js.UndefOr[AccordionEvent] = js.undefined
  var create: js.UndefOr[AccordionEvent] = js.undefined
}

object AccordionEvents {
  @scala.inline
  def apply(
    activate: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Callback = null,
    beforeActivate: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Callback = null,
    create: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Callback = null
  ): AccordionEvents = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AccordionUIParams) => activate(t0, t1).runNow()))
    if (beforeActivate != null) __obj.updateDynamic("beforeActivate")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AccordionUIParams) => beforeActivate(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.AccordionUIParams) => create(t0, t1).runNow()))
    __obj.asInstanceOf[AccordionEvents]
  }
}

