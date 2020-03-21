package typingsJapgolly.jquerymobile

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleEvents extends js.Object {
  var collapse: js.UndefOr[JQueryMobileEvent] = js.undefined
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
  var expand: js.UndefOr[JQueryMobileEvent] = js.undefined
}

object CollapsibleEvents {
  @scala.inline
  def apply(
    collapse: (/* event */ Event_, /* ui */ js.Any) => Callback = null,
    create: (/* event */ Event_, /* ui */ js.Any) => Callback = null,
    expand: (/* event */ Event_, /* ui */ js.Any) => Callback = null
  ): CollapsibleEvents = {
    val __obj = js.Dynamic.literal()
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ js.Any) => collapse(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ js.Any) => create(t0, t1).runNow()))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ js.Any) => expand(t0, t1).runNow()))
    __obj.asInstanceOf[CollapsibleEvents]
  }
}

