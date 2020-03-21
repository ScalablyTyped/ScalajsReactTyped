package typingsJapgolly.jqueryGridster

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridsterResizable extends js.Object {
  var axes: js.UndefOr[js.Array[String]] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var handle_append_to: js.UndefOr[String] = js.undefined
  var handle_class: js.UndefOr[String] = js.undefined
  var max_size: js.UndefOr[js.Array[Double]] = js.undefined
  var min_size: js.UndefOr[js.Array[Double]] = js.undefined
  var resize: js.UndefOr[js.Function3[/* event */ Event_, /* ui */ GridsterUi, /* $el */ JQuery, Unit]] = js.undefined
  var start: js.UndefOr[js.Function3[/* event */ Event_, /* ui */ AnonHelper, /* $el */ JQuery, Unit]] = js.undefined
  var stop: js.UndefOr[js.Function3[/* event */ Event_, /* ui */ AnonHelper, /* $el */ JQuery, Unit]] = js.undefined
}

object GridsterResizable {
  @scala.inline
  def apply(
    axes: js.Array[String] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    handle_append_to: String = null,
    handle_class: String = null,
    max_size: js.Array[Double] = null,
    min_size: js.Array[Double] = null,
    resize: (/* event */ Event_, /* ui */ GridsterUi, /* $el */ JQuery) => Callback = null,
    start: (/* event */ Event_, /* ui */ AnonHelper, /* $el */ JQuery) => Callback = null,
    stop: (/* event */ Event_, /* ui */ AnonHelper, /* $el */ JQuery) => Callback = null
  ): GridsterResizable = {
    val __obj = js.Dynamic.literal()
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (handle_append_to != null) __obj.updateDynamic("handle_append_to")(handle_append_to.asInstanceOf[js.Any])
    if (handle_class != null) __obj.updateDynamic("handle_class")(handle_class.asInstanceOf[js.Any])
    if (max_size != null) __obj.updateDynamic("max_size")(max_size.asInstanceOf[js.Any])
    if (min_size != null) __obj.updateDynamic("min_size")(min_size.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction3((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.jqueryGridster.GridsterUi, t2: /* $el */ typingsJapgolly.jqueryGridster.JQuery) => resize(t0, t1, t2).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction3((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.jqueryGridster.AnonHelper, t2: /* $el */ typingsJapgolly.jqueryGridster.JQuery) => start(t0, t1, t2).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction3((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.jqueryGridster.AnonHelper, t2: /* $el */ typingsJapgolly.jqueryGridster.JQuery) => stop(t0, t1, t2).runNow()))
    __obj.asInstanceOf[GridsterResizable]
  }
}

