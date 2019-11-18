package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressbarEvents extends js.Object {
  var change: js.UndefOr[ProgressbarEvent] = js.undefined
  var complete: js.UndefOr[ProgressbarEvent] = js.undefined
  var create: js.UndefOr[ProgressbarEvent] = js.undefined
}

object ProgressbarEvents {
  @scala.inline
  def apply(
    change: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Callback = null,
    complete: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Callback = null,
    create: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Callback = null
  ): ProgressbarEvents = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.ProgressbarUIParams) => change(t0, t1).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.ProgressbarUIParams) => complete(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.ProgressbarUIParams) => create(t0, t1).runNow()))
    __obj.asInstanceOf[ProgressbarEvents]
  }
}

