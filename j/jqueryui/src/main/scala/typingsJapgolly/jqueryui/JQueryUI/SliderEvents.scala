package typingsJapgolly.jqueryui.JQueryUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderEvents extends js.Object {
  var change: js.UndefOr[SliderEvent] = js.undefined
  var create: js.UndefOr[SliderEvent] = js.undefined
  var slide: js.UndefOr[SliderEvent] = js.undefined
  var start: js.UndefOr[SliderEvent] = js.undefined
  var stop: js.UndefOr[SliderEvent] = js.undefined
}

object SliderEvents {
  @scala.inline
  def apply(
    change: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Callback = null,
    create: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Callback = null,
    slide: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Callback = null,
    start: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Callback = null,
    stop: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Callback = null
  ): SliderEvents = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SliderUIParams) => change(t0, t1).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SliderUIParams) => create(t0, t1).runNow()))
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SliderUIParams) => slide(t0, t1).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SliderUIParams) => start(t0, t1).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.jquery.JQueryEventObject, t1: /* ui */ typingsJapgolly.jqueryui.JQueryUI.SliderUIParams) => stop(t0, t1).runNow()))
    __obj.asInstanceOf[SliderEvents]
  }
}

