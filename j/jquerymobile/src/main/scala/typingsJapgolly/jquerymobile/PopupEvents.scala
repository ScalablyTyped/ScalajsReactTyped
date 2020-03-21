package typingsJapgolly.jquerymobile

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupEvents extends js.Object {
  var popupafterclose: js.UndefOr[JQueryMobileEvent] = js.undefined
  var popupafteropen: js.UndefOr[JQueryMobileEvent] = js.undefined
  var popupbeforeposition: js.UndefOr[JQueryMobileEvent] = js.undefined
}

object PopupEvents {
  @scala.inline
  def apply(
    popupafterclose: (/* event */ Event_, /* ui */ js.Any) => Callback = null,
    popupafteropen: (/* event */ Event_, /* ui */ js.Any) => Callback = null,
    popupbeforeposition: (/* event */ Event_, /* ui */ js.Any) => Callback = null
  ): PopupEvents = {
    val __obj = js.Dynamic.literal()
    if (popupafterclose != null) __obj.updateDynamic("popupafterclose")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ js.Any) => popupafterclose(t0, t1).runNow()))
    if (popupafteropen != null) __obj.updateDynamic("popupafteropen")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ js.Any) => popupafteropen(t0, t1).runNow()))
    if (popupbeforeposition != null) __obj.updateDynamic("popupbeforeposition")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ js.Any) => popupbeforeposition(t0, t1).runNow()))
    __obj.asInstanceOf[PopupEvents]
  }
}

