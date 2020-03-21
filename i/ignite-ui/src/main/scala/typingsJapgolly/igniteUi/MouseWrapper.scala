package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseWrapper
  extends /**
	 * Option for mouseWrapper
	 */
/* optionName */ StringDictionary[js.Any] {
  var cancel: js.UndefOr[String] = js.undefined
  var capture: js.UndefOr[CaptureEvent] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var drag: js.UndefOr[DragEvent] = js.undefined
  var start: js.UndefOr[StartEvent] = js.undefined
  var stop: js.UndefOr[StopEvent] = js.undefined
}

object MouseWrapper {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for mouseWrapper
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    cancel: String = null,
    capture: (/* event */ Event_, /* ui */ CaptureEventUIParam) => Callback = null,
    delay: Int | Double = null,
    distance: Int | Double = null,
    drag: (/* event */ Event_, /* ui */ DragEventUIParam) => Callback = null,
    start: (/* event */ Event_, /* ui */ StartEventUIParam) => Callback = null,
    stop: (/* event */ Event_, /* ui */ StopEventUIParam) => Callback = null
  ): MouseWrapper = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.CaptureEventUIParam) => capture(t0, t1).runNow()))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.DragEventUIParam) => drag(t0, t1).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.StartEventUIParam) => start(t0, t1).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.StopEventUIParam) => stop(t0, t1).runNow()))
    __obj.asInstanceOf[MouseWrapper]
  }
}

