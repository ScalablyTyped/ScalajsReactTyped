package typingsJapgolly.jquerymobile

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderEvents extends js.Object {
  var create: js.UndefOr[JQueryMobileEvent] = js.undefined
  var slidestart: js.UndefOr[JQueryMobileEvent] = js.undefined
  var slidestop: js.UndefOr[JQueryMobileEvent] = js.undefined
}

object SliderEvents {
  @scala.inline
  def apply(
    create: (/* event */ Event_, /* ui */ js.Any) => Callback = null,
    slidestart: (/* event */ Event_, /* ui */ js.Any) => Callback = null,
    slidestop: (/* event */ Event_, /* ui */ js.Any) => Callback = null
  ): SliderEvents = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ js.Any) => create(t0, t1).runNow()))
    if (slidestart != null) __obj.updateDynamic("slidestart")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ js.Any) => slidestart(t0, t1).runNow()))
    if (slidestop != null) __obj.updateDynamic("slidestop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ js.Any) => slidestop(t0, t1).runNow()))
    __obj.asInstanceOf[SliderEvents]
  }
}

