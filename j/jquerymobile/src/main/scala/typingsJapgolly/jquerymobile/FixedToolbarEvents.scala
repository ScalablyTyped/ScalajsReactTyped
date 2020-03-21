package typingsJapgolly.jquerymobile

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedToolbarEvents extends js.Object {
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
}

object FixedToolbarEvents {
  @scala.inline
  def apply(create: (/* event */ Event_, /* ui */ js.Any) => Callback = null): FixedToolbarEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ js.Any) => create(t0, t1).runNow()))
    __obj.asInstanceOf[FixedToolbarEvents]
  }
}

